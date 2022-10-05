public class Formulas {
    public Formulas() {
    }

    //quadratic formula
    public static Tuple quad(double a, double b, double c) {
        double x1 = (-b + Math.sqrt((Math.pow(b,2)) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt((Math.pow(b,2)) - 4 * a * c)) / (2 * a);
        Tuple quads = new Tuple(x1, x2);
        return quads;
    }

    //slope
    public static double slope(double x1, double y1, double x2, double y2) {
        return ((y2-y1)/(x2-x1));
    }

    //midpoint
    public static Tuple midpoint(double x1, double y1, double x2, double y2) {
        double x = (x1 + x2)/2;
        double y = (y1 + y2)/2;
        Tuple midpoints = new Tuple(x, y);
        return midpoints;
    }

    //sum of arithmetic series
    public static double arithmetic(double k, double a1, double d) {
        return k*(a1 + (a1+(k-1)*d))/2;
    }

    //sum of finite geoemetric series
    public static double finiteGeometric(double g1, double r, double k) {
        return (g1*((1-Math.pow(r,k))/(1-r)));
    }

    //sum of infinite geometric series
    public static double infiniteGeometric(double g1, double r) {
        return g1 / (1 - r);
    }
}