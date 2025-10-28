
public class War_Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0, 25));
		Pile center = null;
		Pile p2 = new Pile();
		p1.addDeck(deck.subDeck(26, 51));
		int diff = -1;
		while(!p1.isEmpty() && !p2.isEmpty()) {
			if(diff != 0) {
				center = new Pile();
			}
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			System.out.print(c1 + ", " + c2);
			center.addCard(c1);
			center.addCard(c2);
			diff = c1.getRank() - c1.getRank();
			if(diff > 0) {
				System.out.println(" Player 1");
				for(int i = 0; i < center.size(); i++) {
				p1.addCard(center.popCard());
				}
			}else if (diff < 0) {
				System.out.println(" Player 2");
				for(int i = 0; i < center.size(); i++) {
					p2.addCard(center.popCard());
				}
			}
			else {
				for(int i = 0; i < 3; i++) {
					if(!p2.isEmpty() && p1.isEmpty()) {
						
					}
				}
			}
		}
		if(p2.isEmpty()) System.out.println("Player 1 wins!!!");
		else System.out.println("Player 2 wins!!!");
	}

	private static int binSearch(Card[] cards, Card target) {
		int low = 0;
		int high = cards.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int comp = cards[mid].compareTo(target);
			if (comp == 0)
				return mid;
			else if (comp < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			System.out.println(low + ", " + high);
		}
		return -1;
	}

	private static int search(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].equals(target))
				return i;
		}
		return -1;
	}

}
