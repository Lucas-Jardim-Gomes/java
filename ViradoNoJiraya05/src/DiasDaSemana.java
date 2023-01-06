import java.util.Scanner;

// Receba um número do usuário e imprima o dia da semana correspondente
// Sendo 1 Domingo
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        if (numero == 1) {
            System.out.println("Domingo");
        } if (numero == 2) {
            System.out.println("Segunda-feira");
        } if (numero == 3) {
            System.out.println("Terça-feira");
        } if (numero == 4) {
            System.out.println("Quarta-feira");
        } if (numero == 5) {
            System.out.println("quinta-feira");
        } if (numero == 6) {
            System.out.println("Sexta-feira");
        } if (numero == 7) {
            System.out.println("Sabado");
    }
}
}
