package lesson_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payment {

    private String name;
    private List<Goods> goods;
    private int totalCost;

    public Payment() {
        this.name = "New amazing purchase";
        this.totalCost = 0;
    }

    public void setPurchase() {
        this.goods = new ArrayList<>();
        System.out.println("Enter purchase amount:");
        Scanner br = new Scanner(System.in);
        int size = br.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Goods " + (i + 1) + ": ");
            System.out.print("Name: ");
            String goodsName = br.next();
            System.out.print("Price: ");
            int goodsPrice = br.nextInt();
            goods.add(new Goods(goodsName, goodsPrice));
            this.totalCost = this.totalCost + goodsPrice;
        }
    }

    public void print() {
        System.out.println("___________________________");
        System.out.println("    " + this.name);
        System.out.println("___________________________");
        System.out.println(this.totalCost);
        System.out.println("Purchase details:");
        for (Goods oneGoods : this.goods) {
            System.out.println("Name " + oneGoods.getName());
            System.out.println("Cost " + oneGoods.getCost());
        }
    }

    private static class Goods {
        private String name;
        private int cost;

        public Goods(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return this.name;
        }

        public int getCost() {
            return this.cost;
        }
    }
}
