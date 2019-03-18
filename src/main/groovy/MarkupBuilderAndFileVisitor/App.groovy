package MarkupBuilderAndFileVisitor

import java.nio.Path
import java.nio.Paths

class App {

    void process(Path rootDir, Writer writer) {
        MarkupBuilder builder = new MarkupBuilder(writer)
        builder.doubleQuotes = true
        builder.html {
            head {
                title "MarkupBuilder and FileVisitor example"
            }
            body {
                p "Hello, world"
            }
        }
    }
    static void main(String[] args) {
        Path in = Paths.get('./src/test/fixture/FileTree')
        StringWriter sw = new StringWriter()
        new App.process(in, sw)
        Path out = Path.get('./build/tmp/testOutput/App/index.html')
        Files.createDirectories(out.getParent())
        out.toFile().withWriter('utf-8') {
            it.write(sw.toString())
        }
    }
}
