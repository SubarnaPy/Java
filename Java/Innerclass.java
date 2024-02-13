//inner class---member,static,annonymous
class A {
    public void fly() {
        System.out.println("we can fly");
    }

    class B {
        public void show() {
            System.out.println("we can see");
        }

    }

    static class C {
        public void eat() {
            System.out.println("we can eat");
        }
    }
}

public class Innerclass {
    public static void main(String args[]) {
        A obj = new A();
        A.B obj1 = obj.new B();
        A.C obj2 = new A.C();
        obj.fly();
        obj1.show();
        obj2.eat();
    }

}