package ie.tudublin;

public class Cat {
    String name;
	private int numLives;

    public Cat(String name) {
        this.name = name;
        this.numLives = 9;
	}

    public int getNumLives() {
        return this.numLives;
    }

    public boolean isAlive() {
        return (this.numLives > 0);
    }

    public void kill() {
        this.numLives -= 1;
        if (this.numLives > 0) {
            System.out.println("Ouch!");
        } else {
            System.out.println("Dead");

        }
    }
}
