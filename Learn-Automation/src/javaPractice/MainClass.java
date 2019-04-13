package javaPractice;

abstract class AbstractDemo {
    abstract void m1();
    abstract void m2();
}
class Sample1 extends AbstractDemo{
    void m1() {
        System.out.println("m1() defined in sample1 class");
    }
    void m2() {
        System.out.println("m2() defined in sample1 class");
    }
}
class MainClass{
    public static void main(String [] args) {
        System.out.println("pgm started");
        Sample1 s1 = new Sample1();
        s1.m1();
        s1.m2();
        System.out.println("pgm ended");
    }
    
}