public class Yate extends Embarcacion{

    private int cantidadDeCamarotes;
    public Yate(Capitan capitan,  int anoDeFabricacion, double longitudEnMetros, int cantidadDeCamarotes) {
        super(capitan, anoDeFabricacion, longitudEnMetros);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }


    @Override
    public long calcularAlquiler() {
        if(calcularLujo()) super.precioBase+=50000;
        if(super.anoDeFabricacion>2020) super.valorAdicional+=20000;
        return (super.precioBase+super.valorAdicional);
    }

    public boolean calcularLujo(){
        if(cantidadDeCamarotes>7) return true;
        else return false;
    };
}
