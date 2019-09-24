package com.stackroute.main;

import java.util.Scanner;

public class WithoutVowelWords {
    private int numberOfWords;
    private String[] allWords;

    public void removeVowelFromWords(){
        System.out.println("Enter total number of words you want to input : ");
        Scanner scanner = new Scanner(System.in);
        numberOfWords = scanner.nextInt();
        scanner.nextLine();
        allWords = new String[numberOfWords];
        String result[]=new String[numberOfWords];
        System.out.println("Enter the words : ");
        for(int i=0; i<numberOfWords; i++){
            allWords[i] = scanner.nextLine();
        }
        int index=0;
        for(String element: allWords){
            String ans="";
            for(char character: element.toCharArray()){
                if("aeiouAEIOU".contains(String.valueOf(character))){
                    continue;
                }
                ans+=character;
            }
            result[index++]=ans;
        }
        for (int i=0; i<numberOfWords; i++){
            System.out.println("Place Name without Vowels : "+i+" "+result[i]);
        }
    }
}
