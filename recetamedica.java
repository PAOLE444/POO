public class recetamedica {
    private String nombrePaciente;
    private String fechaEmision; //aca no me acuerdo como era para las fechas porque "date" me daba error y le pregunte a la IA y me dijo que en java se usaba LocalDate pero pos no me acuerdo que usted lo mencionara en clases
    private String tipoMedicamento;
    private String observacionesPrincipales;

    public recetamedica(String nombrePaciente, String fechaEmision, String tipoMedicamento, String observacionesPrincipales) {
        this.nombrePaciente = nombrePaciente;
        this.fechaEmision = fechaEmision;
        this.tipoMedicamento = tipoMedicamento;
        this.observacionesPrincipales = observacionesPrincipales;
    }
    public void fechaEmision(){
        System.out.println("Fechando recetamedica"+this.fechaEmision);

}
public String getNombrePaciente() {
        return nombrePaciente;
}
public void observacionesPrincipales(){
        System.out.println("Observaciones principales  "+this.observacionesPrincipales);
}


}
