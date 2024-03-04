import java.util.Scanner;

public class Bai2ChuaNumbertoWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Mời nhập số: ");
            int n = Integer.parseInt(scanner.nextLine());
            int hangTram=n/100;
            int hangChuc = n%100/10;
            int hangDv = n%10;
            String chuoi = "";

            if (n >=0 && n<=999){
                //so từ 0-999
                System.out.println("Hang tram : " +hangTram);
                System.out.println("Hang chuc : " +hangChuc);
                System.out.println("Hang dv : " +hangDv);
                switch (hangTram){
                    case 1: chuoi = "One Hundred";
                    break;
                    case 2: chuoi = "Two Hundred";
                        break;
                    case 3: chuoi = "Three Hundred";
                        break;
                    case 4: chuoi = "Four Hundred";
                        break;
                    case 5: chuoi = "Five Hundred";
                        break;
                    case 6: chuoi = "Six Hundred";
                        break;
                    case 7: chuoi = "Seven Hundred";
                        break;
                    case 8: chuoi = "Eight Hundred";
                        break;
                    case 9: chuoi = "Nine Hundred";
                        break;
                }
                if (hangTram !=0 &&( hangChuc!=0 || hangDv !=0)){

                }
                if(hangChuc >= 2){
                    switch (hangChuc){
                        case 2:
                           chuoi = chuoi +"Twenty";
                            break;
                        case 3:
                            chuoi = "Thirty";
                            break;
                        case 4:
                            chuoi ="forty";
                            break;
                        case 5:
                            chuoi ="fifty";
                            break;
                        case 6:
                            chuoi ="sixty";
                            break;
                        case 7:
                            chuoi ="seventy";
                            break;
                        case 8:
                            chuoi ="eighty";
                            break;
                        case 9:
                            chuoi ="nine";
                            break;
                    }
                }
                if (hangChuc == 1){
                    switch (hangChuc){
                        case 1: chuoi = "eleven";
                            break;
                        case 2: chuoi = "twelve";
                            break;
                        case 3: chuoi = "thirteen";
                            break;
                        case 4: chuoi = "fourteen";
                            break;
                        case 5: chuoi = "fifteen";
                            break;
                        case 6: chuoi = "sixteen";
                            break;
                        case 7: chuoi = "seventeen";
                            break;
                        case 8: chuoi = "eighteen";
                            break;
                        case 9: chuoi = "nineteen";
                            break;
                    }
                }
                System.out.println(chuoi);
            }
            else {
                System.out.println("So nam ngoai khoang 0-999");
            }
        }
    }

}
