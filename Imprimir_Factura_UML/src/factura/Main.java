package factura;

public class Main {

    public static void main(String[] args) {
        
        ImprimirPDF impresora = new ImprimirPDF();
        
        Producto pa = new Producto("Lata de chiles", 23.67, 4);
        Producto pb = new Producto("Mayonesa", 25.5, 10); 
        Producto pc = new Producto("Cafe", 78.32, 6);
        Producto pd = new Producto("Leche", 20.5, 9);
        
        Cliente c1 = new Cliente("Rafael Candelario", 40);
        Factura f1 = new Factura(123, "2023-03-29", c1);
        f1.agregarProducto(pa);
        f1.agregarProducto(pb);
        
        Cliente c2 = new Cliente("Sergio Arturo", 30);
        Factura f2 = new Factura(111, "2023-02-15", c2);
        f2.agregarProducto(pc);
   
        impresora.imprimirFactura(f1);
        impresora.imprimirFactura(f2);
        

    }
    
}
