package fourth_week;

/**
 * Created by George on 06.06.2017.
 */
public class NestedInner {

    int a = 25;
    private static int b = 35;

    public static class Nested{
        public static void voo(){
            setB(99);
            System.out.println(b);

        }
    }
    public class Inner{
        public void  voo2(){
            NestedInner.b =999;
            NestedInner.this.a = 333;
            System.out.println(a + " " + b);
        }

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        NestedInner.b = b;
    }
}
