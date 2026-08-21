//Clase
public class Profesor {
    //Atributos
    private String nombre;
    private String especialidad;
    private int horasDisponibles;
    private boolean estaDictandoClases;

    //Constructores
    public Profesor(){

    }

    public Profesor(String nombre, String especialidad, int horasDisponibles, boolean estaDictandoClases) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horasDisponibles = horasDisponibles;
        this.estaDictandoClases = estaDictandoClases;
    }

    //Metodos
    public void iniciarClase(){
        System.out.println("Iniciando la clase de profesor "+this.nombre);

    }
    public void terminarClase(){
        System.out.println("Terminando la clase de profesor "+this.nombre);

    }
    public void agregarHoras(int horas){
        this.horasDisponibles += horas;

    }
}
