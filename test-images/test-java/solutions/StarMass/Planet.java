
public class Planet extends CelestialObject {

	private Star centerStar;

	public Planet(String name, double x, double y, double z, Star centerStar, int mass) {
		super(name, x, y, z, mass);
		this.centerStar = centerStar;
	}

	public Planet() {
		super();
		this.centerStar = new Star();
	}

	public Star getCenterStar() {
		return centerStar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((centerStar == null) ? 0 : centerStar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		if (centerStar == null) {
			if (other.centerStar != null)
				return false;
		} else if (!centerStar.equals(other.centerStar))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s circles around %s at the %.3f AU", this.name,
				this.getCenterStar().getName(), CelestialObject.getDistanceBetween(this, this.getCenterStar()));
	}

	public void setCenterStar(Star centerStar) {
		this.centerStar = centerStar;
	}

	/*

	public static void main(String[] args) {

		Planet earth = new Planet();
		Planet naboo = new Planet("Naboo", 17.4389, 8349.1, 8943.92,
				new Star("Betelgeuse", 128.23, -12.82, 32.328, 1289.3, 0), 0);

		System.out.println(naboo.toString());
		System.out.println(earth.toString());
		System.out.println(naboo.getCenterStar().toString());
	}

	*/
}
