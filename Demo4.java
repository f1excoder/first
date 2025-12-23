class Demo3 {
    static int x = 10;
     int y = 20;

    public static void test() {
        System.out.println("test()");
    }
}

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("started");
        System.out.println(Demo3.x);
        System.out.println(new Demo3().y);
        Demo3.test();

        Demo3.x = 500;
        new Demo3().y = 400;

        System.out.println(Demo3.x);
        System.out.println(new Demo3().y);
        System.out.println("main ended");
    }
}
