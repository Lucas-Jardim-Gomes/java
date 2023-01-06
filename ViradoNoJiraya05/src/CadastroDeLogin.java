import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        if (nome == "admin" || nome == "administrador"){
            System.out.println("Usuário inválido");
        } else {
            System.out.println(nome + "cadastrado com sucesso");
        }
    }
}
