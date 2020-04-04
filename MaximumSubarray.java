class Solution {
    public boolean MaxSubarray(int arr[]) {
        int curmax=arr[0],glomax=arr[0];
        for(int i=1;i<n;i++)
        {
            curmax=Math.max(arr[i],curmax+arr[i]);
            if(curmax>glomax)
                glomax=curmax;
        }
        
        return glomax;
      
    }
  
  }
