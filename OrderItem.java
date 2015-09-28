import Product;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int qu) {
        this.product = product;
        this.quantity = qu;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int qu) {
        this.quantity = qu;
    }

    public double getValue() {
        return this.getProduct().getPrice() * (double)this.getQuantity();
    }

    public String toString() {
        return "" + this.getQuantity() + " " + this.getProduct().getCode() + " " + this.getProduct().getPrice();
    }
}
