import java.util.*;
public class Ex16 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        double salario, emprestimo, parcelas, ValorParcelas, Valoremprestimook;

        System.out.println(" Informe o salário do colaborador : ");

        salario = in.nextDouble();

        System.out.println(" Informe o valor de emprestimo desejado: ");

        emprestimo = in.nextDouble();

        System.out.println( " Inform e o numero de parcelas a pagar : ");

        parcelas = in.nextDouble();

        ValorParcelas = emprestimo / parcelas;

        Valoremprestimook = salario * 0.3;

        if ( ValorParcelas <= Valoremprestimook ) {
            System.out.println(" Concedido empréstimo de " + emprestimo + " com parcelas de :" + ValorParcelas);
        }
        else{   System.out.println(" Não foi possivel realizar devido saldo baixo.");}




    }
    
}
