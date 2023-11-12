//Insertion sort using recurtion


class Solution {
    int i = 1;

    public int[] insertionSortRec(int[] nums) {
        //int minElement = Integer.MAX_VALUE;

        if(i>=nums.length){
            return nums;
        }

            int ele = nums[i];
            int j= i-1;
            while(j>=0 && nums[j] > ele  ){

                 nums[j + 1] = nums[j];
                j = j - 1;


                }

                nums[j + 1] = ele;

            i++;

            return insertionSortRec(nums);
        }

    public static void main(String[] boss){
    
	    int arr[] = new int[]{32,23,1,55,38};

	    Solution obj = new Solution();
	    int retArray[] =obj.insertionSortRec(arr);
    
	    for(int i =0;i<arr.length;i++){
	    
		    System.out.print(retArray[i] +" ");
	    }
	    System.out.println();
    }
}



