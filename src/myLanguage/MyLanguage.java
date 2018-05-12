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
            lexer = new grammar_pdkLexer(new ANTLRFileStream("D:\\Studia\\Sem. 6\\Kompilatory\\Kompilator\\jezyk.pdk"));



        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        grammar_pdkParser parser = new grammar_pdkParser(tokens);

        // Specify our entry point
        grammar_pdkParser.FormsContext formsSentenceContext = parser.forms();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        grammar_pdkBaseListener listener = new grammar_pdkBaseListener();
        walker.walk(listener, formsSentenceContext);

    } catch (IOException e) {
        e.printStackTrace();
    }


    }
}
