package agh.edu.pl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static FileReader in;
    static FileWriter out;

    static void identyfikatory(String ciag) throws IOException {
        switch(ciag){
            case "if": out.write("<symif>"+ciag+"</symif>"); break;
            case "while": out.write("<symwhile>"+ciag+"</symwhile>"); break;
            case "else": out.write("<symelse>"+ciag+"</symelse>"); break;
            case "for": out.write("<symfor>"+ciag+"</symfor>"); break;
            case "do": out.write("<symdo>"+ciag+"</symdo>"); break;
            case "return": out.write("<symreturn>"+ciag+"</symreturn>"); break;
            case "and": out.write("<symand>"+ciag+"</symand>"); break;
            case "or": out.write("<symor>"+ciag+"</symor>"); break;
            case "not": out.write("<symnot>"+ciag+"</symnot>"); break;
            default: out.write("<identyfikator>"+ciag+"</identyfikator>");
        }
    }


    static void sprawdzaj(int znak) throws Exception {
        if(znak < 0) return;
        String ciag = ""+(char)znak;

        //biale znaki
        if((char)znak == ' ' || (char)znak == '\n' || (char)znak == '\t' || znak < 30){
            //koniec lini zapisywany dwoma znakami
            if((char)znak != ' ' && (char)znak != '\t'){in.read();out.write("\n"+"<br>");}
             sprawdzaj((char)in.read());
        }
        //liczby
        else if( znak >= '0' && znak <= '9'){
            int liczba;
            char litera;
            int flaga=0;
            while((liczba = in.read()) > 0){
                litera = (char) liczba;
                if (litera=='.'){
/*                    if(flaga==false) {
                        flaga = true;
                    } else {
                        //flaga=false;
                        //throw new Exception("Niepoprawna liczba"){};
                    }*/
                    flaga++;
                }else if(litera < '0' || litera > '9'){
                    if (flaga<=1){
                        out.write("<liczba>"+ciag+"</liczba>");
                        sprawdzaj(litera);
                        return;
                    }else{
                        System.out.println("Niepoprawna liczba " + ciag);
                        out.write("<blad>"+ciag+"</blad>");
                        sprawdzaj(litera);
                        return;
                    }
                }
                ciag +=litera;
            }
            out.write("<liczba>"+ciag+"</liczba>");
        }
        //identyfikatory
        else if( (znak >= 'a' && znak <= 'z') || (znak >= 'A' && znak <= 'Z')){
            //System.out.println(znak);
            int liczba;
            char litera;
            while((liczba = in.read()) > 0){
                litera = (char) liczba;
                //System.out.println(litera);
                if(!((litera >= 'a' && litera <= 'z') || (litera >= 'A' && litera <= 'Z') || (litera >= '0' && litera <= '9'))){

                    identyfikatory(ciag);
                    sprawdzaj(litera);
                    return;
                }
                ciag +=litera;

            }
            identyfikatory(ciag);
        }
        //=
        else if(znak == '='){
            int liczba;
            if((liczba = in.read()) == '='){
                out.write("<symprzypisanie>"+"=="+"</symprzypisanie>");
                liczba = in.read();
                sprawdzaj(liczba);
                return;
            } else {
                out.write("<symrownosc>"+"="+"</symrownosc>");
                sprawdzaj(liczba);
                return;
            }
        }
        //string
        else if(znak == '\"'){
            int liczba;
            while((liczba = in.read()) > 0){
                char litera = (char) liczba;
                if(litera == '\"'){

                    out.write("<string>"+ciag.substring(1)+"</string>");
                    sprawdzaj(in.read());
                    return;
                }
                ciag +=litera;

            }
            throw new Exception("Niepoprawne cudzysłowy");
        }
        //symbole
        else if(znak == '+' || znak == '-' || znak == '*' || znak == '/' || znak == '~' ||znak == '>' || znak == '<' || znak == '(' || znak == ')' || znak == '[' || znak == ']' || znak == '{' || znak == '}' || znak == '#' || znak == ';' ){
            switch(znak){
                case '+': out.write("<symplus>"+(char)znak+"</symplus>"); break;
                case '-': out.write("<symminus>"+(char)znak+"</symminus>"); break;
                case '*': out.write("<symrazy>"+(char)znak+"</symrazy>"); break;
                case '/': out.write("<symdziel>"+(char)znak+"</symdziel>"); break;
                case '~': out.write("<symrozne>"+(char)znak+"</symrozne>"); break;
                case '>': out.write("<symwieksze>"+(char)znak+"</symwieksze>"); break;
                case '<': out.write("<symmniejsze>"+(char)znak+"</symmniejsze>"); break;
                case '(':
                case ')': out.write("<symnawiasokragly>"+(char)znak+"</symnawiasokragly>"); break;
                case '[':
                case ']': out.write("<symnawiaskwadratowy>"+(char)znak+"</symnawiaskwadratowy>"); break;
                case '{':
                case '}': out.write("<symnawiasklamrowy>"+(char)znak+"</symnawiasklamrowy>"); break;
                case '#': out.write("<symhash>"+(char)znak+"</symhash>"); break;
                case ';': out.write("<symseparator>"+(char)znak+"</symseparator>"); break;
            }
            int liczba;
            liczba = in.read();
            sprawdzaj(liczba);
            return;
        }
        //komentarze
        else if (znak =='@') {
            int liczba;
            while ((liczba = in.read()) > 0) {
                char litera = (char) liczba;
                if (litera == '\n') {
                    sprawdzaj(litera);
                    return;
                }
                ciag += litera;

            }
        }
        else{
            System.out.println("Zły znak : " + (char)znak);
            out.write("<blad>"+(char)znak+"</blad>");
        }

        sprawdzaj(in.read());

    }


    public static void main(String[] args) {
        try{
            in= new FileReader("program.pdk");
            out= new FileWriter("wynik.html");

            out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n<program>");

            int liczba;
            in.read();

            if((liczba = in.read()) != -1) sprawdzaj(liczba);

            out.write("\n<br></program>");

            out.close();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
