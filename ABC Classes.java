public class abc {
    public static void main(String[] args) {
        // Defining class A inside main
        class A {
            void display() {
                System.out.println("This is class A");
            }
        }

        // Defining class B inside main
        class B {
            void display() {
                System.out.println("This is class B");
            }
        }

        // Defining class C inside main
        class C {
            void display() {
                System.out.println("This is class C");
            }
        }

        // Creating objects and calling methods
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.display();
        objB.display();
        objC.display();
    }
}
