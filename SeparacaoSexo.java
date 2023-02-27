
//importando biblioteca
import java.util.Arrays;
import java.util.Scanner;

//criando classe
public class SeparacaoSexo {

    // criando método main
    public static void main(String[] args) {
        // criando objeto de leitura
        Scanner L = new Scanner(System.in);
        // impressão na tela
        System.out.println("Digite o nome e o sexo separados por '-' e ','. Ex: M-Vinícius");
        System.out.println("'M' de masculino e 'F' de feminino.");
        // lendo dados do usuário
        String resposta = L.nextLine();
        // separando os dados
        String[] dados = resposta.split(",");
        // criando vetores para os nomes masculinos e femininos
        String[] nomesFem = new String[dados.length];
        String[] nomesMasc = new String[dados.length];
        // contadores para os vetores de nomes masculinos e femininos
        int contFem = 0;
        int contMasc = 0;
        // separando os nomes por sexo e armazenando nos vetores apropriados
        for (int i = 0; i < dados.length; i++) {
            String[] nomeSexo = dados[i].split("-");
            // ignorando case
            if (nomeSexo[0].equalsIgnoreCase("F")) {
                nomesFem[contFem] = nomeSexo[1];
                contFem++;
                // ignorando case
            } else if (nomeSexo[0].equalsIgnoreCase("M")) {
                nomesMasc[contMasc] = nomeSexo[1];
                contMasc++;
            }
        }
        // ordenando os nomes masculinos e femininos
        Arrays.sort(nomesFem, 0, contFem);
        Arrays.sort(nomesMasc, 0, contMasc);
        // imprimindo os nomes ordenados
        System.out.println(" ");
        System.out.println("Nomes femininos ordenados: ");
        for (int i = 0; i < contFem; i++) {
            System.out.println(nomesFem[i]);
        }
        System.out.println(" ");
        System.out.println("Nomes masculinos ordenados: ");
        for (int i = 0; i < contMasc; i++) {
            System.out.println(nomesMasc[i]);
        }
    }
}
