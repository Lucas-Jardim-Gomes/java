import java.util.Scanner;

public class ProcessoDeCadastramento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        System.out.println("Digite M para sexo masculino ou  F para sexo feminino: ");
        String sexo = input.next();
        if (sexo.equalsIgnoreCase("M") && idade >= 18){
            System.out.println("Cadastramento Obrigatorio");
        } if (sexo.equalsIgnoreCase("M") && idade < 18 ) {
            System.out.println("Cadastramento não permitido");
        } if (sexo.equalsIgnoreCase("F") && idade >= 18){
            System.out.println("Você deseja se Cadastrar?");
        } if (sexo.equalsIgnoreCase("F") && idade < 18){
            System.out.println("Cadastramento não permitido");
        }

        

    }
}
