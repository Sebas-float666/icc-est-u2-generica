import models.Caja;
import models.Par;

public class App {

    public static void main(String[] args) {

        System.out.println("=== PRÁCTICA DE CLASES GENÉRICAS ===\n");

        System.out.println("--- Uso de Caja<T> ---");

        // 3 implementaciones de Caja<T>
        Caja<String> cajaTexto = new Caja<>("Hola mundo");
        Caja<Integer> cajaEntero = new Caja<>(100);
        Caja<Double> cajaDecimal = new Caja<>(9.75);

        System.out.println("Caja de texto: " + cajaTexto.getContenido());
        System.out.println("Caja de entero: " + cajaEntero.getContenido());
        System.out.println("Caja de decimal: " + cajaDecimal.getContenido());
        System.out.println("¿La caja de texto está vacía?: " + cajaTexto.estaVacia());

        System.out.println("\n--- Uso de Par<K, V> ---");

        // 3 implementaciones de Par<K,V>
        Par<Integer, String> estudiante = new Par<>(1, "Juan Pérez");
        Par<String, Integer> edad = new Par<>("Edad", 20);
        Par<String, Double> promedio = new Par<>("Promedio", 8.75);

        System.out.println("Clave: " + estudiante.getClave() + " | Valor: " + estudiante.getValor());

        System.out.println("Clave: " + edad.getClave() + " | Valor: " + edad.getValor());

        System.out.println("Clave: " + promedio.getClave() + " | Valor: " + promedio.getValor());
    }
}
