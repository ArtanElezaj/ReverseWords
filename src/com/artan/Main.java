package com.artan;

public class Main {

    public static void main(String[] args) {

        System.out.println(reverseWords("Hi my name is Tani"));
    }


    public static String reverseWords(String input){
        int begin = 0;
        int end;

        String result = "";

        for(int i = 0; i<input.length(); i++){
            if ((input.charAt(i) == ' ') || (i == input.length() - 1)){
                if(result.equals("")){
                    end = i - 1;
                }else {
                    end = i;
                }
                if (i == input.length() - 1){
                    result = result + " ";
                }

                for (int j = end; j >= begin; j--) {
                    result = result + input.charAt(j);
                }

                begin = end + 1;
            }
        }

        return result;
    }
}
