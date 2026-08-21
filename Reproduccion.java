public class Reproduccion {

    // 1. Atributos
    private String nombreUsuario;
    private String fecha;
    private int minutoActual;
    private boolean estaTerminada;

    // 2. Constructores
    public Reproduccion() {
    }

    public Reproduccion(String nombreUsuario, String fecha, int minutoActual, boolean estaTerminada) {
        this.nombreUsuario = nombreUsuario;
        this.fecha = fecha;
        this.minutoActual = minutoActual;
        this.estaTerminada = estaTerminada;
    }

    // 3. Métodos
    public void iniciarReproduccion() {
        System.out.println("Iniciando Reproduccion");
    }

    public void avanzarMinutos(int minutos) {
        System.out.println("La película está en el minuto " + this.minutoActual + ". Siga disfrutando.");
    }

    public void finalizarReproduccion() {
        System.out.println("¿Ha finalizado la reproducción? " + this.estaTerminada);
    }

}

