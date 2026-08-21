//Clase
public class Pelicula {

    //Atributooos
    private String titulo;
    private int duracion;
    private String categoria;
    private boolean estaDisponible;

    //Constructores
    public Pelicula(){ // Puse este vacio porque dijo que solian existir 2 pero no recuerdo para que era

    }
    public Pelicula(String titulo, int duracion, String categoria, boolean estaDisponible) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.categoria = categoria;
        this.estaDisponible = estaDisponible;
    }
    //Metodos


        public void reproducir (){
            System.out.println("La pelicula"+this.titulo+"Esta empezando callese!");
    }
        public void pausar (){
            System.out.println("Pelicula pasusada, mire su celular o haga lo que quiera ");
        }


        public void cambiarDisponibilidad ( boolean estado) {
            this.estaDisponible = estado;
            System.out.println("¿La pelicula está disponible ahora?" + this.estaDisponible);
        }


}




