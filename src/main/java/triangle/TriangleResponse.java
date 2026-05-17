package triangle;


public class TriangleResponse {
    public boolean valid;
    public double perimeter;
    public double area;

    public TriangleResponse(boolean valid, double perimeter, double area) {
        this.valid = valid;
        this.perimeter = perimeter;
        this.area = area;
    }
}
