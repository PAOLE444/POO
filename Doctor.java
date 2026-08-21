public class Doctor {
    private String nombre;
    private String especialidad;
    private Boolean disponibilidad;

    public Doctor(String nombre, String especialidad, Boolean disponibilidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.disponibilidad = false;
    }
    public void disponibilizar(){
        System.out.println("Disponibilizando al doctor "+this.nombre);
    }
    public void especialidad(){
        System.out.println("Especialidad en  "+this.especialidad);
    }
}
