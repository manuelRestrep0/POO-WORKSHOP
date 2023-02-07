public abstract class Embarcacion {
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
    public abstract long calcularAlquiler();


}
