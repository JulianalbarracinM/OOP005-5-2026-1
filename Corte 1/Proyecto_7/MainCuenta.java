package modificadoresacceso;

public class MainCuenta 
{
    public static void main(String[] args) 
    {
        CuentaBancaria c1 = new CuentaBancaria("Maria", 100000);

        c1.mostrar();

        c1.depositar(25000);
        c1.retirar(10000);

        c1.mostrar();

        CuentaBancaria c2 = new CuentaBancaria("Mario", 50000);

        c2.mostrar();

        c2.setSaldo(75000);
        c2.setTitular("Alejandro");

        System.out.println(c2.getSaldo());
        System.out.println(c2.getTitular());
    }
}