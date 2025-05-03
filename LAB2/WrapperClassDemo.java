public class WrapperClassDemo {
    public static void main(String[] args) {
        // Primitive data types
        int a = 10;
        double b = 5.5;
        char c = 'X';
        boolean d = true;


        // Autoboxing: Converting primitives to wrapper objects
        Integer intObj = a;
        Double doubleObj = b;
        Character charObj = c;
        Boolean boolObj = d;


        // Displaying wrapper objects
        System.out.println("Wrapper Integer object: " + intObj);
        System.out.println("Wrapper Double object: " + doubleObj);
        System.out.println("Wrapper Character object: " + charObj);
        System.out.println("Wrapper Boolean object: " + boolObj);


        // Unboxing: Converting wrapper objects back to primitives
        int unboxedInt = intObj;
        double unboxedDouble = doubleObj;
        char unboxedChar = charObj;
        boolean unboxedBool = boolObj;


        // Displaying unboxed values
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Unboxed double: " + unboxedDouble);
        System.out.println("Unboxed char: " + unboxedChar);
        System.out.println("Unboxed boolean: " + unboxedBool);
    }
}
