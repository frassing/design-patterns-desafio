package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {

//        Singleton
        System.out.println("Singleton - Lazy");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("Singleton - Eager");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("Singleton - Lazy Holder");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);



    }
}
