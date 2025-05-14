import java.util.Objects;

public class CelestialObject {
	public double x;
	public double y;
	public double z;
	public String name;
	public static final double KM_IN_ONE_AU = 150_000_000.0;

	public CelestialObject(String name, double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.name = name;
	}

	public CelestialObject() {
		this.x = 0.0;
		this.y = 0.0;
		this.z = 0.0;
		this.name = "Soleil";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static double getDistanceBetween(CelestialObject o1, CelestialObject o2) {
		double distance = 0.0;

		distance = Math.sqrt(
			Math.pow(o1.x - o2.x, 2) +
			Math.pow(o1.y - o2.y, 2) +
			Math.pow(o1.z - o2.z, 2)
		);

		return distance;
	}

	public static double getDistanceBetweenInKm(CelestialObject o1, CelestialObject o2) {
		return CelestialObject.getDistanceBetween(o1, o2) * KM_IN_ONE_AU;
	}

	public String toString() {
		return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		return (
			o instanceof CelestialObject &&
			this.x == ((CelestialObject) o).x &&
			this.y == ((CelestialObject) o).y &&
			this.z == ((CelestialObject) o).z &&
			this.name.equals(((CelestialObject) o).name)
		);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.x, this.y, this.z, this.name);
	}
}