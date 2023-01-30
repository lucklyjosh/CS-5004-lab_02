package distance;

import distance.Physics;
import distance.Point3D;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhysicsTest {
  @Test
  public void testVelocity() {
    Point3D one = new Point3D(0, 0, 0);
    Point3D two = new Point3D(10, 10, 10);
    double elapsedTime = 5;
    double expectedVelocity = one.distanceTo(two) / elapsedTime;
    double actualVelocity = Physics.velocity(one, two, elapsedTime);
    assertEquals(expectedVelocity, actualVelocity, 0.001);
  }


}