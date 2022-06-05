import java.util.Scanner;

public class artikYear {
    public static void main(String[] args) {
        int year;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Yili Giriniz : ");
        year = input.nextInt();

        if (year > 0) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isError = true;
                    } else {
                        isError = false;
                    }
                } else {
                    isError = true;
                }
            } else {
                isError = false;
            }
            if (isError) {
                System.out.print(year + " Artik Yildir ");
            } else {
                System.out.print(year + " Artik Yil Degildir");

            }
        } else {
            System.out.print("Girdiniz Deger Hatalidir! Lutfen Tekrar Deneyin..");

        }
    }
}
