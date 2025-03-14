package Recursion;

public class Begining {
    public static void main(String[] args) {
        printnum(1);

        //simple way -print(1);
        // 1 it calls the fuction
    }


//instead of doing this we can follow recursion
    public static void print(int i) {
        System.out.println(i);
        printnum2(2);
        // 2 it calls the next one
    }
        //9 now totally the program gets completed
    private static void printnum2(int i) {
        System.out.println(2);
        printnum3(3);
        // 3 it calls the next one
    }
        // 8 it completes and comes out of the body
    private static void printnum3(int i) {
        System.out.println(3);
        printnum4(4);
        // 4 it calls the last one
    }
    //7 it completes and comes out of the body

    private static void printnum4(int i) {
        System.out.println(4);
        //5 it completes
    }
    //6 comes out of the body

    //we don't have to do this multiple times , here is where recursion comes into picture
    private static void printnum(int i) {
        if(i<=5) {
            System.out.println(i++);
            printnum(i);
        }
        return;
        //as many times we call a function it will take memory separately so treat each call as
       // a separate funtion
        //the fuction should call itself only until the base condition get satisfied if base condition is not given
        //then there will be a infinite amount of funcion calls then tis will throw stak overflow error which means
        // the system storage get filled
        // *you can convert a recusion solution in to iteration and vise versa
        // * space complexity is not constant coz of recursive calls
    }

}

