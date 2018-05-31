package myLanguage;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class MyLanguage {

    public static void main(String [] args) {
        grammar_pdkLexer lexer = null;
        try {
            lexer = new grammar_pdkLexer(new ANTLRFileStream("D:\\Studia\\Sem. 6\\Kompilatory\\Kompilator\\jezyk2.pdk"));



        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        grammar_pdkParser parser = new grammar_pdkParser(tokens);

        // Specify our entry point
        grammar_pdkParser.FormsContext formsSentenceContext = parser.forms();

        // Walk it and attach our listener

//        ParseTreeWalker walker = new ParseTreeWalker();
//        grammar_pdkBaseListener listener = new grammar_pdkBaseListener();
//        walker.walk(listener, formsSentenceContext);

            grammar_pdkVisitor visitor = new myVisitor();
            visitor.visit(formsSentenceContext);


// TRYING COMPILE AND RUN GENERATED C++ CODE

            //YOU NEED TO CHANGE PATH TO G++ TO YOUR OWN!!


            try {
                Runtime rt = Runtime.getRuntime();

                Process pr = rt.exec("D:\\Programy\\CodeBlocks\\MinGW\\bin\\g++ -o program.exe out.cpp");

                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

                String line=null;

                while((line=input.readLine()) != null) {
                    System.out.println(line);
                }

                int exitVal = pr.waitFor();
                System.out.println("Program compilation ended with exit code: "+exitVal);

            } catch(Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }




            final Process p1 = Runtime.getRuntime().exec("cmd /c .\\program.exe");
            //final Process p = Runtime.getRuntime().exec("cmd /c .\\program.exe");

            new Thread(new Runnable() {
                public void run() {
                    BufferedReader input = new BufferedReader(new InputStreamReader(p1.getInputStream()));
                    String line = null;

                    try {
                        while ((line = input.readLine()) != null)
                            System.out.println(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            p1.waitFor();



    } catch (IOException e) {
        e.printStackTrace();
    } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
