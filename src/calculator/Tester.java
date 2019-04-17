package calculator;

public class Tester {
    public static void main(String[] args) {
       /* Vector a = new Vector(new double[]{5, 6, 9});
        System.out.println(a);
        Vector b = new Vector(a);
        System.out.println(b);
        Vector c = new Vector("{1.0, 2.0, 4.0}");
        System.out.println(c);*/
        Matrix m = new Matrix("{{1, 2, 3, 2, 3},{2, 3, 5, 2, 3},{2, 3, 5, 2, 3},{2, 3, 5, 2, 3},{2, 3, 5, 2, 3},{2, 3, 5, 2, 3}}");
//        Matrix z = new Matrix("{{1, 2, 7, 6, 3},{4, 3, 1, 2, 8},{2, 5, 5, 1, 3},{2, 3, 5, 2, 3},{2, 3, 5, 2, 3},{2, 3, 5, 2, 3}}");
//        System.out.println(m);
        Scalar g = new Scalar(5);
        System.out.println(m.slogenie(g));
        /*System.out.println(c.delenie(c));
        System.out.println();*/
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
