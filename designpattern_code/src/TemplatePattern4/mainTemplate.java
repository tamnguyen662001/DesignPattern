package TemplatePattern4;

public class mainTemplate {
    public static void main(String[] args) {
        Cart Cart1 = new OnlineCart();
        Cart1.getCart().add(new Product("Nokia X5", 2, 100000));
        Cart1.getCart().add(new Product("Samsung S22 Ultra", 1, 200000));
        
        CODCart Cart2 = new CODCart();
        Cart2.getCart().add(new Product("Nokia X5", 2, 100000));
        Cart2.getCart().add(new Product("Samsung S22 Ultra", 1, 200000));

        Cart1.Payment();
        Cart1.Discount();
        Cart1.Display();
        System.out.println("************************");
        Cart2.Payment();
        Cart2.Discount();
        Cart2.Display();

    }
}
