/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class TextProcessorImpl implements TextProcessor {

    @Override
    public String removeWhitespace(String input) {
        String res = "";
        String[] arr = input.trim().split("\\s+");
        for(String s: arr) {
            res += s;
        }
        return res;
    }

    @Override
    public int countVowels(String input) {
        int count = 0;
        for(char x : input.toLowerCase().toCharArray()) {
            if(x == 'u' || x == 'e' || x == 'o' || x == 'a' || x == 'i') count++;
        }
        return count;
    }

}
