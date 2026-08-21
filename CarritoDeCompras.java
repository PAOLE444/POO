public class CarritoDeCompras {
    private double totalDelProducto;
    private String tipoProducto;
    private double precio;
    private  boolean estaActivo;

    public CarritoDeCompras(){

    }
    public CarritoDeCompras(double totalDelProducto, String tipoProducto, double precio, boolean estado) {
        this.totalDelProducto = totalDelProducto;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.estaActivo = true;
    }

    public void agregarAlCarrito() {

        System.out.println("Se agrego "+this.tipoProducto+"al carrito");
    }
    public void pagarCarrito(){
        this.estaActivo = false;
        System.out.println("Se ha pagado un total de "+this.precio);
    }


}
