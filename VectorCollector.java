public class VectorCollector {
    private double x, y, z;

    public VectorCollector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void Multiply(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }

    public void Multiply(int scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }

    public double Length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}

public static VectorCollector VectorSum(VectorCollector v1, VectorCollector v2) {
    double newX = v1.x + v2.x;
    double newY = v1.y + v2.y;
    double newZ = v1.z + v2.z;
    return new VectorCollector(newX, newY, newZ);
}

public static VectorCollector VectorDifference(VectorCollector v1, VectorCollector v2) {
    double newX = v1.x - v2.x;
    double newY = v1.y - v2.y;
    double newZ = v1.z - v2.z;
    return new VectorCollector(newX, newY, newZ);
}

public static double DotProduct(VectorCollector v1, VectorCollector v2) {
    return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
}
