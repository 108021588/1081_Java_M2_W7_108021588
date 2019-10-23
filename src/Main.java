import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int a =scn.nextInt();
       for (int i = 1;i<=a;i++){
           for (int j=1;j<=a;j++){
               System.out.printf("%d\t",i*j);
           }
           System.out.println(" ");
       }
    }
}
