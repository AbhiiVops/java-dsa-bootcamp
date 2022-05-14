package LinearSearchAlgorithm;

// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {{1,5},{7,3},{3,5}};


        System.out.println(maximumWealth(accounts));
    }

   static int maximumWealth(int[][] accounts) {
        int max =Integer.MIN_VALUE;

        if(accounts.length ==0) {
            return -1;
        }

        //person = row
       // account = col
        for(int person=0;person< accounts.length;person++) {
            //when you start a new row take a new sum for that row
            int rowSum=0;
            for(int account=0;account<accounts[person].length;account++) {

                rowSum += accounts[person][account];
            }

            // now we have sum of accounts of that person
            // check it with the overall ans
            if(rowSum >max) {
                max = rowSum;
            }
        }
            return max ;

    }
}
