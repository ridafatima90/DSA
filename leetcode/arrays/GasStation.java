package leetcode.arrays;
import java.util.*;
//https://leetcode.com/problems/gas-station/?envType=study-plan-v2&envId=top-interview-150
class GasStation {
    public static void main(String[] args) {
        int[] gas= {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas, cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;
        int remainingGas = 0;
        int startPosition = 0;

        for(int i = 0; i< gas.length; i++){
            totalCost += cost[i];
            totalGas += gas[i];
            remainingGas = totalGas - totalCost;

            if(remainingGas < 0){
                remainingGas = 0;
                startPosition = i+1;
            }
        }
        return totalGas < totalCost? -1: startPosition;
    }
}