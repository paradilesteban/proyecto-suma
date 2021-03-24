
public class Suma {
    int num1,num2,resultado;
    
    public Suma(int num1 , int num2){
    this.num1=num1;
    this.num2=num2;

    
    
    }
    
    public void Operacion(){
    
    resultado =num1 + num2;
    
    }
    
    public void imprimir(){
    Operacion();
        System.out.println("El resultado es " +resultado);
    
    }
            
    
}
