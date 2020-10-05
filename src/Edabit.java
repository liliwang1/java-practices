import java.util.StringTokenizer;

public class Edabit {
    public static void main(String[] args) {
    }

    public static int countWords(String s) { // count the number of words in a string
        StringTokenizer st = new StringTokenizer(s, " ");
        return st.countTokens();
//        return s.split(" ").length;
    }

    public static boolean checkEnding(String str1, String str2) {
        return str1.endsWith(str2);
//        return str1.matches( ".*"+str2);
//        return str1.substring(str1.length() - str2.length()).equals(str2)
    }

}
