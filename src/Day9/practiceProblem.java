package Day9;

class Box1<T> {
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}

public class practiceProblem {
    public static void main(String[] args) {
        Box1<String> mobile = new Box1<>();
        mobile.setItem("Samsung");

        Box1<Integer> price = new Box1<>();
        price.setItem(25000);

        System.out.println("Mobile: "+ mobile.getItem());
        System.out.println("Price: "+ price.getItem());
    }
}
