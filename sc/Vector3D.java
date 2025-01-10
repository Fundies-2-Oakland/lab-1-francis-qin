package sc;

public class Vector3D {

    public static void main(String[] args) {
        Vector3D newVector = new Vector3D(3, 4, 5);
        System.out.println(newVector.getX());
        System.out.println(newVector.getY());
        System.out.println(newVector.getZ());
    }

    private double x;
    private double y;
    private double z;

    //Q1
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Q2
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    //Q3
}
