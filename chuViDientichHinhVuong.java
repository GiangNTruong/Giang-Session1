import java.util.Scanner;

public class chuViDientichHinhVuong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        double cd = scanner.nextDouble();
        System.out.println("Nhập chiều rộng");
        double cr= scanner.nextDouble();;
        double chuVi= cd*cr*2;
        double dienTich = cd*cr;
        System.out.println(chuVi);
        System.out.println(dienTich);
    }
}
