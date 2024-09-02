public class ListaCompras {
    public static void main(String[] args) {
        // Precios de los productos
        double cocina = 299990;
        double lavadora = 234540;
        double comedor = 159990;
        double televisor = 345100;

        // Calcular el total
        double total = cocina + lavadora + comedor + televisor;

        // Calcular el IVA (19%)
        double iva = total * 0.19;

        // Calcular el total más IVA
        double totalConIva = total + iva;

        // Asumimos que el valor del dólar es 800 CLP
        double valorDolar = 800;

        // Calcular el total en dólares
        double totalEnDolares = totalConIva / valorDolar;

        // Mostrar los resultados
        System.out.println("Total sin IVA: $" + total);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total con IVA: $" + totalConIva);
        System.out.println("Total en dólares: $" + totalEnDolares);
    }
}
