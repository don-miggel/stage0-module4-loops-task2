package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int outer = 2;
        while(outer <= printToInclusive){
            int inner = 1;
            int counter = 0;
            while(inner <= outer){
                if (outer % inner == 0)
                    counter++;
                inner++;
            }
            if (counter == 2)
                System.out.println(outer);
            outer++;
        }
    }
}
