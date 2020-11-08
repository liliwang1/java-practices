public class Tester {
    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
    }

    public static String changeString2(String s) {
        s = "Wub a lub a dub dub";
        return s;
    }

    public static void sum(String a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        String changeMe = "hello codeup!";
        changeString(changeMe);
        System.out.println(changeMe);

        String changeMe2 = "hello codeup!";
        System.out.println(changeString2(changeMe2));
        System.out.println(changeMe2);

        sum("hi", 3);
    }
}
