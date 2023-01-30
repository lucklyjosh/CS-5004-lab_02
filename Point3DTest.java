package distance;

import org.junit.Test;
import static org.junit.Assert.*;

public class Point3DTest {
    @Test
    public void testConstructorAndGetters() {
        Point3D p = new Point3D(1, 2, 3);
        assertEquals(1, p.getX());
        assertEquals(2, p.getY());
        assertEquals(3, p.getZ());
    }

    @Test
    public void testDistanceTo() {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(4, 5, 6);
        assertEquals(5.196152, p1.distanceTo(p2), 0.001);
    }

    @Test
    public void testEquals() {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);
        assertEquals(p1, p2);
    }
}
