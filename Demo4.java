import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        //Kiểm tra xem ký tự đó là nguyên âm hay phụ âm
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ký tự kiểm tra nguyên âm hay phụ âm");
        String kyTu = scanner.nextLine();
        switch (kyTu){
            case "u","e","o","a","i":
                System.out.println(kyTu+ " Là nguyên âm");
                break;
            default:
                System.out.println(kyTu+ " Là phụ âm");
                break;
        }
    }
}
