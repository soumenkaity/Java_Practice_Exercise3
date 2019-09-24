package com.stackroute.main;

public class ChessBoard {
    public void generateBoard(){
        StringBuffer result=new StringBuffer("");
        for(int i=1;i<=8;i+=2){
            for(int j=1;j<=8;j++){
                if(j%2==1){
                    result.append("WW");
                }else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");
            for(int j=1;j<=8;j++){
                if(j%2==0){
                    result.append("WW");
                }else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");

        }
        System.out.println(result.substring(0,result.length()-1));
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.generateBoard();
    }
}
