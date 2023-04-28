package factura;

public class Producto {
    private String nombre_producto;
    private double precio;
    private int cantidad;
    
    public Producto(String nombre_producto, double precio, int cantidad){
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

}
