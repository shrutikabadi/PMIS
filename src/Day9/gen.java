package Day9;

class Box<T>{
    private T item;
    void set(T item){
        this.item = item;
    }
    T get(){
        return item;
    }
}

class gen{
    public static void main(String[] args){
        Box<String> box = new Box<>();
        box.set("hello");
        String s = box.get();
        System.out.println(s);
    }
}