import java.util.Objects;

public class Main {

    //primitive data type
    //integer data type
    static byte byteVar = 1; // ^8
    static short shortVar = 1; // ^16
    static int intVar = 11; // ^32
    static long longVar = 1; // ^64
    //float numbers
    static float floatVar = 1.099f;
    static double doubleVar = 1.9d;
    //symbols
    static char charVar = '0';
    // logical
    static boolean boolVar = false;


    //operators
    //assignment =
    //arithmetical + - * / %
    //comparing operators == != > < >= <=
    //logical operators & | && || !
    public static void main(String[] args) {
        System.out.println("int overflow : " + Integer.MAX_VALUE * intVar);
        System.out.println("short overflow : " + shortVar + Short.MAX_VALUE);
        System.out.println("byte overflow : " + byteVar + Byte.MAX_VALUE);
        System.out.println("long overflow : " + longVar + Long.MAX_VALUE);
        System.out.println("float overflow : " + (floatVar - Float.MAX_VALUE));
        System.out.println("double overflow : " + doubleVar + Double.MAX_VALUE);
        System.out.println("char overflow : " + ((int) charVar + Character.MAX_VALUE));
        System.out.println();

        System.out.println("quick math:");
        System.out.println("2 plus 2 is greater than 5 : " + ((2 + 2) > 5));
        System.out.println("2 plus 2 is lower than 5 and greater than 3: " + ((2 + 2) < 5 && (2 + 2) > 3));
        System.out.println(((2 + 2) == 4) ? "yes, 2 plus 2 is 4" : "something went wrong");
        System.out.println();

        if (intVar > 10 || intVar % 2 != 0)
            System.out.println("yep, it's greater than 10 or it could be an odd number");


        System.out.println();

        System.out.println("what if");
        System.out.println(intVar + doubleVar + " double + int");
        System.out.println();
        int weekDay = (int) (Math.random() * 8);

        switch (weekDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("IT IS WEDNESDAY MY DUDES");
            case 4 -> System.out.println("Thursday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("ayo wtf");
        }


    }

    public static String oddOrEven(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }


}
