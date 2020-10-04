import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.printf("%-6d |%n", 5);
        System.out.printf("%-6d |%n", 15);

        String str = "little red riding hood";
        System.out.println(str.charAt(str.length() - 1));

        double dou = 3.0;
        long num = (long) dou;
        System.out.println(num);

        float flo = 5.0F;
        int x = (int) flo;
        System.out.println(x);

        int y = 2_147_483_647;
        float flo1 = y;
        double dou1 = y;
        System.out.println(flo1);
        System.out.println(dou1);

        char a = 'a';
        System.out.println(Character.toString(a).concat("b"));
        System.out.println(a + "b");
        System.out.println(a + 'b'); //195

        String names = "Peter, John, Andy, David";
        String[] newName = names.split(", ");
        System.out.println(newName);
        System.out.println(Arrays.toString(newName));

        int[] numbers = {12, 1, 5, -2, 16, 14};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int num1 = -5;
        System.out.println(+num1);
        System.out.println(Math.abs(num1));
    }
}
