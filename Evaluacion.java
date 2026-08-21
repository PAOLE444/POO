//Clase
public class Evaluacion {
    //Atributos
    private String nombreEvaluacion;
    private String fecha;
    private double ponderacion;
    private boolean estaRendida;

    //Constructor
    public Evaluacion() {

    }

    public Evaluacion(String nombreEvaluacion, String fecha, double ponderacion, boolean estaRendida) {
        this.nombreEvaluacion = nombreEvaluacion;
        this.fecha = fecha;
        this.ponderacion = ponderacion;
        this.estaRendida = false;
    }

    //Metodos
    public void aplicarPrueba(){
        System.out.println("La prueba"+this.nombreEvaluacion+" esta aplicada");

    }
    public void calificar(){
        System.out.println("Nombre "+this.nombreEvaluacion+"Fue calificada");

    }
    public void aplazarPrueba(){
        System.out.println("Nombre "+this.nombreEvaluacion+"Fue aplazada");
    }
    public void getNombreEvaluacion(String nombreEvaluacion, String fecha, double ponderacion) {



    }

}
