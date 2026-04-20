package Matriz3x3;

public class Matriz3x3 {

    private int[][] data;
    private int filas;
    private int columnas;

    public Matriz3x3() {
        this.filas = 3;
        this.columnas = 3;
        this.data = new int[filas][columnas];
    }

    public void setValor(int fila, int columna, int valor) {
        data[fila][columna] = valor;
    }

    public int getValor(int fila, int columna) {
        return data[fila][columna];
    }

    public Matriz3x3 sumar(Matriz3x3 otra) {
        Matriz3x3 resultado = new Matriz3x3();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int suma = this.getValor(i, j) + otra.getValor(i, j);
                resultado.setValor(i, j, suma);
            }
        }

        return resultado;
    }

    public Matriz3x3 multiplicar(Matriz3x3 otra) {
        Matriz3x3 resultado = new Matriz3x3();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                int valor = 0;

                for (int k = 0; k < columnas; k++) {
                    valor += this.getValor(i, k) * otra.getValor(k, j);
                }

                resultado.setValor(i, j, valor);
            }
        }

        return resultado;
    }

    public void imprimir() {
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(getValor(i, j) + " ");
            }
            System.out.println();
        }
    }
}
