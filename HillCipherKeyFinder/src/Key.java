public class Key {
	public int k11;
	public int k12;
	public int k21;
	public int k22;
	
	public Key(int k11, int k12, int k21, int k22) {
		this.k11 = k11;
		this.k12 = k12;
		this.k21 = k21;
		this.k22 = k22;
	}
	
	public boolean equals(Key other) {
		if (this.k11 == other.k11 && this.k12 == other.k12 && this.k21 == other.k21 && this.k22 == other.k22) {
			return true;
		}
		return false;
	}
}
