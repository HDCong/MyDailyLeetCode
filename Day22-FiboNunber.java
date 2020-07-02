class Solution {
    public int fib(int N) {
        double m = (1 + Math.sqrt(5)) / 2;
        return (int)Math.round(Math.pow(m, N)/ Math.sqrt(5));
    }
}