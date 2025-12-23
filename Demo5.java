class Demo5 {
    static int x = 10;
     int y = 20;

    public static void test() {
        System.out.println("test()");
    }
}

class Demo6{
    public static void main(String[] args) {
        System.out.println("started");
        System.out.println(Demo5.x);
        System.out.println(new Demo5().y);
        Demo5.test();

        Demo5.x = 500;
        new Demo5().y = 400;

        System.out.println(Demo5.x);
        System.out.println(new Demo5().y);
        System.out.println("main ended");
    }
}