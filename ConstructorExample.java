class Temp {
    private Temp(int data){
        System.out.println(" Constructor called ");
    }
    protected static Temp create(int data){
        Temp obj = new Temp(data);
        return obj;
    }
    public void myMethod() {
        System.out.println (" Method called ");
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Temp obj = Temp.create(20);
        obj.myMethod();
    }
}
