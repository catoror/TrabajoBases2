package Punto;

public class Punto {
	public float x;
	public float y;
	public boolean used;

	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
		used = false;
	}

	public boolean compare(Punto p) {
		return (this.x == p.x && this.y == p.y);
	}

	public float distancia(Punto p) {
		return ((this.x - p.x) * (this.x - p.x) + (this.y - p.y)
				* (this.y - p.y));
	}
}
