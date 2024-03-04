import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
//       Khai báo biến String lưu tiên người dùng từ bản phím
        Scanner sc = new Scanner(System.in);
        //Khai báo biến String lưu tên người nhập từ bàn phím
        String fullName;
        System.out.println("Mời bạn nhập vào họ và tên");
        fullName = sc.nextLine();
        int age = Integer.parseInt(sc.next());
        System.out.println("Mời bạn nhập tuổi");
        String address = sc.nextLine();
        System.out.println("Mời bạn nhập địa chị");
        Boolean sex = sc.nextBoolean();
        System.out.println("Mời bạn nhập giới tính");
    }
}
