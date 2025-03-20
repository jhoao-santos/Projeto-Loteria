package secao_loteria;


import java.util.Random;
import java.util.Arrays;

public class Bilhete {
    
    private int[] numeroEscolhidos;
    private int[] resultadoSorteio;


    public Bilhete (int[] numeroEscolhidos) {
        this.numeroEscolhidos = numeroEscolhidos;

    }

    // Metodo para realizar o sorteio
    public void realizarSorteio() {

        Random random = new Random();

        resultadoSorteio = new int[6];

        for(int i = 0; i <  resultadoSorteio.length; i++) {
            resultadoSorteio[i] = random.nextInt(60) + 1;
        }

        Arrays.sort(resultadoSorteio);

    }

        // Metodo para  contar  quantos numeros o jagador acertou
    public int contarAcertos() {

        int acertos = 0;

        for(int numeroEscolhidos : numeroEscolhidos) {
            for(int numeroSortiados : resultadoSorteio) {

                if (numeroEscolhidos == numeroSortiados) {
                    acertos++;
                    
                }
                
            }

        }



        return acertos;


    }

        // Exibir os resultados

        public void exibirResultado() {
            System.out.println("Numeros escolhidos: " + Arrays.toString(numeroEscolhidos));
            System.out.println("Numeros sorteados: " + Arrays.toString(resultadoSorteio));


            int acertos = contarAcertos();

            System.out.println("Voce teve " + acertos + " acerto. ");
            System.out.println();
        }
}
