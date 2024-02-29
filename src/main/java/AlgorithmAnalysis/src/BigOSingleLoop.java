package AlgorithmAnalysis.src;

public class BigOSingleLoop {
    public static void main(String[] args){
        int numberOfOperations=0;
        int n=100;
        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n);

        /**Task 1 Single Loop.........O(n)*/

        startTime=System.currentTimeMillis();

        for (int i = 0; i< n ; i++){
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println("Number of operations: " +numberOfOperations + " in "+(endTime-startTime) + " miliseconds");


        numberOfOperations=0;

        /**Task 2 Nested Loop.........*/

        startTime=System.currentTimeMillis();

        for (int j = 0; j < n ; j++){
            for (int i = 0; i < n; i++){
                numberOfOperations+=1;
            }

        }
        endTime=System.currentTimeMillis();

        System.out.println("Number of operations with nested loop: " +numberOfOperations + " in "+(endTime-startTime) + " miliseconds");
    }
}
