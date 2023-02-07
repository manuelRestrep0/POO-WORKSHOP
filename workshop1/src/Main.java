public class Main {
    public static void main(String[] args) {
        // constructor capitan
        Capitan cap = new Capitan("Manuel", "Restrepo", 123);
        // constructor yates
        Yate yateLujoso = new Yate(cap, 2019, 50, 8);
        Yate yateSinLujo = new Yate(cap, 2019, 50, 6);
        Yate yate = new Yate(cap, 2021, 50, 8);
        // constructor veleros
        Velero veleroGrande = new Velero(cap, 2019, 40, 5);
        Velero veleroPequeno = new Velero(cap, 2019, 20, 3);
        Velero velero = new Velero(cap, 2021, 50, 8);

        Makaia makaia = new Makaia();
        //alquier de embarcaciones
        System.out.println("--------------------");
        makaia.alquilarEmbarcacion(yateLujoso);
        System.out.println("--------------------");
        makaia.alquilarEmbarcacion(yateSinLujo);
        System.out.println("--------------------");
        makaia.alquilarEmbarcacion(yate);
        System.out.println("--------------------");
        makaia.alquilarEmbarcacion(veleroGrande);
        System.out.println("--------------------");
        makaia.alquilarEmbarcacion(veleroPequeno);
        System.out.println("--------------------");
        makaia.alquilarEmbarcacion(velero);
        System.out.println("--------------------");

        //Compra de yates
        makaia.comprarYate(yateLujoso);
        System.out.println("--------------------");
        makaia.comprarYate(yateSinLujo);
        System.out.println("--------------------");
        makaia.comprarYate(yate);
    }
}