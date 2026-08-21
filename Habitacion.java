//Clase
public class Habitacion {
    //Atributos
    private int numeroHabitacion;
    private String tipoHabitacion;
    private int precioPorNoche;
    private boolean estaDisponible;

    //Constructor
    public Habitacion(){

}
    public Habitacion(int numeroHabitacion, String tipoHabitacion, int precioPorNoche, boolean estaDisponible) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.estaDisponible = true;
    }
    //Metodos
    public void disponibilidad(){

    }
    public void ocuparHabitacion(){
        this.estaDisponible = false;
        System.out.println("La habitación "+this.numeroHabitacion+"Ahora esta ocupada ");
    }
    public void liberarHabitacion(){
        this.estaDisponible = true;
        System.out.println("La habitación"+this.numeroHabitacion+"Ahora esta liberada ");
    }
}
