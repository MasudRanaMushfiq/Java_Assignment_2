import Lab_Work.Print_sum;
import Lab_Work.ProductSum;

public class Main {
    public static void main(String[] args) {
        Print_sum print_sum = new Print_sum();
        ProductSum productSum = new ProductSum();

        int man = print_sum.product_sum();
        int man1 = productSum.productSum();

        System.out.printf("E1.2 = " + man + "\n");
        System.out.printf("E1.3 = " + man1);


    }
}