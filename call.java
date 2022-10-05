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
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for 1x^2 + 5x + 6 are " +ans+ ".");

        //prints slope answer
        double slope = Formulas.slope(0, 0, 2, 3);
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (0, 0) and (2, 3) has a slope of " +slope+ ".");

        //prints midpoint answer
        Tuple an = Formulas.midpoint(0, 0, 2, 3);
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (0, 0) and (2, 3) is " +an+ ".");

        //prints sum of arithmetic series answer
        double ari = Formulas.arithmetic(5, 1, 1);
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first 5 terms of an arithmetic series that starts with 1.0 and increases by 1.0 " +ari+ ".");

        //prints sum of finite geometric series result
        double fgeo = Formulas.finiteGeometric(3, 2, 3);
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first 3 terms of a finite geometric series that starts with 3.0 and increases by a rate of 2.0 is " +fgeo+ ".");

        //prints sum of infinite geometric series result
        double infgeo = Formulas.infiniteGeometric(8, 0.5);
        System.out.println("SUM OF AN INFINITE GEOMETRIC SERIES");
        System.out.println("The sum of an infinite geometric series that starts with 8.0 and has a common ratio of 0.5 is " +infgeo+ ".");
    }
}
