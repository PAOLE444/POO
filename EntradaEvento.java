//Clase
public class EntradaEvento {
    //Atributos
    private String nombreEntradaEvento;
    private boolean accesovalidado;
    private int valorEntradaEvento;

    //Constructores

    public EntradaEvento() {

    }
    public EntradaEvento(String nombreEntradaEvento, String accesoEntradaEvento, int valorEntradaEvento) {
        this.nombreEntradaEvento = nombreEntradaEvento;
        this.accesovalidado = true;
        this.valorEntradaEvento = valorEntradaEvento;
    }
    //Metodos
    public void NombreEntradaEvento() {
        System.out.println("El nombre de esta entrada es "+ nombreEntradaEvento);
    }
    public void valorEntradaEvento() {
        System.out.println("El valor de esta entrada es "+ valorEntradaEvento);

    }
}
