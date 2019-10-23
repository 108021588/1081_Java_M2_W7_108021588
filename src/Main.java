import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = a / 2;
        boolean flag = true;
        for (int i = 2; i <= b; i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }
            if (flag){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }

