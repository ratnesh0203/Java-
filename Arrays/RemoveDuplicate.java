public class RemoveDuplicate{  
    public static int removeDuplicateElements(int nums[], int n){  
            if (n==0 || n==1){  
                return n;  
            }  
            int[] temp = new int[n];  
            int j = 0;  
            for (int i=0; i<n-1; i++){  
                if (nums[i] != nums[i+1]){  
                    temp[j++] = nums[i];  
                }  
             }  
            temp[j++] = nums[n-1];     
            // Changing original array  
            for (int i=0; i<j; i++){  
                nums[i] = temp[i];  
            }  
            return j;  
        }  
           
        public static void main (String[] args) {  
            int nums[] = {10,20,20,30,30,40,50,50};  
            int length = nums.length;  
            length = removeDuplicateElements(nums, length);  
            //printing array elements  
            for (int i=0; i<length; i++)  
               System.out.print(nums[i]+" ");  
        }  

        
    }  