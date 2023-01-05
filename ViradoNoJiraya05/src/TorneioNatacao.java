import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        if (idade <= 10){
            System.out.println(nome + "Participará da categoria Infantil");
        } if (idade >= 11 && idade <= 15) {
            System.out.println(nome + "Participará da categoria Juvenil");
        } if (idade >= 16 && idade <= 19){
            System.out.println(nome + "Participará da categoria Pré-adulto");
        } if (idade >= 20 ) {
            System.out.println(nome + "Participará da categoria Adulto");
        }
    }
}
