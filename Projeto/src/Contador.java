import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println(" Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt(); // Lê o primeiro número inteiro
            System.out.println(" Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt(); // Lê o segundo número inteiro
   
            try{
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception){
                System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
            }
        }
    }


    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for(int i=1;  i <= contagem; i++){
            System.out.println("Imprimir o número" + i);
        }
    }
}
