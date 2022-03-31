import java.util.Random;
import java.util.Scanner;

public class numeroSorteado {
    public static void main(String[] args) throws Exception {
        Random numeroSorte = new Random();
        Scanner valor = new Scanner(System.in);
        int numeroEscolhido = numeroSorte.nextInt(10) + 1;
        int numero = 0;
        
        while (numero != numeroEscolhido){
            System.out.printf("Digite um valor de 1 a 10: ");
            numero = valor.nextInt();

            if (numero > 10){
                System.out.println("Esse número é maior, não está entre 1 e 10.");
                continue;
            }else if (numero < 1){
                System.out.println("Esse número é menor, não está entre 1 e 10.");
                continue;
            }else if (numero > numeroEscolhido){
                System.out.println("Quase! o número é menor.");
                continue;
            }else if (numero < numeroEscolhido){
                System.out.println("Quase! o número é maior.");
                continue;
            }else if (numero == numeroEscolhido){
                System.out.printf("Vc acertou! é o número %d.\n", numeroEscolhido);
            }
        }
        valor.close();
    }
}