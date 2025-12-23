class mainn {
    public static void main(String[] args) {
        System.out.println("method started");

        Demo3 d1 = new Demo3();
        System.out.println("new addr----" + d1);

        d1.x=300;
        d1.y=200;
        System.out.println(d1.x);
        System.out.println(d1.y);
        d1=new Demo3();
        System.out.println(d1.x);
        System.out.println(d1.y);


    }
}

