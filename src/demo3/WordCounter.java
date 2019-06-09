package demo3;

import java.util.HashMap;

public class WordCounter {
    public HashMap count(String input) {
        HashMap<String,Integer> gender = new HashMap<String,Integer>();
        for(int i = 0;i < input.length();i++){
            char ch = input.charAt(i);
            String s = String.valueOf(ch);
            Integer count = gender.get(s);
            if(count ==null){
                gender.put(s,1);
            }else {
                Integer newCount = count + 1;
                gender.put(s,newCount);
            }
        }
        return gender;
    }
}
