import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char value;
        int dem = 0;
        String str = "Hello";
        System.out.println("Nhap phan tu muon tim :");
        value = sc.next().charAt(0);
        for (int i =0 ;i<str.length();i++){

                if (value==str.charAt(i)){
                   dem++;
            }
        }
        System.out.println(dem);

    }
}
