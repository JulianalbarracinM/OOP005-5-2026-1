package calculadora;


public class Calculadora {
    public int x1, x2;
    
    public Calculadora(int a, int b){
        x1 = a;
        x2 = b;
    }
    
    public int add(){
        return x1+x2;
     }
    
    public int subs(){
        return x1-x2;
     }
    
    public int mult(){
        return x1*x2;
    }

    public float div(){
        return x1/x2;
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora m = new Calculadora(34,43);
        Calculadora n = new Calculadora(10,2);
        
        System.out.println("La suma de objeto m es"+m.add());
        System.out.println("La resta de objeto m es"+m.subs());
        System.out.println("La mult de objeto m es"+m.mult());
        System.out.println("La div de objeto m es"+m.div());
        
        System.out.println("La suma de objeto n es"+n.add());
        System.out.println("La resta de objeto n es"+n.subs());
        System.out.println("La mult de objeto n es"+n.mult());
        System.out.println("La div de objeto n es"+n.div());
    }
    
}
