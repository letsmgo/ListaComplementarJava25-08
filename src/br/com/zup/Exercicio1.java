package br.com.zup;

public class Exercicio1 {
    public static void main(String[] args) {

        float pesoDosPeixes = 72.4F;
        float pesoExcedente = 72.4F - 50;
        float valorDaMulta = pesoExcedente * 4;

        System.out.println("João Papo-de-pescador, no dia 25 de agosto, voltou com " + pesoDosPeixes + "kg de peixes.");
        System.out.println("Por este motivo, João teve que pagar de multa R$" + valorDaMulta + " por ter trazido "
        + pesoExcedente + "kg a mais de peixe.");
    }
}
