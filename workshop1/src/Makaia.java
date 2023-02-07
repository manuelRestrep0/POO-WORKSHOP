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

    public void confirmarTamanoVelero(Velero velero){
        if(velero.esGrande()){
            System.out.println("numero de mastiles: "+velero.getCantidadDeMastiles()+", Este velero es grande.");
        } else{
            System.out.println("numero de mastiles: "+velero.getCantidadDeMastiles()+", Este velero no es grande.");
        }
    }
    public void confirmarLujoYate(Yate yate){
        if(yate.calcularLujo()){
            System.out.println("numero de camarotes: "+yate.getCantidadDeCamarotes()+", Este yate es lujoso");
        } else{
            System.out.println("numero de camarotes: "+yate.getCantidadDeCamarotes()+", Este yate no es lujoso");
        }
    }
}
