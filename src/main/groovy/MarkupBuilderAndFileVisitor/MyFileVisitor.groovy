package MarkupBuilderAndFileVisitor

import java.nio.file.FileVisitor
import java.nio.file.attribute.BasicFileAttributes

class MyFileVisitor implements FileVisitor<File> {

    @Override
    FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {}

    @Override
    FileVisitResutl postVisitDirectory(Path dir, IOException exc) throws IOException {}

    @Override
    FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {}

    @Override
    FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {}

}