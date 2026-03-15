package com.mycompany.treinandoarrays1;
import java.util.Scanner;

/**
 *
 * @author JJ
 */

public class TreinandoArrays1 {
    public int [] data ;
    public int n;
    public Scanner Scanner;

// Constructor : crea el vector
    public TreinandoArrays1( int n ) {
       this.n = n ;
       this.data = new int[n];
       this.Scanner = new Scanner(System.in);
    }
    
    public void print( String name ) {
    System.out.print(name + " = [ " ) ;
       for (int i = 0; i < n ; i ++) {
           System . out . print ( data [ i ]) ;
           if(i < n - 1) System . out . print ( " , " ) ;
       }
       System.out.println(" ] ") ;
              
}    public void IngresarDatos(){
       System.out.println("Ingrese " + data.length + " numeros:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            // 2. Usar scanner.nextInt() para guardar en el arreglo
            data[i] = Scanner.nextInt(); 
        }
        System.out.println("Arreglo cargado");
    }

    public int sum(){
        int s=0;
        for (int i = 0 ; i<n ; i++) {
            s +=data [i];
                }
        System.out.println(s);
        return s;
    }
    
    public double mean(){
        double h;
        if (n == 0 )return 0.0;
        h= (double) sum()/ (double) n;
        System.out.println(h);
        return h;     
    }
    
    public int max(){
        int m= data[0];
        for (int i = 1; i<n;i++){
            if (data[i]>m ) m = data [i];
            }
        System.out.println(m);
        return m;
    }
    public int min(){
        int m= data[0];
        for (int i = 1; i>n;i++){
            if (data[i]<m ) m = data [i];
            }
        System.out.println(m);
        return m;
    }
        
    public static void main(String[] args) {
        TreinandoArrays1 ob1 = new TreinandoArrays1(4); 
        ob1.IngresarDatos();
        ob1.print("Hola");
        ob1.sum();
        ob1.mean();
        ob1.max();
        ob1.min();
      
    }
}