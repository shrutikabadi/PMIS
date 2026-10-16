package Day9;

//Qs1

class Locker<T>{
    private T obj;

    void put(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }

}

public class gen3 {
    public static void main(String[] args) {

        Locker<String> srish = new Locker<>();
        srish.put("New Book");

        System.out.println("Srishti's locker item: "+srish.get());

        Locker<Integer> shruti = new Locker<>();
        shruti.put(1243);

        System.out.println("Shruti's locker code: "+ shruti.get());
    }

}
