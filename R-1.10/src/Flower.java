public class Flower {
    private String name;
    private int numOfPetals;
    private float price;

    public Flower(String name, int numOfPetals, float price) {
        this.name = name;
        this.numOfPetals = numOfPetals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPetals() {
        return numOfPetals;
    }

    public void setNumOfPetals(int numOfPetals) {
        this.numOfPetals = numOfPetals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
