public interface MyInterface {
    void method1(); //metoda w interfejsie nie posiada ciała, ponieważ interfejs nie posiada logiki
    void method2(int a); //każda metoda w interfejsie jest abstrakcyjna i publiczna

    double PI = 3.14; // interfejs może zawierać stałe, kontener na stałe
}
