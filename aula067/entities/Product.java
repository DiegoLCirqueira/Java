package aula067.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStokc() {
        return price * quantity;
    }

    public void addProducts (int quantity) {
        this.quantity += quantity;
    }

    public void remuveProducts (int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $" + String.format(" %.2f", price) + ", " + quantity + " " + "units, Total: $" + String.format(" %.2f", totalValueInStokc());
    }
}
