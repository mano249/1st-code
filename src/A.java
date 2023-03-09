 class A {
    static void  b(int y) {
        System.out.println("Argument = " + y);
    }
    static void  b (int y, int x ) {
        System.out.println("Argument = " + y +" and 😍" + x );

    }

    public static void main(String[] args) {
        b(3, 5);
        b(8);

    }
}
