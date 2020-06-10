class Solution {
    // Solution 1: Recursion
    public int climbStairsRecursion(int n) {
        if( n==1) return 1;
        if (n==2) return 2;
        return climbStairsRecursion(n-1) + climbStairsRecursion(n-2);
    }
    // Solution 2: Dynamic Programming
    public int climbStairs(int n) {
        if( n==1) return 1;
        int []mem = new int[n+1];
        mem[1]=1;
        mem[2]=2;
        for(int i = 3; i <=n;i++)
            mem[i]=mem[i-1]+mem[i-2];
        return mem[n];
    }
    // Solution 3: Find the recipe
    public int climbStairsByRecipe(int n){
        double sqrt5=Math.sqrt(5);
        double res=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(res/sqrt5); 
    }
}