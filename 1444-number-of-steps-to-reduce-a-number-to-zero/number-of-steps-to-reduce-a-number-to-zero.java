class Solution {
    int solver(int n,int count)
    {
        if(n<=0) return count;
        if(n%2!=0) 
        {
            n=n-1;
            count++;
        }
        count++;
        return solver(n/2,count);
    }
    public int numberOfSteps(int num) 
    {
        if(num == 0) return 0;
        int count = solver(num,0);
        
        return count-1;
    }
}