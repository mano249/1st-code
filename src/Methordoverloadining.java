class Methordoverloadining {
    void display(int a , double b){
     System.out.println("Methord 1");
    }
    void display(int a , double b,  double c){
        System.out.println("Methord 2");
    }
    public static void main(String[] args) {
        Methordoverloadining mol = new Methordoverloadining();
        mol.display(  1 ,3.2);
        mol.display(2,3.12 ,2.2256);
    }
}
