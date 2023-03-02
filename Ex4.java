import java.util.*;
public class Ex4 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int valor1, valor2;
        
        System.out.println( "Digite os valores :  ");

        valor1 = in.nextInt();
        valor2 = in.nextInt();

        if( valor1 > valor2){
            System.out.println(" o numero" + valor1 + " é maior");
        }
        else{
            System.out.println(" o numero " + valor2 + " é maior");
        }
    }
    
}
