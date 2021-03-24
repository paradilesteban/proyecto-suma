
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import javax.rmi.CORBA.Util;
import java.util.Scanner;

public class SumaMain {
    

    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        
        System.out.println("Digite primer numero");
        int num1=entrada.nextInt();
        
        System.out.println("Digite segundo numero");
        int num2 =entrada.nextInt();
        
        Suma mensajero =new Suma(num1,num2);
        mensajero.imprimir();
        
    }
}
