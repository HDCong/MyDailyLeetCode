class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []res = new int[n+m];
        int i = 0 , j = 0 , k = 0; 
        while(i<m && j < n){
            if(nums1[i]<=nums2[j])
                res[k++] = nums1[i++];
            else res[k++] = nums2[j++];
        }
        while(i<m){
            res[k++] = nums1[i++];
        }
        while(j<n){
            res[k++] = nums2[j++];
        }
        for(int s = 0; s < k ;s++){
            nums1[s]= res[s];
        }
        
    }
}