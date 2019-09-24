package com.stackroute.main;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class UpperCase {
    public void getUpperCase() throws IOException {
        File file=new File("/home/cgi/ST_Exercises/Java_Exercise3/src/resources/UpperCaseTestFile.txt");
        StringBuffer result=new StringBuffer("");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String st;
        while ((st=bufferedReader.readLine())!=null){
            result.append(st).append("\n");
        }
        System.out.println(result.toString().toUpperCase(Locale.ENGLISH).trim());
        System.out.println(file.length());
    }

    public static void main(String[] args) {
        UpperCase upperCase = new UpperCase();
        try {
            upperCase.getUpperCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
