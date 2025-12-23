class P12 {
    public static void main(String[] args) {
        System.out.println("main started");
        Demo1 d = new Demo1();
        Demo1 d1 = new Demo1();
        System.out.println("memory addr-------"+d);
        System.out.println("memory addr-------"+d1);
        d.p2();
        System.out.println("main ended");
    }

    public static class Demo1 {
        int x = 100;
        int y = 200;
        
        

        void p2() {
            System.out.println("test() method");
        }
    }
}



arjun--starcodi
