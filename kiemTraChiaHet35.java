import java.util.Scanner;

public class kiemTraChiaHet35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số tự nhiên : ");
        int num = scanner.nextInt();;
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println(+num +" Số chia hết cho 3 và 5");
        } else if (num % 3 == 0 && num % 5 != 0) {
            System.out.println(+num +" Số chia hết cho 3 nhưng không chia hết cho 5");
        }
        else if (num % 5 == 0 && num % 3 != 0) {
            System.out.println(+num +" Số chia hết cho 5 nhưng không chia hết cho 3");
        }
        else if (num % 5 != 0 && num % 3 != 0) {
            System.out.println(+num + " Số ko chia hết cho 5 nhưng không chia hết cho 3");
        }
    }
}
