public class Velero extends Embarcacion {

    private int cantidadDeMastiles;
    public Velero(Capitan capitan,  int anoDeFabricacion, double longitudEnMetros, int cantidadDeMastiles) {
        super(capitan, anoDeFabricacion, longitudEnMetros);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

    @Override
    public long calcularAlquiler() {
        if(esGrande()){
            super.precioBase += 30000;
        }
        if(anoDeFabricacion>2020){
            super.valorAdicional+=20000;
        }
        return (super.precioBase+super.valorAdicional);

    }
    public boolean esGrande(){
        if(this.cantidadDeMastiles>4){
            return true;
        } else return false;
    };
}
