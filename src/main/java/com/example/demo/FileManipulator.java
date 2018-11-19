package com.example.demo;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Paths;
import java.util.Calendar;

public class FileManipulator {

    public static void main(String[] args) throws IOException {

        //test1();
        //test2();
        //test3();
        //test4();
        test5();
    }

    private static void test5() throws IOException {
        String fileName = getCurrentFile("email.txt");

        try (FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (bufferedReader.readLine() != null) {
                System.out.println(bufferedReader.readLine());
            }
        }
    }

    private static void test4() {

        try (FileWriter fw = new FileWriter(getCurrentFile("email.txt"), true)) {
            fw.write("\nPRIORITY: HIGH");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void test3() {

        java.io.Console console = System.console();
        String username = console.readLine("Username: ");
        String password = new String(console.readPassword("Password: "));
        System.out.println(username+"/"+password);
    }

    private static void test2() {

        String path1 = getCurrentFile("orig.xml");
        String path2 = getCurrentFile("dest.xml");

        try (InputStream in = new FileInputStream(path1);
             OutputStream out = new FileOutputStream(path2)) {
            byte[] buffer = new byte[65];
            int bla = in.read(buffer);
            System.out.println(bla);
            System.out.println("text: " + new String(buffer));
            out.write(buffer);
        } catch (IOException ex) {
            System.out.println(ex);
        }


    }

    private static void test1() throws IOException {
        String path = getCurrentFile("email.txt");
        printfile(path);
        System.out.println("===========================================");


        String strRead = null;
        try (RandomAccessFile file = new RandomAccessFile(path, "rws")) {
            file.seek(21);
            file.writeUTF("PRIORITY: HIGH");
            strRead = file.readLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(strRead);
        System.out.println("===========================================");

        printfile(path);
    }

    private static String getCurrentFile(String filename) {
        return Paths.get("").toAbsolutePath().toString() + "/src/main/java/com/example/demo/" + filename;
    }

    private static void printfile(String pathToEmail) throws IOException {


        BufferedReader in = new BufferedReader(new FileReader(pathToEmail));
        String line = in.readLine();
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        in.close();
    }
}
