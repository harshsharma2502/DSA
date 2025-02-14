// https://leetcode.com/problems/factorial-trailing-zeroes/
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n>=5){
            n = n/5;
            count+=n;
        }
        return count;
    }
}


// class Solution {
//     public int trailingZeroes(int n) {
//         if(n<5){
//             return 0;
//         }
//         int res = n / 5;
//         return res + trailingZeroes(res);

//     }
// }
