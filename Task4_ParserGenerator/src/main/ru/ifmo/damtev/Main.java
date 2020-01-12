package main.ru.ifmo.damtev;

import grammar.template.GrammarTemplateLexer;
import grammar.template.GrammarTemplateParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static main.ru.ifmo.damtev.generators.FilesGeneratorKt.generateFiles;


public class Main {
    public static void main(String[] args) throws IOException {
        String[] inputFileNames = {"pascalVariablesGrammar", "calculatorGrammar"};
        MyGrammarTemplateVisitor[] visitors = new MyGrammarTemplateVisitor[inputFileNames.length];
        int i = 0;
        for (String inputFileName : inputFileNames) {
            CharStream cs = fromFileName("test_grammars/" + inputFileName);
            GrammarTemplateLexer lexer = new GrammarTemplateLexer(cs);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            GrammarTemplateParser parser = new GrammarTemplateParser(tokenStream);
            MyGrammarTemplateVisitor visitor = new MyGrammarTemplateVisitor();

            visitor.visit(parser.file());
            visitors[i] = visitor;
            ++i;
        }
        generateFiles(visitors, inputFileNames);
    }
}
