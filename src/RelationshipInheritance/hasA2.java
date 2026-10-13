package RelationshipInheritance;

class Battery{
    int capacitymaH;
    Battery(int capacitymaH){
        this.capacitymaH = capacitymaH;
    }

    void drain(){
        System.out.println("Drain... Remaining battery: "+ (capacitymaH - 100)+ " maH");
    }
}
class Camera{
    int pix;

    Camera(int pix){
        this.pix = pix;
    }

    void takePhoto(){
        System.out.println("clicked!!! Captured a photo with "+pix+ "sensor");
    }

}
class Phone{
    String brand;
    Battery battery;
    Camera camera;

    Phone(String brand, Battery battery, Camera camera){
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }
    void snapPicture(){
        System.out.println("[ "+brand+" ]"+" is active");
        camera.takePhoto();
        battery.drain();
    }
}

public class hasA2 {
    public static void main(String[] args){
        Battery batt = new Battery(250);
        Camera cam = new Camera(200);
        Phone ph = new Phone("Samsung", batt, cam);

        ph.snapPicture();
    }
}
