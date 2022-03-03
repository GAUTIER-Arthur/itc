

public class Calculs {

	int i;
	int j;
	
	public Calculs(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int multiplier() {
		return (this.i*this.j);
	}
	
	public int additioner() {
		return (this.i+this.j);
	}
	
	public int soustraire() {
		return (this.i-this.j);
	}
	
	public double diviser() {
		return ((float)this.i/(float)this.j);
	}

}
