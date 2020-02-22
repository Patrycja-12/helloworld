package tech.barny.sda;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ścieżki {
    public static void main(String[] args) throws IOException {
        Path cwdRl = Paths.get("");
        System.out.println("ścieżka: [" + cwdRl + "]");
        Path cwdAbs = cwdRl.toAbsolutePath();
        System.out.println("ścieżka: [" + cwdAbs + "]");
//        String[] more = {"src", "main"};
//        Paths.get("", more);
//        Paths.get("", "src", "main");
        Path path = Paths.get("src/main/java/tech/barny/sda/App.java");
        System.out.println(path);
        Path pathAbs = path.toAbsolutePath();
        System.out.println(pathAbs);
//        ArrayList(more);
        Paths.get("src/main/java").resolve("tech/barny/sda/App.java");

        Path katalogKoduŹródłowego = Paths.get("src/main/java");
        Path plikŹródłowy = katalogKoduŹródłowego.resolve("tech/barny/sda/App.java");
        Path parent = plikŹródłowy.getParent();
        System.out.println(parent);
        System.out.println(parent.toAbsolutePath().getRoot());
        System.out.println(plikŹródłowy.getFileName());

        System.out.println(Files.exists(plikŹródłowy));
        System.out.println(Files.isDirectory(plikŹródłowy));
        System.out.println(Files.isRegularFile(plikŹródłowy));


        // ZADANIE:
        int yy = LocalDate.now().getYear();
        for (int mm = 1; mm < 13; mm++) {
            String miesiac = String.format("%02d", mm);
            Path folder = Paths.get("testMiesiace", yy + "-" + miesiac);
            if (!Files.exists(folder)) {
                Files.createDirectories(folder);
            }
            Path plikKalendarz = folder.resolve(yy + "-" + miesiac + ".txt");
            if (!Files.exists(plikKalendarz)) {
                Files.createFile(plikKalendarz);
            }
        }
    }



//
//        Path testdir = Paths.get("testdir");
//        if (!Files.exists(testdir)){
//            Files.createDirectory(testdir);
//        }
//        System.out.println(Files.createDirectory(testdir));
//
//        Path kolejnyKatalog = testdir.resolve("banan/kwiecień");
//        Files.createDirectories(kolejnyKatalog);
//
//        Path plik = kolejnyKatalog.resolve("help.txt");
//        if (!Files.exists(plik)){
//            Files.createFile(plik);
//
//        }
//        Path plik3 = plik.resolveSibling("jejku.txt");
//        if (!Files.exists(plik3)){
//            Files.copy(plik, plik3);
//        }
//        Files.delete(plik);
////        Files.deleteIfExists(plik2);
//        Files.delete(plik3);
//
//        DirectoryStream<Path> zawartość = Files.newDirectoryStream(testdir);
//        for (Path p : zawartość){
//            System.out.println(p);
//    }


    public static void delete(Path path) throws IOException {
        if (Files.exists(path)) {
            if (Files.isRegularFile(path)) {
                System.out.println("removing " + path);
                Files.delete(path);
            } else if (Files.isDirectory(path)) {
                System.out.println("removing children of " + path);
                for (Path child : Files.newDirectoryStream(path)) {
                    delete(child);
                }
                System.out.println("removing " + path);
                Files.delete(path);
            } else {
                throw new RuntimeException();
            }
        }
    }
}


