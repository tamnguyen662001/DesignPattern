package TemplatePattern3;

import java.util.ArrayList;
import java.util.List;

public class CODCart {
    List<Product> Cart = new ArrayList<>();

    public double Payment() {
        double[] totalMoney = { 0 };
        Cart.forEach(Product -> {
            totalMoney[0] = totalMoney[0] + Product.price*Product.quantity;
        });

        return totalMoney[0];
    }
    public List<Product> getCart() {
        return Cart;
    }

    public void setCart(List<Product> cart) {
        this.Cart = cart;
    }

    public double Discount(){
        
        if(Payment()>1000000){
            return Payment()*0.05;
        }
        return 0;
    }

    public void Display() {
    
        Cart.forEach(Product -> {          
            System.out.println(" Product : " + Product.name +
                    "\n Price: " + Product.price +
                    "\n Quantity: " + Product.quantity
                    +"\n - - - - - - ");
        });
        System.out.println("======================");
       System.out.println("\tTotal :  " + Payment() + " VND");
       System.out.println("\tDiscount :  " + Discount()+ " VND");
       System.out.println("\tPayment :  " + (Payment()-Discount()) +" VND");
    }
}

