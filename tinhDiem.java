import java.util.Scanner;

public class tinhDiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm môn Toán");
        double mathPoint= scanner.nextDouble();
        System.out.println("Nhập điểm môn Lý");
        double physicalPoint= scanner.nextDouble();
        System.out.println("Nhập điểm môn Hóa");
        double chemistryPoint= scanner.nextDouble();
        System.out.println("Nhập điểm môn Văn");
        double literaturePoint= scanner.nextDouble();
        System.out.println("Nhập điểm môn Tiếng Anh");
        double englishPoint= scanner.nextDouble();
        double tbc = (mathPoint+physicalPoint+chemistryPoint+literaturePoint+englishPoint)/5;
        if (tbc>=0 && tbc<5){
            System.out.println("Xếp loại yếu "+tbc);
        }
        else if (tbc>=5 && tbc <6.5){
            System.out.println("Xếp loại trung binh "+tbc);
        }
        else if (tbc>=6.5 && tbc <8){
            System.out.println("Xếp loại khá "+tbc);
        }
        else if (tbc>=8 && tbc <9){
            System.out.println("Xếp loại giỏi "+tbc);
        }
        else if (tbc <=9){
            System.out.println("Xếp loại xuất sắc "+tbc);
        }
        else {
            System.out.println("linh tinh "+tbc);
        }
    }
}
