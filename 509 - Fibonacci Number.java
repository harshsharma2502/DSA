// https://leetcode.com/problems/fibonacci-number/description/
class Solution {
    public int fib(int n) 
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        // int fib_1 = fib(n-1);
        // int fib_2 = fib(n-2);
        // int fibb = fib_1+fib_2;
        return fib(n-1) + fib(n-2);
    }
}
