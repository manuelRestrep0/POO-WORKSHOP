public class Embarcacion {
    protected Capitan capitan;
    protected long precioBase=30000;
    protected long valorAdicional=0;
    protected int anoDeFabricacion;
    protected double longitudEnMetros;

    public Embarcacion(Capitan capitan, int anoDeFabricacion, double longitudEnMetros) {
        this.capitan = capitan;
        this.anoDeFabricacion = anoDeFabricacion;
        this.longitudEnMetros = longitudEnMetros;
    }
    public long calcularAlquiler(){
        if(anoDeFabricacion>2020){
            this.valorAdicional+=20000;
        }
        return (this.precioBase+this.valorAdicional);
    };


}
