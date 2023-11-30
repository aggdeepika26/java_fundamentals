package les3.PriorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BurgerOrderMainApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> burgerOrders = new LinkedList<>();
        burgerOrders.offer(new BurgerOrder(1, "A"));
        burgerOrders.offer(new BurgerOrder(2, "B"));
        burgerOrders.offer(new BurgerOrder(3, "C"));
        burgerOrders.offer(new BurgerOrder(4, "D"));
        burgerOrders.offer(new BurgerOrder(5, "E"));
        BurgerOrder order = burgerOrders.poll();
        System.out.println("Order  " + order);
        while(order != null)
        {
             order = burgerOrders.poll();
             System.out.println("Order  " + order);

        }


        System.out.println("Result with Priority Queue");

        PriorityQueue<BurgerOrder> burgerOrdersPriority = new PriorityQueue<>();
        burgerOrdersPriority.offer(new BurgerOrder(11, "AA"));
        burgerOrdersPriority.offer(new BurgerOrder(10, "BB"));
        burgerOrdersPriority.offer(new BurgerOrder(6, "CC"));
        burgerOrdersPriority.offer(new BurgerOrder(5, "EE"));
        BurgerOrder  orderPriority = burgerOrdersPriority.poll();
        System.out.println("First Order  " + orderPriority);
        while(orderPriority != null)
        {
            orderPriority = burgerOrdersPriority.poll();
            System.out.println(" Order Prepared  " + orderPriority);

            orderPriority = burgerOrdersPriority.peek();
            System.out.println("  " + orderPriority);

        }


    }




}
