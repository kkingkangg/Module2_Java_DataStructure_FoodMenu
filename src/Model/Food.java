package Model;

public class Food {
    private int id;
    private String Name;
    private long price;

    public void Food() {
    }

    public Food(int id, String name, long price) {
        this.id = id;
        Name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food {" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }
}
