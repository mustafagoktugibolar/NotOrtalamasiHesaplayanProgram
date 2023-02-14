import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, phy, sen, eng;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Mat : ");
        mat = scanner.nextInt();

        System.out.print("Phy : ");
        phy = scanner.nextInt();

        System.out.print("Sen : ");
        sen = scanner.nextInt();

        System.out.print("Eng : ");
        eng = scanner.nextInt();
        scanner.close();

        int result = (mat + phy + sen + eng) / 4;
        System.out.println("Avarage : " + result);

        String message = (result >= 60) ? "You passed." : "You Failed.";
        System.out.println(message);
        
    }
}
