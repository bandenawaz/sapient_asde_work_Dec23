package org.example;

public class StringSwap {

    public String swapLastTwoChar(String string){

        int strLength = string.length();
//        char firstChar = string.charAt(0);
        String strExceptLastTwoChars = string.substring(0, strLength - 2);
        //char secondChar = string.charAt(1);
        char secondLastChar = string.charAt(strLength - 2);
        char lastChar = string.charAt(strLength - 1);
        return strExceptLastTwoChars + lastChar + secondLastChar;
    }
}
