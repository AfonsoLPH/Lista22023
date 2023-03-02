import java.util.*;
public class Ex5 {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        double numerador, denominador, resultado;

        System.out.println(" Digite 2 valores reais : ");

       numerador = in.nextDouble();
        denominador = in.nextDouble();

        resultado = numerador / denominador;

        if(denominador == 0){
            System.out.println(" Impossivel realizar operação");
        }
        else{
            System.out.println(" O resultado da operação é : " + resultado);
        
        }


    }
    
}
