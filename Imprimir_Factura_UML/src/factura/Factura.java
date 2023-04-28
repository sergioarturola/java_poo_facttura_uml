package factura;

import java.util.ArrayList;

public class Factura {
    
    private int idFactura;
    private String fecha;
    private Cliente cliente;
    //private Producto p;
    public ArrayList<Producto>lista_productos = new ArrayList<Producto>();
    
    public Factura(int idFactura, String fecha, Cliente cliente){
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        /*
        Producto p = new Producto("Crema ponds", 123.67, 4);
        agregarProducto(p);
        */
        

    }
    
    public void agregarProducto(Producto p){

        lista_productos.add(p);
        /*
         lista_productos.add(new Producto("Celulares", 150.50, 45));
        esto funciono
        Producto p= new Producto("Celulares", 150.50, 45);
        lista_productos.add(p);
        */
        

        
    }
    
    public void mostrarDatos(){
        
        System.out.println("---- Factura "+idFactura+" ----");
        System.out.println("A nombre de: "+ cliente.getNombre());
        System.out.println("** Productos Seleccionados **");
        System.out.println("");
        for(int i = 0; i<lista_productos.size(); i++){
            
            System.out.println("Nombre producto: "+ lista_productos.get(i).getNombre_producto());
            System.out.println("Precio producto: "+ lista_productos.get(i).getPrecio());
            System.out.println("Cantidad producto: "+ lista_productos.get(i).getCantidad());
            
        }
        System.out.println("*****************");
    
        System.out.println("Fecha: "+ fecha);
        System.out.println("-------------------------------");          
    }
    
}
