//Clase
public class Mesa {
//Atributos
    private int numeroDeMesa;
    private int capacidad;
    private String estadoDeMesa;
    private String ordenDeMesa;

    //Constructores
public Mesa (){

}
    public Mesa(int numeroDeMesa, int capacidad, String estadoDeMesa, String ordenDeMesa) {
        this.numeroDeMesa = numeroDeMesa;
        this.capacidad = capacidad;
        this.estadoDeMesa = estadoDeMesa;
        this.ordenDeMesa = ordenDeMesa;
    }
    //metodos:Son las acciones que hace esta clase
public void ocuparMesa(){
    this.estadoDeMesa = "Ocupada";
    System.out.println("La mesa número "+this.numeroDeMesa+" Ahora está ocupada ");
}
public void pedirComida(String Comida){
    this.ordenDeMesa = "Comida";
    System.out.println("La mesa "+ this.numeroDeMesa+"Pidio "+ Comida);
}
public void liberarMesa(){
    this.estadoDeMesa = "Libre";
    this.ordenDeMesa = "Nada";
    System.out.println("la mesa número "+this.numeroDeMesa+"Esta disponible ");
}
}

