package modificadoresacceso;

public class CuentaBancaria 
{
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) 
    {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() 
    {
        return titular;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setTitular(String titular) 
    {
        this.titular = titular;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    public void depositar(double monto) 
    {
        saldo += monto;
    }

    public void retirar(double monto) 
    {
        saldo -= monto;
    }

    public void mostrar() 
    {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n");
    }
}