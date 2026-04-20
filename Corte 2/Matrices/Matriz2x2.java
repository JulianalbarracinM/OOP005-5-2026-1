package matriz2x2;

public class Matriz2x2 {

    private int[][] data;
    private int filas;
    private int columnas;

    public Matriz2x2() {
        this.filas = 2;
        this.columnas = 2;
        this.data = new int[filas][columnas];
    }

    public void setValor(int fila, int columna, int valor) {
        data[fila][columna] = valor;
    }

    public int getValor(int fila, int columna) {
        return data[fila][columna];
    }

    public Matriz2x2 sumar(Matriz2x2 otra) {
        Matriz2x2 resultado = new Matriz2x2();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int suma = this.getValor(i, j) + otra.getValor(i, j);
                resultado.setValor(i, j, suma);
            }
        }
        return resultado;
    }

    public Matriz2x2 multiplicar(Matriz2x2 otra) {
        Matriz2x2 resultado = new Matriz2x2();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valor =
                        this.getValor(i, 0) * otra.getValor(0, j) +
                        this.getValor(i, 1) * otra.getValor(1, j);
                resultado.setValor(i, j, valor);
            }
        }
        return resultado;
    }
    public void imprimir() {
        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(getValor(i, j) + " ");
            }
            System.out.println();
        }
    }
}
