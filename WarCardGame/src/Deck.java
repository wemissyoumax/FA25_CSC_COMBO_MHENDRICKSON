import java.util.Iterator;
import java.util.Random;

public class Deck {
	private Card[] cards;
	
	private static Random random = new Random();
	
	//Exercise 13.2
	public static int randomInt(int low, int high) {
		return random.nextInt(high - low) + low;
	}
	public void swapCards(int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}
	public void shuffle () {
		for(int i = cards.length -1; i > 0; i--) {
			int j = randomInt(0, i +1);
			swapCards(i, j);
		}
	}
	
	// Exercise 13.3
	public int indexLowest(int lowIndex, int highIndex) {
	    int lowestIndex = lowIndex;

	    for (int i = lowIndex + 1; i <= highIndex; i++) {
	        if (cards[i].compareTo(cards[lowestIndex]) < 0) {
	            lowestIndex = i;
	        }
	    }

	    return lowestIndex;
	}
	public void selectionSort() {
		for (int i = 0; i < cards.length -1; i++) {
			int bigIndex = 0;
			for (int j =1; j < cards.length - i; j++)
				if (cards[j].compareTo(cards[bigIndex]) > 0)
					bigIndex =j;
			swap(bigIndex, cards.length -i-1);
		}
	}
	public Deck almostMergeSort() {
	    int mid = cards.length / 2;

	    Deck first = this.subDeck(0, mid - 1);
	    Deck second = this.subDeck(mid, cards.length - 1);

	    first.selectionSort();
	    second.selectionSort();

	    return merge(first, second);
	}
	public static Deck merge(Deck d1, Deck d2) {
	    Card[] cards1 = d1.cards;
	    Card[] cards2 = d2.cards;

	    Card[] merged = new Card[cards1.length + cards2.length];

	    int i = 0;
	    int j = 0; 
	    int k = 0; 

	    while (i < cards1.length && j < cards2.length) {
	        if (cards1[i].compareTo(cards2[j]) <= 0) {
	            merged[k++] = cards1[i++];
	        } else {
	            merged[k++] = cards2[j++];
	        }
	    }

	    while (i < cards1.length) {
	        merged[k++] = cards1[i++];
	    }

	    while (j < cards2.length) {
	        merged[k++] = cards2[j++];
	    }

	    return new Deck(merged);
	}

	public Deck mergeSort() {
	    if (cards.length <= 1) {
	        return this;
	    }

	    int mid = cards.length / 2;

	    Deck first = subDeck(0, mid - 1).mergeSort();
	    Deck second = subDeck(mid, cards.length - 1).mergeSort();

	    return merge(first, second);
	}



	
	public Deck(Card[] merged) {
		this.cards = new Card[merged];
	}
	
	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for(int suit = 0; suit <= 3; suit++) {
			for(int rank = 1; rank <= 13; rank ++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	
	public Deck subDeck(int low, int high) {
		Deck sub = new Deck (high - low + 1);
		for (int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}
	

	
	public void insertionSort() {
		for (int i = 1; i < this.cards.length; i++) {
			for (int j = i; (j > 0) && (cards[j].compareTo(cards[j -1]) < 0); j--) {
				swap(j, j-1);
			}
		}
	}
	
	public void bubbleSort() {
		for (int i = 0; i < cards.length; i++) {
			for (int j = 1; j < cards.length - i; j++) {
				if(cards[j-1].compareTo(cards[j]) > 0){
					swap(j-1, j);
				}
			}
		}
	}
	
	public Card[] getCards() {
		return cards;
	}
	
	// choose a random number between i and length -1, swap the i-th card and the randomly
	// chosen card
	
	//return random number between low and high, including both
	private static int randInt(int low, int high) {
		Random rand = new Random();
		int num = rand.nextInt(high -  low) + low;
		return num;
	}
	
	private void swap(int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}
	
	
	public void printCards() {
		int n = 0;
		for(Card card : cards) {
			if(n % 13 == 0 && n != 0) System.out.println();
			System.out.print(card + ", ");
			n++;
		}
		
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();

	    for (int i = 0; i < cards.length; i++) {
	        sb.append(cards[i].toString());
	        if (i < cards.length - 1) {
	            sb.append("\n");
	        }
	    }

	    return sb.toString();
	}

}
	

