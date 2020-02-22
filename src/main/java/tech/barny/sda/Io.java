package tech.barny.sda;



import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Io {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(200);
        baos.write(201);
        baos.write(202);
        byte[] bytes = baos.toByteArray();
        System.out.println(Arrays.toString(bytes));


        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
//        int read1 = bais.read();
//        System.out.println(read1);

        byte[] buf = new byte[1024];
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();

        int read;
        while ((read = bais.read(buf)) != -1) {
            baos2.write(buf, 0, read);

        }
        byte[] wszystkie = baos2.toByteArray();
        System.out.println(Arrays.toString(wszystkie));


//        Path path = Paths.get("help.txt");
//        OutputStream outputStream = Files.newOutputStream(path);
//        outputStream.write(1);
//        outputStream.write(2);
//        outputStream.write(3);
//        outputStream.write(4);
//        outputStream.close();
//
//        InputStream inputStream = Files.newInputStream(path);
//        for (int i = 0; i<4; i++){
//            System.out.println(inputStream);
//            outputStream.close();
        }

    }
