class Base{
    Base() {
        System.out.println("Base");
    }
}
public class ConstructorExample3 extends Base{
    ConstructorExample3() {
        System.out.println("ConstructorExample3");
    }
    public static void main(String[] args) {
        new ConstructorExample3();
        new Base();
    }
}
