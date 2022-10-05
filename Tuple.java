public class Tuple {
    double A, B;
    public Tuple() {
        A = 0;
        B = 0;
    }
    public Tuple(double x, double y) {
        A = x;
        B = y;
    }
    public String toString() {
        return A + ", " + B;
    }
}
