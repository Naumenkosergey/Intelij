package calculator;

public class Tester {
    public static void main(String[] args) {
        Vector a = new Vector(new double[]{5, 6, 9});
        System.out.println(a);
        Vector b = new Vector(a);
        System.out.println(b);
        Vector c = new Vector("{1,2,3}");
        System.out.println(c);
    }
}
