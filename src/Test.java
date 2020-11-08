import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        System.out.printf("%-6d |%n", 5);
//        System.out.printf("%-6d |%n", 15);
//
//        String str = "little red riding hood";
//        System.out.println(str.charAt(str.length() - 1));
//
//        double dou = 3.0;
//        long num = (long) dou;
//        System.out.println(num);
//
//        float flo = 5.0F;
//        int x = (int) flo;
//        System.out.println(x);
//
//        int y = 2_147_483_647;
//        float flo1 = y;
//        double dou1 = y;
//        System.out.println(flo1);
//        System.out.println(dou1);
//
//        char a = 'a';
//        System.out.println(Character.toString(a).concat("b"));
//        System.out.println(a + "b");
//        System.out.println(a + 'b'); //195
//
//        String names = "Peter, John, Andy, David";
//        String[] newName = names.split(", ");
//        System.out.println(newName);
//        System.out.println(Arrays.toString(newName));
//
//        int[] numbers = {12, 1, 5, -2, 16, 14};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        int num1 = -5;
//        System.out.println(+num1);
//        System.out.println(Math.abs(num1));

        int x = 5;
        double y = 5.0;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);  // (x > 2 ? (x < 4 ? 10 : 8) : 7) // 8
        System.out.println(x == y); // true

//        System.out.printf("%d%n", 12.9); // java.util.IllegalFormatConversionException
//        System.out.printf("%f%n", 12); // java.util.IllegalFormatConversionException

        String s = "Hello World";
        System.out.printf("The String object %s is at hash code %h%n", s, s);
        System.out.println(s);

        String stringVal = "a red fox jump over the fence.";
        System.out.printf("%20.10s\n", stringVal);

//        final int NUMBER_OF_BEATLES = 4;
//        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];

        String str = new String();
        System.out.println(str.equals("")); // true
        String str1 = null;
        System.out.println(str1 == null); // true

        System.out.println('a' + "corn");

//        System.out.println(null == false); // error

        System.out.println(1 + 3.0);
        int a = 5;
        int c = 1;
        float b = 3.2F;
        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a / c);

        System.out.println(String.format("2020-9-%02d", 3));
        System.out.printf("2020-9-%02d%n", 23);

        System.out.println(generateRandomNumber(1, 2));

//        System.out.println(Integer.parseInt("10s")); // NumberFormatException
//        System.out.println(Integer.parseInt("s10")); // NumberFormatException
//        System.out.println(Integer.parseInt("10 ")); // NumberFormatException
//        System.out.println(Integer.parseInt("10.0")); // NumberFormatException
        System.out.println(Double.parseDouble("10.0"));

        String s1 = "3a";
        String s2 = "a3";
        String s3 = "3 ";
        String s4 = "3.0";
        String s5 = "3";
//        System.out.println(Integer.valueOf(s1)); // NumberFormatException
//        System.out.println(Integer.valueOf(s2)); // NumberFormatException
//        System.out.println(Integer.valueOf(s3)); // NumberFormatException
//        System.out.println(Integer.valueOf(s4)); // NumberFormatException
        System.out.println(Integer.valueOf(s5));
        int as = Integer.valueOf(s5); // redundant boxing
        int as1 = Integer.parseInt(s5);
        System.out.println("as, as1 = " + as + ", " + as1);

//        String aa = "hello";
//        String bb = "hello";
//        System.out.println(aa == bb);

        System.out.println(Arrays.asList("hi", "there").toString()); // [hi, there]

    }

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
