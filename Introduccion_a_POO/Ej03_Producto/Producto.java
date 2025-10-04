package Introduccion_a_POO.Ej03_Producto;
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser positiva.");
        } else if (this.stock >= cantidad) {
            this.stock -= cantidad;
            System.out.println("Venta realizada. Stock actual: " + this.stock);
        } else {
            System.out.println("Stock insuficiente para realizar la venta.");
        }
    }
    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Reabastecimiento realizado. Stock actual: " + this.stock);
        } else {
            System.out.println("La cantidad a reabastecer debe ser positiva.");
        }
    } 
    public int getStock() {
        return this.stock;
    }
    public void mostrarProducto() {
        System.out.println("--- Producto: " + this.nombre + " ---");
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop Gamer", 1500.00, 10);
        laptop.mostrarProducto();
        laptop.vender(3);
        laptop.reabastecer(5);
        laptop.mostrarProducto();
        laptop.vender(15);
    }
}