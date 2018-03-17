package agh.edu.pl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static FileReader in;
    static FileWriter out;

    static void sprawdzaj(char znak) throws IOException {
        String ciag = ""+znak;
        System.out.println(znak);
        if( znak >= '0' && znak <= '9'){
            int liczba;
            char litera;
            while((liczba = in.read()) != -1){
                litera = (char) liczba;
                System.out.println(litera);
                if(litera < '0' || litera > '9'){

                    out.write("<liczba>"+ciag+"</liczba>");

                    sprawdzaj(litera);
                }
                ciag +=litera;


            }

            //out.write("<liczba>"+ciag+"</liczba>");


        }




    }


    public static void main(String[] args) {
        try{
            in= new FileReader("program.pdk");
            out= new FileWriter("wynik.html");

            out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n<program>");

            int liczba;
            in.read();
//
//            while((liczba = in.read()) != -1){
//                char litera = (char) liczba;
//                System.out.println(litera);
//
//            }

            if((liczba = in.read()) != -1) sprawdzaj((char)liczba);

            out.write("</program>");

            out.close();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
