import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
      //Nhập vào từ bàn phím s từ 2-8
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số t 2-8");
        switch (num){
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;
            case 7:
                System.out.println("Thứ 7");
                break;
            case 8:
                System.out.println("Chủ nhat");
                break;

            default:
                System.out.println("CHịu ");
                break;
        }

    }
}
