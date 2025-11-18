public class Exercise112 {
	public static class Tile{

    private char letter;
    private int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void printTile(Tile t) {
        System.out.println("Tile: " + t.letter + " (value " + t.value + ")");
    }

    @Override
    public String toString() {
        return "Tile{letter=" + letter + ", value=" + value + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;

        Tile other = (Tile) obj;
        return this.letter == other.letter &&
               this.value == other.value;
    }


    public static void main(String[] args) {
        Tile tile = new Tile('Z', 10); 
        printTile(tile);                
        System.out.println(tile);       
    }
	}
}
