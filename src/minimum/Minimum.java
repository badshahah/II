
package minimum;


public class Minimum {

  
    
      public static int findmin(int arr[]) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
}