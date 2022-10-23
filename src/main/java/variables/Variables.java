package variables;

public class Variables {

    //Primitive variables or fields
    int x;
    static int y = 10;

    boolean flag1;
    static boolean flag2 = true;

    // float is not recommended, use double instead
    double d1;
    double d2 = 123.57;

    //Declaring Multiple Variables
    int i1, i2, i3 = 0;

    public static void main(String[] args) {

        System.out.println("Printing an integer value : " + y);
        System.out.println("Printing a boolean value : " + flag2);
    }

} //class
