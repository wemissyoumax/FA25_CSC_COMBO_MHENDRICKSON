
public class Cat extends Animal{
	private boolean longHair;
	private boolean bobTail;
	public Cat() {
		super();
		longHair = false;
		bobTail = false;
	}
	
	public Cat(int height, double weight, String name,  boolean longHair, boolean bobTail) {
		super(height, weight, name);
		this.longHair = longHair;
		this.bobTail = bobTail;
	}

	public boolean isLongHair() {
		return longHair;
	}

	public void setLongHair(boolean longHair) {
		this.longHair = longHair;
	}

	public boolean isBobTail() {
		return bobTail;
	}

	public void setBobTail(boolean bobTail) {
		this.bobTail = bobTail;
	}
	
	@Override
	public String makeNoise() {
		return "Meow-meow";
	}

	@Override
	public String toString() {
		return "Cat [Height = " + super.getHeight() + ", Weight = " + super.getWeight() + ", Name = " + super.getName() +", Long hair = " + longHair + ", Bob tail = " + bobTail + "]";
	}
	
	

}
