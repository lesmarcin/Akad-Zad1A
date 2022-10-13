public class App {
    public static void main(String[] args) {

        InplementationOfMyInterface implementation = new InplementationOfMyInterface();
        implementation.method1();
        implementation.method2(5);

        MyClass myClass = new MyClass();
        myClass.method4(6);

        /*Klasy abstrakcyjne stosuje się jeśli ma się wiele ściśle połączonych
        ze sobą klas, z tymi samymi metodami, polami. Interfejsy stosuje się
        kiedy nie są ze sobą połączone ale mają robić te same rzeczy*/


    }
}
