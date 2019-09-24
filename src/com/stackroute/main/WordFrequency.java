package com.stackroute.main;

import java.io.*;
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;

public class WordFrequency {
    public void findFrequencyForEachWord() throws IOException{
        File file = new File("/home/cgi/ST_Exercises/Java_Exercise3/src/resources/fileDemo.txt");
        StringBuffer result=new StringBuffer("");
        BufferedReader bufferedReader= null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st;
        while ((st=bufferedReader.readLine())!=null){
            result.append(st).append(" ");
        }

        String fileString = result.toString();
        fileString=fileString.replace(","," ");
        fileString=fileString.replace("."," ");
        fileString=fileString.replace("!", " ");
        String WordsList[]=fileString.trim().toLowerCase().split("\\s+");
        Arrays.sort(WordsList);
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : WordsList) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }


        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println(val.getKey() + " -> " + val.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        WordFrequency wordFrequency = new WordFrequency();
        try {
            wordFrequency.findFrequencyForEachWord();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
