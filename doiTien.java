import java.util.Scanner;

public class doiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd;
        while (true) {
            System.out.println("Moiwf nhập số tiền USD mu doi");
            usd = Double.parseDouble(scanner.nextLine());
            if (usd > 0) {
                break;
            } else {
                System.out.println("Mời nhập USD lớn hơn 0");
            }
        }
        double rate = 23000;
        double vnd = usd * rate;
        System.out.println("CHuyển đổi tiền");
        System.out.printf("%.2f USD = %.2f", usd, vnd);
    }
}
