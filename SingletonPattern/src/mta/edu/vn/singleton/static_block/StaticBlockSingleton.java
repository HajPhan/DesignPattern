package mta.edu.vn.singleton.static_block;


import mta.edu.vn.singleton.eager.EagerInitializedSingleton;

/**
 * Static block initialization implementation is similar to eager initialization
 * Except that instance of class is created in the static block that provides option for exception handling
 */
public class StaticBlockSingleton {

    public static int a = 10;

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {

    }

    //static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating sigleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
