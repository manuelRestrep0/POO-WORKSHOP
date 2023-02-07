import java.util.Scanner;

public class Makaia {
    public void alquilarEmbarcacion(Embarcacion embarcacion){
        System.out.println("Ingrese el numero de dias que va a alquilar la embarcacion");
        Scanner scanner = new Scanner(System.in);
        long precioTotal = embarcacion.calcularAlquiler()*(scanner.nextInt());
        System.out.println("El precio total del alquiler es: "+precioTotal);
    };
    public void comprarYate(Yate yate){
        System.out.println("El precio para comprar este yate es: "+yate.calcularAlquiler()*50);
    };
}
