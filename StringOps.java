import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
        
    }

    public static String capVowelsLowRest (String str) {
        // Write your code here:
        String res = "";
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            for (int j = 0; j < vowels.length; j++){
                if (chr == vowels[j]) {
                    chr = (char)(chr - 32); 
                    break;
                }
            }
            if (chr > 65 && chr <= 90 && chr != 69 && chr != 73 && chr != 79 && chr != 85) {
                chr = (char)(chr + 32);
            }
            res = res + chr;
        }   
        return res;
    }

    public static String camelCase (String str) {
        // Write your code here:
        boolean nexttoupper = false;
        String res = "";
        char temp; 
        boolean firstword = false;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                nexttoupper = true;
                continue;
            }
            if (nexttoupper == true && firstword == true) {
                temp = makeitupper(str.charAt(i));
            } else {
                temp = makeitlower(str.charAt(i));
            }
            res += temp;
            firstword = true;
            nexttoupper = false;
        }
        return res;
    }

    public static char makeitupper (char chr) {
        if (chr >= 97 && chr <= 122 ) {
            chr = (char)(chr - 32);
        }
        return chr;
    }

    public static char makeitlower (char chr) {
        if (chr >= 65 && chr <= 90) {
            chr = (char)(chr + 32);
        }
        return chr;
    }


    public static int[] allIndexOf (String str, char chr) {
        // Write your code here:
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                count++;
            }
        }

        int[] index = new int[count];
        int currentindex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                index[currentindex] = i;
                currentindex++;
            }
        }

        return index;
    }
  
    
}

