//Charles Shi
//Oct. 4, 2022
//ProblemSet2.1
public class call {
    public static void main(String[] args) {
        //prints tuple answers
        Tuple test = new Tuple(5, 9);
        Tuple test2 = new Tuple(1, 5);
        System.out.println(test.toString());
        System.out.println(test2.toString());

        //prints quadratic equation answers
        Tuple ans = Formulas.quad(1, 5, 6);
        System.out.println("Quadratic: " +ans);

        //prints slope answer
        double slope = Formulas.slope(0, 0, 2, 3);
        System.out.println("Slope: " +slope);

        //prints midpoint answer
        Tuple an = Formulas.midpoint(0, 0, 2, 3);
        System.out.println("Midpoint: " +an);

        //prints sum of arithmetic series answer
        double ari = Formulas.arithmetic(5, 1, 1);
        System.out.println("Sum of arithmetic series: " +ari);

        //prints sum of finite geometric series result
        double fgeo = Formulas.finiteGeometric(3, 2, 3);
        System.out.println("Sum of finite geometric series: " +fgeo);

        //prints sum of infinite geometric series result
        double infgeo = Formulas.infiniteGeometric(8, 0.5);
        System.out.println("Sum of infinite geometric series: " +infgeo);
    }
}
