public class Person {
    public String name;
    public int income;
    public boolean isOld;
    public char grade;
    public byte age;
    public short s;
    public long l;
    public float f;
    public double d;

    public static void main(String[] args) {
        Person p = new Person();
        // test java default values
        System.out.println(p.name); // null
        System.out.println(p.income); // 0
        System.out.println(p.isOld); // false
        System.out.println(p.grade); // '' ??
        System.out.println(p.age); // 0
        System.out.println(p.s); // 0
        System.out.println(p.l); // 0
        System.out.println(p.f); // 0.0
        System.out.println(p.d); // 0.0
        System.out.println("");
//        System.out.println(''); // error: java: empty character literal
    }
}
