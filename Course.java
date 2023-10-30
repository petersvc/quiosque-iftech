public class Course {
    private String name;
    private double price;

    private int slots;

    public Course(String name, double price, int slots) {
        this.name = name;
        this.price = price;
        this.slots = slots;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getSlots() {
        return this.slots;
    }

    void ocuparVaga() {
        this.slots--;
    }
}
