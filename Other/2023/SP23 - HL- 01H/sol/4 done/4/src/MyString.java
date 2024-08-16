/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class MyString implements IString {

    @Override
    public int f1(String str) {
        String[] array = str.split("\\s+");
        int count = 0;
        for (String string : array) {
            if (check(string)) {
                count++;
            }
        }
        return count;
    }

    public boolean check(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if (digit % 2 == 0) {
                    count++;
                    if (count == 2) {
                        return true;
                    }
                }
            }
        }
        return false; // Nếu không tìm thấy ít nhất 2 chữ số chẵn thì return false
    }

    @Override
    public String f2(String str) {
        String s1 = findLongestWord(str);
        int s2 = findShortestWord(str).length();
        str = str.replaceFirst(s1, (s2 + ""));
        return str;
    }

    public String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static String findShortestWord(String sentence) {
        String[] words = sentence.split(" "); 
        String shortestWord = words[0]; 
        for (String word : words) { 
            if (word.length() < shortestWord.length()) {
                shortestWord = word; 
            }
        }
        return shortestWord; 
    }

}
