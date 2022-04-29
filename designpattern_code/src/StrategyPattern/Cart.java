package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> list = new ArrayList<>();
    IPayment typePayment;

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public IPayment getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(IPayment typePayment) {
        this.typePayment = typePayment;
    }

    public void display() {

        list.forEach(Product -> {
            System.out.println(" Product name : " + Product.name +
                    "\n Price: " + Product.price +
                    "\n Description: " + Product.description);
        });
    }

    public double Payment() {
        double totalMoney = list.stream().mapToDouble(Product -> Product.price).sum();
        return typePayment.Payment((int) totalMoney);

        // double[] totalMoney = { 0 };
        // list.forEach(Product -> {
        //     totalMoney[0] = totalMoney[0] + Product.price;
        // });

        // return totalMoney[0];
    }
}
