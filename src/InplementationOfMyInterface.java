public class InplementationOfMyInterface implements MyInterface, MyInterfaca2{ //można inplementować wiele interfejsów

    @Override
    public void method1() {
        System.out.println("abc");
    }

    @Override//Każda metoda zadeklarowana w interfejsie musi zostać zainicjalizowana w subclassie
    public void method2(int a) {
        System.out.println(a);

    }

    @Override
    public void method3(int a) {

    }
}
