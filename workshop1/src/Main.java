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
        System.out.println("yate lujoso--------------------");
        makaia.alquilarEmbarcacion(yateLujoso);
        System.out.println("yate sin lugo--------------------");
        makaia.alquilarEmbarcacion(yateSinLujo);
        System.out.println("yate completo--------------------");
        makaia.alquilarEmbarcacion(yate);
        System.out.println("velero grande--------------------");
        makaia.alquilarEmbarcacion(veleroGrande);
        System.out.println("velero pequeno--------------------");
        makaia.alquilarEmbarcacion(veleroPequeno);
        System.out.println("velero completo--------------------");
        makaia.alquilarEmbarcacion(velero);


        //Compra de yates
        System.out.println("compra yate lujoso--------------------");
        makaia.comprarYate(yateLujoso);
        System.out.println("compra yate sin lujo--------------------");
        makaia.comprarYate(yateSinLujo);
        System.out.println("compra yate completo.--------------------");
        makaia.comprarYate(yate);

        //metodo para ver si un velero es grande o no.
        System.out.println("------------------------");
        makaia.confirmarTamanoVelero(veleroGrande);
        System.out.println("------------------------");
        makaia.confirmarTamanoVelero(veleroPequeno);

        // metodo para ver si un yate es lujoso o no
        System.out.println("------------------------");
        makaia.confirmarLujoYate(yateLujoso);
        System.out.println("------------------------");
        makaia.confirmarLujoYate(yateSinLujo);
    }
}