public class rutabus {
    private int codigoBus;
    private String recorridoBus;
    private int horarioDeRecorrido;
    private boolean estadoOperacion;

    public rutabus(int codigoBus, String recorridoBus, int horarioDeRecorrido, boolean estadoOperacion) {
        this.codigoBus = codigoBus;
        this.recorridoBus = recorridoBus;
        this.horarioDeRecorrido = horarioDeRecorrido;
        this.estadoOperacion = true;
    }
    public void recoridoBus(){
        System.out.println("El bus recorrera  " + this.recorridoBus);
    }
    public void estadoOperacion(){
        System.out.println("El bus se encuentra "+this.estadoOperacion);
    }
    public void horarioDeRecorrido(){
        System.out.println("El horario de recorrido " + this.horarioDeRecorrido);
    }
}
