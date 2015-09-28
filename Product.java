public class Product {
    private String code;
    private String description;
    private double price;

    public  Product(String string, String string2, double d) {
        this.code = string;
        this.description = string2;
        this.price = d;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean equals(Object object) {
        return object instanceof Product && this.getCode().equals(((Product)object).getCode());
    }

    public String toString() {
        return this.getCode() + "_" + this.getDescription() + "_" + this.getPrice();
    }
}
