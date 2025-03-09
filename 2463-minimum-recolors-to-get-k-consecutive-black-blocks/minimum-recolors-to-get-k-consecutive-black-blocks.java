class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0; i<=blocks.length()-k; i++)
        {
            for(int j=i; j<i+k ; j++){
                if(blocks.charAt(j) == 'W')
                {
                    count++;
                }
            }
            mini = Math.min(mini,count);
            count = 0;
        }
        return mini;
    }
}