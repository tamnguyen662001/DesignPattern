package TemplatePattern3;

public class Product {
    String name;
    int quantity;
    int price;
    
    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
       
        return "Product : Name : " + name + ", Quantity : " + quantity + ", Price : " + price ;
    }

    
}
