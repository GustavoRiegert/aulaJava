import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        for (int i =1; i < entrada; i++ ){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
