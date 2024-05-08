import java.util.Scanner;
class MainDivision{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("INGRESA EL DIVISIOR: ");
        a = scan.nextInt();
        System.out.println("INGRESA EL DIVIDENDO:   ");
        b = scan.nextInt();

        Division div = new Division();
        div.setA(a);
        div.setB(b);

        System.out.println("EL RESULTADO ES: " + div.mosrtarResultado());
    }
}