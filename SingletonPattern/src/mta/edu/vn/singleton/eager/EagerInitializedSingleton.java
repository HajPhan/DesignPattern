package mta.edu.vn.singleton.eager;

/**
 * The method doesn't provide any options for exception handling
 */

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
