import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Product {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name;
    double price;   
    
    void inputDetails() throws IOException {
        System.out.print("Enter product name: ");
        name = br.readLine();
        System.out.print("Enter Price: ");
        price = Double.parseDouble(br.readLine());
    }
}

class DiscountedProduct extends Product {
    double discountpercentage,finalprice,discountAmount;
    
    void inputDiscount() throws IOException {
        System.out.print("Enter discount(%): ");
        discountpercentage = Double.parseDouble(br.readLine());
    }

    void calculate() {
        discountAmount=price*(discountpercentage/100);
        finalprice=price-discountAmount;
    }
    
    void display() {
        System.out.println("\nProduct Name: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount Applied: "+discountAmount);
        System.out.println("Discount Percentage: " + discountpercentage + "%");
        System.out.println("Final Price = " + finalprice);
    }

    public static void main(String args[]) throws IOException {
        DiscountedProduct d = new DiscountedProduct();
        d.inputDetails();
        d.inputDiscount();
        d.calculate();
        d.display();
    }
}
