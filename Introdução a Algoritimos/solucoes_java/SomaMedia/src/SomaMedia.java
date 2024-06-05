public class SomaMedia {

    public static void main(String[] args) {

        //Declaracao das variaveis
        String nomeAlg;
        int resultadoSoma;
        float resultadoMedia;
        float resultadoMedia2;

        //Calculos
        nomeAlg = "Soma e Média";
        resultadoSoma = 5 + 5 + 5;
        resultadoMedia = (5 + 5 + 5) / 3;

        //Calculos
        resultadoSoma = 5 + 5 + 5;
        resultadoMedia2 = resultadoSoma / 3;

        //Imprimir saidas
        System.out.println("Soma e média dos números 5,5 e 5");
        System.out.println("Nome do Algoritmo: ");
        System.out.println("Resultado da Soma: ");
        System.out.println(resultadoMedia);
        System.out.println("Resultado da Média: ");
        System.out.println(resultadoMedia);
        System.out.println("Resultado da Média usando a variável resultadoSoma: ");
        System.out.println(resultadoMedia2);
    }
}
