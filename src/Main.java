import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans = 0;
        boolean ck235 = false;
        Scanner scn = new Scanner( System.in );
        int x = Integer.parseInt(scn.next());
        for (int z = x;z > 0;z--){
            ck235 = false;
            for(int i=2; i<z; i++){
                if(z%i==0){
                    boolean check = true;
                    for(int j=2; check && j<i; j++){
                        if(i%j==0){
                            check = false;
                        }
                    }
                    if(check){

                        if (i==2 || i==3 || i==5){
                            ck235 = true;
                        }else {
                            ck235 = false;

                        }
                    }
                }
            }

            if (ck235){
                ans = ans + z;
            }
        }
        if (x>2){
            ans = ans+2;
        }
        if (x>3){
            ans = ans+3;
        }
        if (x>5){
            ans = ans+5;
        }
        System.out.println(ans);
    }
}