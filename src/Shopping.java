/*
Q2. Develop a java program to discount for mobile phone shopping by defining class Shopping.
Shopping class contains the constructor such as mobile_brand_code, mobile_brand_name, price, quantity.
The define a method Payment computes total_amount to be paid by the customer after discount.
Also calculate the discount using the following criteria:
10% discount if total_amount >20000
5% brokerage if total_amount <=20000 and total_amount >10000
Otherwise, discount NOT Applicable for this customer.
Feed the user input using Scanner class.
Write the sample input and output.
*/

import java.util.Scanner;

public class Shopping {
    String mobile_brand_code;
    String mobile_brand_name;
    double price;
    int quantity;

    double discount = 0, brokerage = 0, final_amount = 0;

    Shopping(String mobile_brand_name, String mobile_brand_code, double price, int quantity) {
        this.mobile_brand_name = mobile_brand_name;
        this.mobile_brand_code = mobile_brand_code;
        this.price = price;
        this.quantity = quantity;
    }

    void Payment() {
        if (price > 10000 && price <= 20000) {
            brokerage = 0.05 * price;
        } else if (price > 20000) {
            discount = 0.10 * price;
        } else {
            discount = 0;
        }
        final_amount = price - discount + brokerage;
    }

    void Display() {
        System.out.println("---Shopping Bill---");
        System.out.println("Mobile brand name: " + mobile_brand_name);
        System.out.println("Mobile brand code: " + mobile_brand_code);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Brokerage: " + brokerage);
        System.out.println("Final amount: " + final_amount);
    }
}

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile brand name, Mobile brand code, Quantity, Price");
        String mobile_brand_name = sc.nextLine();
        String mobile_brand_code = sc.nextLine();
        int quantity = sc.nextInt();
        double price = sc.nextDouble();
        Shopping obj1 = new Shopping(mobile_brand_name, mobile_brand_code, price, quantity);
        obj1.Payment();
        obj1.Display();
    }
}
