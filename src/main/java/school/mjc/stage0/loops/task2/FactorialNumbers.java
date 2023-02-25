package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int counter = 1;
        int res = 1;
        System.out.println(res);
        while(counter <= printToInclusive){
            res *= counter;
            System.out.println(res);
            counter++;

        }


    }
}
