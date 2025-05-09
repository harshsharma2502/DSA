class Solution {
    // public int fib(int n) {
    //     if(n == 0){
    //         return 0;
    //     }
    //     if(n == 1){
    //         return 1;
    //     }

    //     return fib(n-1) + fib(n-2);
    // }

// }
        public int fib(int n){
            if(n == 0 || n == 1){
                return n;
            }
            int arr[] = new int [n+1];
            arr[0] = 0;
            arr[1] = 1;
            for(int i=2; i<arr.length; i++){
                arr[i] = -1;
            }
            return helper(arr,n);
        }

        int helper(int arr[], int n){
            if(arr[n] !=-1) return arr[n];
            else{
                return arr[n] = helper(arr,n-1) + helper(arr,n-2);
            }
        }
}