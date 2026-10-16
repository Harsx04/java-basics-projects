//Shopping Bill Generator
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);
        System.out.println("Shopping Bill Generator");

        System.out.print("Howmany different items did you buy?");
        int numberOfItmes = input.nextInt();
        while(numberOfItmes<1){
            System.out.print("Enter at least 1 item: ");
            numberOfItmes = input.nextInt();
        }

        double subtotal = 0;

        // Consume the newline left by nextInt() before reading an item name.
        input.nextLine();

        for(int i=1;i<=numberOfItmes;i++) {
            System.out.println("\nItem " + i);


            System.out.print("Enter item name : ");
            // Read the item's name, including spaces.
            String itemName = input.nextLine();

            System.out.print("Enter price : ");
            // Read the price per unit. Zero is allowed for a free item.
            double price = input.nextDouble();
            // Keep asking until the price is non-negative.
            while (price < 0) {
                System.out.println("Price cannot be negative");
                System.out.print("Enter price again: ");
                price = input.nextDouble();
            }

            System.out.print("Enter quantity : ");
            // Read how many units of this item were purchased.
            int quantity = input.nextInt();
            // Keep asking until the quantity is at least one.
            while (quantity < 1) {
                System.out.println("Quantity must be at least 1.");
                System.out.print("Enter quantity again: ");
                quantity = input.nextInt();
            }

            double itemTotal = price * quantity;
            // Calculate the cost of all units of this item.
            System.out.println("Item Total : " + itemTotal);

            // Keep a running total across all items.
            subtotal += itemTotal;
            // Consume the newline left by the quantity input.
            input.nextLine();
        }
        System.out.println("\nSubtotal: " + subtotal);

        double discount=0;
        // Bills of 1,000 or more qualify for a 10% discount.
        if(subtotal>1000){
            discount = subtotal*0.10;
        }

        double finalAmount = subtotal-discount;

        System.out.println("\n----- BILL SUMMARY -----");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final amount: " + finalAmount);
    }
}