public class Assignment4 {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public int firstUniqChar(String s) {
    		//TODO
    	char[] words = s.toCharArray();
    	int[] nub = new int[26];
    	
    	for(int i = 0; i < s.length(); i++) {
    		nub[words[i]-'a']++;
    	}
    	
    	for(int i = 0; i < s.length(); i++) {
    		if(nub[words[i]-'a'] == 1) {
    			return i;
    		}
    	}
    	return -1;
    	
     }
 
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
		//TODO
	int i = 0;
	int j = n;
	int sum = 0;
	int[] digits = new int[(n+"").length()];
	
	if(n < 10) {
		sum = n;
	}
	else {
		while(j >= 10) {
    		digits[i] = j % 10;
    		j = j / 10;
    		i++;
		}
		digits[i] = j % 10;
		
		for(i = 0;i < digits.length; i++) {
			sum += digits[i];
		}
		if(sum >= 10) {
			sum = addDigits(sum);
		}
	}
	return sum;

}
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public static void moveZeroes(int[] nums) {
		//TODO
	int len = nums.length;
	int k = 0;
	
	if(len <2) {
		System.out.println(nums);
	}
	else {
		while(k < len) {
			if(nums[k] == 0) {
				int i = k;
				while(i < len-1){
				nums[i] = nums[i+1];
				i++;
				}
				nums[len - 1] = 0;
			}
			else {
				k++; 				
			}
		}
		System.out.println(nums);
	}
	 
 }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public static String longestPalindrome(String s) {
		//TODO
		char[] arr = s.toCharArray();
		int len2 = arr.length;
		int l = 0;
		if(len2 < 2) {
			return s;
		}
		else {
			String palindrome = s.substring(0,1);
			//odd
			for(int i=0; i < len2 - 1; i++) {
				if(arr[i] == arr[i+1]) {
					int temp = 0;
					while(i - temp >= 0 && i + temp < len2 -1 && arr[i - temp] == arr[i + temp +1]) {
						temp++;
					}
					if(l< temp + temp) {
						l = temp + temp; // (i+temp+1)-(i-temp)-1
						palindrome = String.valueOf(arr, i-temp+1, l);
					}
				}
				
			}
			
			//even
			for(int i=1; i < len2 -1; i++) {
				if(arr[i-1] == arr[i+1]) {
					int temp2 = 1;
					while(i - temp2 >= 0 && i + temp2 < len2 -1 && arr[i-temp2] == arr[i + temp2]) {
						temp2++;
					}
					temp2--;
					if(l < temp2+temp2+1) {
						l = temp2 + temp2 +1;
						palindrome = String.valueOf(arr, i - temp2, l);
					}
				}
			}
			return palindrome;
		}
		
    }	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
    		//TODO
    	int n = matrix.length;  //figure out n x n, the number of n
    	int[][] after = new int[n][n];
    	if(n < 2) {
    		return matrix;
    	}
    	else {
    		for(int x = 0; x < n; x++) {
    			for(int y = 0; y < n; y++){
    				after[y][n-x-1] = matrix[x][y];
    			}
    		}
    	}
		return after;
    	
   }
}

