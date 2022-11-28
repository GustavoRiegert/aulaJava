import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int entrada = sc.nextInt();

        double[] altura = new double[entrada];
        String[] genero = new String[entrada];

        double menorAltura = 0;
        double maiorAltura = 0;
        double mediaAlturaF = 0;
        int numeroHomens = 0;
        int numeroMulheres = 0;

        for (int i = 0; i < altura.length; i++){

            System.out.printf("Altura da %da pessoa:  ", i + 1 );
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1 );
            sc.nextLine();
            genero[i] = sc.nextLine();

            if(i == 0){
                menorAltura = altura[i];
                maiorAltura = altura[i];
            }

            if (genero[i].equals("M")) {
                numeroHomens++;
            } else{
                numeroMulheres++;
                mediaAlturaF += altura[i];
            }
            if (maiorAltura < altura[i]){
                maiorAltura = altura[i];
            }
            if (menorAltura > mediaAlturaF){
                menorAltura = altura[i];
            }
        }

        mediaAlturaF /= numeroMulheres;
        System.out.println("Menor altura = " +menorAltura);
        System.out.println("Maior altura = " +maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f", mediaAlturaF);
        System.out.println("\n1Numero de homens = " +numeroHomens);
    }
}