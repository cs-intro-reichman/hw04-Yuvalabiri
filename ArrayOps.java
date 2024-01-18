public class ArrayOps {
    public static void main(String[] args) {
     int[] arr = {2, 8, 3, 7, 8};
     System.out.println(secondMaxValue(arr));
    }
    
    public static int findMissingInt (int [] arr) {
        // Write your code here:
        int n =  arr.length;
        int missing = -1;
        for(int i = 0; i < n + 1; i++) {
            boolean found = false;
            for(int j = 0; j < n; j++) {
                if(i == arr[j]) {
                    found = true;
                    break;
                }
            } 
            if (!found) {
                missing = i;  
            } 
        }
        return missing;
    }

    public static int secondMaxValue(int [] arr) {
        // Write your code here:
        int maxvalue = arr[0];
        int secondmaxvalue = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                secondmaxvalue = maxvalue;
                maxvalue = arr[i];
            } else if (arr[i] > secondmaxvalue) {
                secondmaxvalue = arr[i];
            }

        }
        return secondmaxvalue;
    }

    public static boolean containsTheSameElements(int [] arr1,int [] arr2) {
        // Write your code here:
        Boolean elements1 = true;
        Boolean elements2 = true;

        for(int i = 0; i < arr1.length; i++){
            boolean in1 = false;
            for(int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    in1 = true;
                    break;
                }

            }
            if(!in1){
                elements1 = false;
                break;
            }  
        }
            
        for(int i = 0; i < arr2.length; i++){
            boolean in2 = true;
            for(int j = 0; j < arr1.length; j++){
                if (arr2[i] == arr1[j]) {
                    in2 = true;
                    break;
                }
            }
            if(!in2){
                elements2 = false;
                break;
            }  

            
        }
        if (elements1 && elements2) {
            return true;
        }
        return false;
    }
    

    public static boolean isSorted(int [] arr) {
        // Write your code here:
        boolean decreasing = true;
        boolean increasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]){
                decreasing = false;
                break;
            } 
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]){
                increasing = false;
                break;
            } 
        }

        return (decreasing || increasing);
    }

}
