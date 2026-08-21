//Clase
public class Vehiculo {
    //Atributos
    private String patente;
    private String marca;
    private int horaIngreso;
    private boolean estaEstacionado;

    //Contructores
    public Vehiculo(){

    }

    public Vehiculo(String patente, String marca, int horaIngreso, boolean estaEstacionado) {
        this.patente = patente;
        this.marca = marca;
        this.horaIngreso = horaIngreso;
        this.estaEstacionado = true;
    }
    //Metodos
    public void ingresar (){
        System.out.println("Ingresando Vehiculo "+this.patente+this.marca+this.horaIngreso);

    }
    public void salir (){
        System.out.println("Saliendo vehiculo "+this.patente);

    }
    public void calcularTiempoEstacionado (int horaDeSalida) {
        int tiempoTotal= horaDeSalida+horaIngreso; //Esto se lo pregunte a la IA porque no sabia como se hacia en estos casos de calcular cosas(no recuerdo que lo explicara en clases)
        System.out.println("El tiempo estacionado es  "+ tiempoTotal);

    }


}

