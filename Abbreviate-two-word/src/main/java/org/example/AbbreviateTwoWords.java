package org.example;

public class AbbreviateTwoWords {

    public static String abbrevName(String name){

        String[] splitName = name.split(" ") ;
        String strTwoWord = "";

        for(int i=0; i<splitName.length; i++){
            if(i==0){
                strTwoWord = strTwoWord + splitName[i].toUpperCase().charAt(0) + ".";
            }else{
                strTwoWord = strTwoWord + splitName[i].toUpperCase().charAt(0);
            }
        }
        return strTwoWord;
    }
}
