package cn.study.oo3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_study {
    public static void main(String[] args) {
        String s = "@Shang Hai Hong Qiao Fei Ji Chang";
        String regEx = "a|F"; //表示a或F
        Pattern pat = Pattern.compile(regEx);
        Matcher mat = pat.matcher(s);
        boolean rs = mat.find();
    }
}
