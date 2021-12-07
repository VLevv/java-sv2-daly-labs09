package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public List<String> shortestWords(List<String> words){
        List<String> result=new ArrayList<>();
        int min= words.get(0).length();
        for (String s :
                words) {
            if(min>s.length()){
                min=s.length();
            }
        }
        for (String s :
                words) {
            if (s.length() == min){
                result.add(s);
            }
        }
        return result;
    }
}
