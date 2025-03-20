package secao_loteria;

import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorLoteria {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Bilhete> bilhetes = new ArrayList<>();


        // Solicitando Bilhte do usuario

        while (true) {

            System.out.println("Digite 6 numero para seu bilhete(entre 1 e  60:  )");

            int[] numeroEscolhidos = new int[6];

            // Usuario escolhe o numero
            for(int i = 0; i < numeroEscolhidos.length; i++) {

                System.out.println("Digite  o numero " + (i + 1) + ":");

                numeroEscolhidos[i] = scanner.nextInt();
                
            }

            // Criamos o bilhete com o numero escolhido

            Bilhete bilhete = new Bilhete(numeroEscolhidos);

            bilhetes.add(bilhete);

            // Pergunta se o usuario quer continuar
            System.out.println("Deseja registra outro bilhete? (s / n ) ");

            String resposta = scanner.next();

            




            if (resposta.equals("n")) {
                break;
                
            }
            
        }

        // Realizar  o sorteio para cada bilhete

        System.out.println("realizando o sorteio.....");

        for(Bilhete bilhete : bilhetes) {
            bilhete.realizarSorteio();
            bilhete.exibirResultado();
        }

        scanner.close();
        
    }
}
