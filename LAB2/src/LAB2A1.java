public class LAB2A1 {
    public static void main(String[] args) {
        CAR C=new CAR();
        C.CarName="CIVIC";
        C.CarModel=2020;
        C.CarPrice=24000;
        System.out.println("Car name is "+C.CarName);
        System.out.println("Car model is "+C.CarModel);
        System.out.println("Car price is "+C.CarPrice);
        C.Run();
        C.stop();
        C.drift();
    }
}
