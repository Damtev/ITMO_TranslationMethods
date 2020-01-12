import gen.GoodLanguageGrammarLexer;
import gen.GoodLanguageGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = new Scanner(System.in).next();
        CharStream cs = fromFileName("tests/in/" + inputFileName);
        GoodLanguageGrammarLexer lexer = new GoodLanguageGrammarLexer(cs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        GoodLanguageGrammarParser parser = new GoodLanguageGrammarParser(tokenStream);
        MyGoodLanguageVisitor visitor = new MyGoodLanguageVisitor();

        String translatedCode = visitor.visit(parser.program());

        int lastDotIndex = inputFileName.lastIndexOf(".");
        String pureFileName = inputFileName.substring(0, lastDotIndex);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tests/out/" + pureFileName + ".c"))) {
            writer.write(translatedCode);
        }
        String generateBinaryCommand = "gcc " + "tests/out/" + pureFileName + ".c " + "-o " +
                "tests/binary/" + pureFileName;
        Runtime.getRuntime().exec(generateBinaryCommand);
    }
}
