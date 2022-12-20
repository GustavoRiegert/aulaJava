import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int in = 0,out = 0;
        for (int i=0; i < entrada; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in\n" + out + " out");

        sc.close();
    }
}
