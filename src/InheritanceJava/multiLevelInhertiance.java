package InheritanceJava;

class device{
    void poweron(){
     System.out.println("Device powered on..");
    }
}
 class oldPhone extends device{
 void makeCall(){
       System.out.println("Calling the number...");
      }
 }

 class smartphone extends oldPhone{
   void dialnum(){
    System.out.println("Dialing the number...");
   }
 }

public class multiLevelInhertiance {
   public static void main(String[] args){
    smartphone sp = new smartphone();
    sp.makeCall();
    sp.dialnum();
    sp.poweron();
   }

}
