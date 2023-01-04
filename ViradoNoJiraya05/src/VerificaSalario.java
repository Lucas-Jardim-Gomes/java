public class VerificaSalario {
    public static void main(String[] args) {
        float salario = 4700.00F;
        if (salario >= 4500.00){
            System.out.println( "30% de " + salario + " é: " + salario * 0.3F);
        } else {
            System.out.println("15% de " + salario + " é: " + salario * 0.15F);
        }
    }
}
