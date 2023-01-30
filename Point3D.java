package distance;
public class Point3D {
  private final int x;
  private final int y;
  private final int z;

  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getZ() {
    return z;
  }

  public double distanceTo(Point3D other) {
    int x_distance = this.x - other.x;
    int y_distance = this.y - other.y;
    int z_distance = this.z - other.z;
    return Math.sqrt(x_distance * x_distance + y_distance * y_distance + z_distance * z_distance);
  }

  public boolean equals(Object other) {
    if (other instanceof Point3D) {
      Point3D ori_num = (Point3D) other;
      return ori_num.x == x && ori_num.y == y && ori_num.z == z;
    }
    return false;
  }
}


