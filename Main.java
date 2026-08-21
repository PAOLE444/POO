public class Main {
    public static void main(String[] args) {

        System.out.println(" PRUEBA DEL ESTACIONAMIENTO ");

        Vehiculo miAutito = new Vehiculo("AB-12-CD", "Toyota", 10, true);

        miAutito.ingresar();
        miAutito.salir();
        miAutito.calcularTiempoEstacionado(15);


        System.out.println("PRUEBA DEL RESTAURANTE ");

        Mesa miMesa = new Mesa(5, 4, "Libre", "Nada");
        miMesa.ocuparMesa();
        miMesa.pedirComida("Pizza familiar y 4 bebidas");
        miMesa.liberarMesa();
    }
}
// Esto lo hizo la IA porque no me acuerdo como hacer esta parte y tampoco si usted la explico