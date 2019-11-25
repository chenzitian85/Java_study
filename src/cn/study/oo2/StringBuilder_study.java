package cn.study.oo2;

public class StringBuilder_study {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            char temp = (char)('a'+i); // 26个字母
            sb.append(temp);
            System.out.println(temp);
        }
        System.out.println(sb);
    }
}
