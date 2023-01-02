/* 
public class Aula {
    public static void main(String [] args) {
        float salary = 5000.00F;
        float result = salary * 0.3F;
        System.out.println("30% eh: " + result);
        result = salary * 0.15F;
        System.out.println("15% eh: " + result);
        result = salary * 0.05F;
        System.out.println("5% eh: " + result);
    }

*/


public class CalculadorPorcentagemSalario {
    public static void main(String[] args) {
        Float salario = 5000.00F;
        float porcentagem = 0.3F;
        float resultado = salario * porcentagem;
        System.out.println("30% de 5000.00 é: " + resultado);
    }
}
