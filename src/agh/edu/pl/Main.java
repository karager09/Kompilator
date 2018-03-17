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

        if((char)znak == ' ' || (char)znak == '\n' || (char)znak == '\t' || znak < 30){
            //koniec lini zapisywany dwoma znakami
            if((char)znak != ' ' && (char)znak != '\t'){in.read();out.write("\n"+"<br>");}
             sprawdzaj((char)in.read());
        }
        //System.out.println(znak);
        if( znak >= '0' && znak <= '9'){
            int liczba;
            char litera;
            while((liczba = in.read()) > 0){
                litera = (char) liczba;
                //System.out.println(litera);
                if(litera < '0' || litera > '9'){

                    out.write("<liczba>"+ciag+"</liczba>");

                    sprawdzaj(litera);
                    return;
                }
                ciag +=litera;
            }
            out.write("<liczba>"+ciag+"</liczba>");
        }
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
        } else if(znak == '='){
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
        }else if(znak == '\"'){
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




        } else if(znak == '+' || znak == '-' || znak == '*' || znak == '/' || znak == '~' ||znak == '>' || znak == '<' || znak == '(' || znak == ')' || znak == '[' || znak == ']' || znak == '{' || znak == '}' || znak == '#' ){
            switch(znak){
                case '+': out.write("<symplus>"+"+"+"</symplus>"); break;
                case '-': out.write("<symminus>"+"-"+"</symminus>"); break;
                case '*': out.write("<symrazy>"+"*"+"</symrazy>"); break;
                case '/': out.write("<symdziel>"+"/"+"</symdziel>"); break;
                case '~': out.write("<symrozne>"+"~"+"</symrozne>"); break;
                case '>': out.write("<symwieksze>"+">"+"</symwieksze>"); break;
                case '<': out.write("<symmniejsze>"+"<"+"</symmniejsze>"); break;
                case '(':
                case ')': out.write("<symnawiasokragly>"+znak+"</symnawiasokragly>"); break;
                case '[':
                case ']': out.write("<symnawiaskwadratowy>"+znak+"</symnawiaskwadratowy>"); break;
                case '{':
                case '}': out.write("<symnawiasklamrowy>"+znak+"</symnawiasklamrowy>"); break;
                case '#': out.write("<symhash>"+"#"+"</symhash>"); break;
            }
            int liczba;
            liczba = in.read();
            sprawdzaj(liczba);
            return;
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
