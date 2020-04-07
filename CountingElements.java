class Solution {
    public int countElements(int[] arr) {
        
        int count=0;
        Set<Integer> set = new HashSet<>(); 
        for (int t : arr) { 
            set.add(t); 
        } 
  
        for (int c : arr) {
            if (set.contains(c+1)) 
            {
                count+=1;            
            }

        }
        
        return count; 
}
}
