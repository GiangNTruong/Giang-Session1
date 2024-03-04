public class Demo1 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(+ num);
        System.out.println("OK");
        System.out.printf("Giá trị biến num = %d",num);
        String fullName= "Nguyễn Văn";
        boolean sex = true ;
        int age =18;
        //in có định dạng
        System.out.printf("Họ và tên : %s Tuổi: %d Giới tính : %b ",fullName,age,sex);

        //in cố định
        System.out.printf("\t Họ và tên : %s",fullName);
    }
}
