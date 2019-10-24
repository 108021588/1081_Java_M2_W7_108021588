import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        int x = scn.nextInt(),ans = 0;;
        for (int z = 1;z <= x;z++){
            boolean ck235 = false;
            for(int i=2; i<z; i++){
                if(z%i==0){ boolean check = true;
                    for(int j=2; check && j<i; j++){ if(i%j==0){
                        check = false; } }
                    if(check){ if (i==2 || i==3 || i==5){ ck235 = true; }else { ck235 = false; } } } }
            if (ck235){ ans = ans + z; } }
        if (x>2){ ans = ans+2; }
        if (x>3){ ans = ans+3; }
        if (x>5){ ans = ans+5; }
        System.out.println(ans); }}