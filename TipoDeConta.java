package logicajava.estruturascondicionais.switchcase;

import java.util.Scanner;

public class TipoDeConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual Conta você deseja escolher? ");
        String conta = teclado.next();
        switch (conta) {
            case "CONTA_POUPANCA":
                System.out.println("Conta Poupança oferece = 0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("Conta Corrente oferece = 0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("Conta Investimento oferece = 0.1%");
                break;
            default:
                System.out.println("Conta Inexistente");
        }
    }
}
