package isp.lab2;


import java.util.logging.Logger;

/**
 * @author mihai.hulea
 */
public class Example {

    public static Logger LOG = Logger.getLogger(Example.class.getName());

    public static void workWithString(){
        String s = "calculator,tema,laborator";

        String[] result = s.split(",");

        for(int i=0;i<result.length;i++){
            System.out.println("first char="+result[i].charAt(0));
        }
    }
    /**
     * Add x and y.
     *
     * @param x
     * @param y
     * @return result of the sum.
     */
    public static int add(int x, int y) {
        return x + y;
    }

    public static int substract(int x, int y) {
        return 0;
    }

    public static void main(String[] args) {

workWithString();

//        System.out.println("It works!");
//        LOG.info("It works!");
//        System.out.println("Number of arguments received: " + args.length + " ");
//        for (String arg : args)
//            System.out.println("Argument: " + arg);
//        System.out.printf("Result of adding %d with %d is: %d\n\n", 10, 23, Example.add(10, 23));
    }
}
