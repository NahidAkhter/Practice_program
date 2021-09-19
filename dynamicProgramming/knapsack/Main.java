package dynamicProgramming.knapsack;

public class Main {

    public static void main(String[] args) {

        int[] weight = {2,3,4,5};
        int[] profits = {1,2,5,6};
        int fResult = knapsackSolution(8, profits, weight, 4);
        System.out.println(fResult);
    }

    /*
    * maxWeight= 8
    * numOfWeights=4
    * profit[n] = {1,2,5,6}
    * weight[n] = {2,3,4,5}
    * */
    static int knapsackSolution(int maxWeight, int profit[], int weight[], int numOfWeights) {

        int w=0;
        int[][] k = new int[numOfWeights+1][maxWeight+1];

        for(int i=0 ; i<=numOfWeights; i++){
            for(w=0; w<=maxWeight; w++) {
                if(i==0 || w==0)
                    k[i][w] = 0;
                else if(weight[i-1] <=w)
                    k[i][w] = Math.max(k[i-1][w] , profit[i-1] + k[i-1][w-weight[i-1]]);
                else
                    k[i][w] = k[i-1][w];
            }
        }

        System.out.println("numofWeights : "+ numOfWeights + " & w : " + w);
        return k[numOfWeights][w-1];
    }
}
