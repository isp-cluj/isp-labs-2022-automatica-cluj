package isp.lab2;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
        //1. generate random number
        Random r = new Random();
        int n = 2+r.nextInt(8); 
        int[] v = new int[n];

        
        Scanner consola = new Scanner(System.in);    
        for(int i=0;i<v.length;i++){
            System.out.println("Introducet numarul si apoi apasati ENTER:");
            v[i] = consola.nextInt();
        }

        return v;
        //throw new UnsupportedOperationException();
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        double arithmeticalMean = 0;
    
        for(int k:userNumbers){
            arithmeticalMean = arithmeticalMean + k;
        }

        return arithmeticalMean / userNumbers.length;        
//throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
