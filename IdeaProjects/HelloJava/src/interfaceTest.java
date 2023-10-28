// use keyword interface to create an interface.
interface myInterface1 {
    // Variables in interface are public, static and final by default.
    String NAME = "Interface";

    // methods are  abstract and public by default.
    public void method1();
}

interface myInterface2 {
    // we can explicitly define variable in interface as public, static and/or final, or just like that of myInterface1.
    public final String ID = "1001";

    public void method2();
}

// myInterface3 has method of myInterface2, it extends from myInterface2.
interface myInterface3 extends myInterface2 {
    public void method3();
}

// class interfaceTest must implement all the three methods of upper interfaces.
public class interfaceTest implements myInterface1, myInterface3 {
    /*
     * this class has three methods from three interfaces
     * also gets the two interfaces' variables
     */
    // implement method1()
    public void method1() {
        System.out.println("implement method1.");
    }

    // implement method2()
    public void method2() {
        System.out.println("implement method2.");
    }

    // implement method3()
    public void method3() {
        System.out.println("implement method3.");

    }

    public static void main(String[] args) {
        // test the methods
        interfaceTest test = new interfaceTest();
        test.method1();
        test.method2();
        test.method3();
        System.out.println("I have properties:" + interfaceTest.NAME + ", " + interfaceTest.ID);
    }
}


