import mta.edu.vn.singleton.static_block.StaticBlockSingleton;

import static mta.edu.vn.singleton.static_block.StaticBlockSingleton.a;

public class Main {

    private static String str = "";

    public static void main(String[] args) {
//        System.err.println(".. " + StaticBlockSingleton.a);
        System.err.println(".. " + a);

        System.out.println("Hello World!");
        System.err.println("Str = " + str);

//        Class<?> booleanClass = boolean.class;
//        System.err.println("::: " + booleanClass.getCanonicalName());

    }

    static {
        System.err.println("Block static ...");
        str = "hello static ...";
    }
}
