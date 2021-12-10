package day03;

import java.util.Arrays;

public class Caesar extends Encryption{
    private final int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        char[] result = input.toCharArray();
        for (int i = 0;i<result.length;i++){
            result[i]=(char)(result[i]+offset);
        }
        String ret =new String(result);
        return ret;
    }
}

