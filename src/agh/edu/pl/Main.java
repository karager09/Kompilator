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
            case "for": out.write("<symfor>"+ciag+"</symfor>"); break;
            case "": out.write("<symif>"+ciag+"</symif>"); break;
            default: out.write("<identyfikator>"+ciag+"</identyfikator>");


        }


    }


    static void sprawdzaj(char znak) throws IOException {
        String ciag = ""+znak;

        if(znak == ' ' || znak == '\n' || znak == '\t' || znak == '\0' || (int)znak < 30){
            if(znak != ' ' && znak != '\t')out.write("\n"+"<br>");
            int liczba = in.read();
            if(liczba > 0) sprawdzaj((char)in.read());
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
                if(!((litera >= 'a' && litera <= 'z') || (litera >= 'A' && litera <= 'Z'))){

                    identyfikatory(ciag);
                    sprawdzaj(litera);
                    return;
                }
                ciag +=litera;

            }
            identyfikatory(ciag);

        }






    }


    public static void main(String[] args) {
        try{
            in= new FileReader("program.pdk");
            out= new FileWriter("wynik.html");

            out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n<program>");

            int liczba;
            in.read();

//            while((liczba = in.read()) != -1){
//                char litera = (char) liczba;
//                System.out.println(litera);
//
//            }

            if((liczba = in.read()) != -1) sprawdzaj((char)liczba);

            out.write("\n<br></program>");

            out.close();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
