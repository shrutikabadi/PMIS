package RelationshipInheritance;
class Bank{
     final void claculateInterest(){
         System.out.println("Base interest calculation..");

     }
}

class Branch extends Bank{
    void calculateInterest(){
        System.out.println("Custom Interest..");
    }
}
public class finalPractice {
    public static void main(String[] args){
        Branch b1 =  new Branch();
        b1.claculateInterest();
    }
}
