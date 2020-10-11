package innerclasstest;

class Outside {
    int a  = 1;

    static class Inside {
        int b = 3;
    }

    class InsideAgain {
        int c = 5;
    }

    class InsideMore {
        class InsideInsideMore {
            int d = 7;
        }
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        Outside o = new Outside();

        Outside.Inside i = new Outside.Inside();

        Outside.InsideAgain ia = o.new InsideAgain();

        Outside.InsideMore im = o.new InsideMore();
        Outside.InsideMore.InsideInsideMore iim = im.new InsideInsideMore();

        System.out.printf("%d,%d,%d,%d%n", o.a, i.b, ia.c, iim.d);
//        i.a;// error , scoping
    }
}
