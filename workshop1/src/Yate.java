public class Yate extends Embarcacion{

    private int cantidadDeCamarotes;
    public Yate(Capitan capitan,  int anoDeFabricacion, double longitudEnMetros, int cantidadDeCamarotes) {
        super(capitan, anoDeFabricacion, longitudEnMetros);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }

    public boolean calcularLujo(){
        if(cantidadDeCamarotes>7) return true;
        else return false;
    };

    public int getCantidadDeCamarotes() {
        return cantidadDeCamarotes;
    }
}
