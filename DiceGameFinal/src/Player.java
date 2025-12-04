public class Player {
    private Die die;
    private String name;

    public Player() {
        this.die = new Die(1);
        this.name = "none";
    }

    public Player(String name, int sides) {
        this.die = new Die(sides);
        this.name = name;
    }
    public Die getDie() {
        return die;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Player [name=" + name + ", die=" + die + "]";
    }
}

