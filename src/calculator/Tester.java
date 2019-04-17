package calculator;

public class Tester {
    public static void print(Variable other) {
        System.out.println(other);

    }
    public static void main(String[] args) {
        Vector c = new Vector("{1.0, 2.0, 4.0}");
        Matrix m = new Matrix("{{1, 2},{1, 2}}");
        Scalar g = new Scalar(5);

        print(c.slogenie(c));
        print(c.vichitanie(c));
        print(c.delenie(c));
        print(c.umnogenie(c));




















        /*int[][] mat = new int[5][5];
        for (int[] i:mat
             ) {
            for (int j:i
                 ) {
                System.out.print(mat);
            }
            System.out.println();
        }
        Integer b = new Integer(2);
        Integer f = new Integer(2);
        System.out.println(b==f);
        System.out.println(b.equals(f));*/
    }
}
