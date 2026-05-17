package triangle;

public class TriangleService {

    public boolean isValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public double area(double a, double b, double c) {
        /*int t;
        if(true) {
            String s1 = null;
            s1.length();
        }*/
        double s = perimeter(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}