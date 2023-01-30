package distance;
public class Physics {
  public static double velocity(Point3D one, Point3D two, double elapsedTime){
    if (elapsedTime <=0) {
      throw new IllegalArgumentException("Elapsed time must be positive");
    }
    return one.distanceTo(two) / elapsedTime;
  }
  public static void main(String [] args) {
    try {
      Point3D one = new Point3D(0, 0, 0);
      Point3D two = new Point3D(1, 1, 1);
      System.out.println("Displacement = " + one.distanceTo(two));
      double velocity = Physics.velocity(one, two, 0);
      System.out.println("Prof. keith is on the move! His Velocity = " + velocity);
      velocity = Physics.velocity(one, two, 5);
      System.out.println("Velocity =" + velocity);
    }
    catch(IllegalArgumentException e) {
      System.out.println("Encountered an error: " + e.getMessage());
    }
  }
}
