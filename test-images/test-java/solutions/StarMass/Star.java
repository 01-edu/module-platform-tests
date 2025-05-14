import java.util.Objects;

public class Star extends CelestialObject {
	private double magnitude;

	public Star() {
		
	}

	public Star(String name, double x, double y, double z, double magnitude, int mass) {
		super(name, x, y, z, mass);
		this.magnitude = magnitude;
	}

	public double getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
	}

	@Override
	public String toString() {
		return String.format("%s shines at the %.3f magnitude", this.name, this.magnitude);
	}

	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(magnitude);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		return this.hashCode() == obj.hashCode();
	}
}
