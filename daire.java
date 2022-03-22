import java.util.Scanner;


public class daire {
    public static void main(String[] args) {

        double pi=3.14,area, environment;
        int r,a;

        Scanner circle= new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz :");
        r= circle.nextInt();

        System.out.print("Merkez Açısını Giriniz :");
        a= circle.nextInt();

        area= (pi * r*r*a)/360;
        System.out.println("Dairenin Alanı :" +area);



















    }
}
