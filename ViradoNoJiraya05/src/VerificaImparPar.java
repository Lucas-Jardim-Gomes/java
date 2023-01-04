public class VerificaImparPar {
   public static void main(String[] args) {
    float numero = 269F;
    float vericador = numero % 2;
    if (vericador == 0){
        System.out.println("O número " + numero + " é par");
    } else {
        System.out.println("O número " + numero + " é impar");
    }
   } 
}


/*
 numero % 2 = 0
Uma maneira simples e rápida de saber se um número é ímpar ou par. Para fazer tal verificação é necessário fazer a operação com o símbolo de porcentagem (%) e o dois, caso o resultado da operação for 0 (zero) significa que o resultado é par caso contrario o resultado é ímpar.
 */