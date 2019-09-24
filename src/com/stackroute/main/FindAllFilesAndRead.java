package com.stackroute.main;

import java.io.*;
import java.util.Scanner;

public class FindAllFilesAndRead {
    public void FindFilteredFilesAndPrintGivenFile()
    {
        File dir = new File("/home/cgi/ST_Exercises/Java_Exercise3/src/com/stackroute/main/");
        FilenameFilter filter = new FilenameFilter() {

            public boolean accept(File file, String name)
            {
                return name.endsWith("java");
            }
        };
        File[] files = dir.listFiles(filter);
        for(File f:files) System.out.println(f.getName());

        System.out.println("Enter the file name : ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        File file = new File(dir.getPath()+"/"+filename);
        FileInputStream fileInputStream = null;
        String content;
        try {

            fileInputStream = new FileInputStream(file);

            byte fileContent[] = new byte[(int)file.length()];
            try {
                fileInputStream.read(fileContent);
            }
            catch (IOException e){
                e.printStackTrace();
            }
            finally {
                try {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                }
                catch (IOException ioe) {
                    System.out.println("Error while closing stream: " + ioe);
                }
            }

            content = new String(fileContent);
            System.out.println(content);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        FindAllFilesAndRead findAllFilesAndRead = new FindAllFilesAndRead();
        findAllFilesAndRead.FindFilteredFilesAndPrintGivenFile();
    }
}
