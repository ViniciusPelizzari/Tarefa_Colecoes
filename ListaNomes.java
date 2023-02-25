
//importando biblioteca
import java.util.Arrays;
import java.util.Scanner;

//criando classe
public class ListaNomes {

    // criando método main
    public static void main(String[] args) {
        // criando objeto de leitura
        Scanner L = new Scanner(System.in);
        // impressão na tela
        System.out.println("Digite nomes separados por vírgula: ");
        // lendo dados do usuário
        String resposta = L.nextLine();
        // ignorando vírgula
        String[] vetStr = resposta.split(",");

        // impressão na tela
        System.out.println(" ");
        System.out.println("Nomes desordenados: ");
        System.out.println(Arrays.toString(vetStr));
        System.out.println(" ");

        // ordenando dados
        Arrays.sort(vetStr);

        // impressão na tela
        System.out.println("Nomes organizados: ");
        System.out.println(Arrays.toString(vetStr));
        System.out.println(" ");
        // medindo array
        System.out.println("Tamanho do array: " + vetStr.length);
    }
}