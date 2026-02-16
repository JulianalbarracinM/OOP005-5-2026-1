package calculator_example;

/**
 *
 * @author Julian JAM
 * 
 * Atributos = variables
 * Metodos = funciones
 * Objetos = 
 */
public class Calculator {
    public int x1, x2;
    
//Constructor (debe tener el mismo nombre que la clase)
    public Calculator(int a, int b){
        x1 = a;
        x2 = b;
    }
    
    public int add(){
        return x1 + x2;
    }
    
    public int subs(){
        return x1 - x2;
    }
    
    public int mult(){
        return x1 * x2;
    }
    
    public int div(){
        if (x2==0){
            System.out.println("No se puede dividir por 0");
        }
        return x1 / x2;
        
    }
    
    public static void main(String[] args) {
        Calculator m = new Calculator(34, 0);
        System.out.println("La suma con el objeto m es:" + m.add());
        System.out.println("La resta con el objeto m es:" +m.subs());
        System.out.println(m.mult());
        System.out.println(m.div());
       
    }
    
}
