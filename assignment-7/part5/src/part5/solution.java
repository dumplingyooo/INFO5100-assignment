package part5;

import java.util.ArrayList;

public class solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int x = nums1.length;
       int y = nums2.length;
       int z = x + y;
       ArrayList<Integer> list = new ArrayList<>();

	   int w = 0;
	   int v = 0;
	   
	   while(w <= x && v > y) {
		   list.add(nums1[w]);
		   w++;
	   }
	   while(v <= y && w > x) {
		   list.add(nums2[v]);
		   v++;
	   }
	   while(w < x && v < y) {
    	   if(nums1[w] <= nums2[v]) {
    		   list.add(nums1[w]);
    		   w++;
    	   }
    	   else{
    		   list.add(nums2[v]);
    		   v++;
    	   }
	   }
       
       if(z % 2 == 0) {
    	   return (list.get(z/2 - 1) + list.get(z/2)) / 2;
       }
       else{
    	   return list.get(z / 2);
       }
    }

}
