import jdk.swing.interop.SwingInterOpUtils;

public class planEntrenamiento {
    private String nombrePlan;
    private int duracion;
    private String objetivoDelPlan;
    private String nivelDeDificultad;

    public planEntrenamiento(String nombrePlan, int duracion, String objetivoDelPlan, String nivelDeDificultad) {
        this.nombrePlan = nombrePlan;
        this.duracion = duracion;
        this.objetivoDelPlan = objetivoDelPlan;
        this.nivelDeDificultad = nivelDeDificultad;
    }
    public void obejtivoDelPlan(){
        System.out.println("El objetivo de este plan es "+objetivoDelPlan);
    }
    public void NivelDeDificultad(){
        System.out.println("Este plan tiene un nivel de dificultad "+nivelDeDificultad);
    }
    public void setNombrePlan(){
        System.out.println("Su plan es "+nombrePlan);
    }
}
