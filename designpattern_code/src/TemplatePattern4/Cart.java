package TemplatePattern4;

import java.util.List;

public interface  Cart {
    public List<Product> getCart();
    public double Payment();
    public double Discount();
    public void Display();
}
