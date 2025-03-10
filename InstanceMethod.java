public class InstanceMethod {
    
        static int staticVar1 = 10;
        
        public void instanceMethod() {
            System.out.println("Static Variable: " + staticVar1);
        }
    
        public static void main(String[] args) {
            InstanceMethod example = new InstanceMethod();
            example.instanceMethod();
        }
    }