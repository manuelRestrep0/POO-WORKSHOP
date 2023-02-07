public class Velero extends Embarcacion {

    private int cantidadDeMastiles;
    public Velero(Capitan capitan,  int anoDeFabricacion, double longitudEnMetros, int cantidadDeMastiles) {
        super(capitan, anoDeFabricacion, longitudEnMetros);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

    public boolean esGrande(){
        if(this.cantidadDeMastiles>4){
            return true;
        } else return false;
    };

    public int getCantidadDeMastiles() {
        return cantidadDeMastiles;
    }
}
