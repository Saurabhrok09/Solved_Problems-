
public class SearchSort {
    public static void main(String[] args) {
       
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 2;
        int arr1[] = { 64, 34, 25, 12, 22, 11, 90 };
        //   int res = linSearch(x,arr);
        binSort(arr1);
        /*
     int res = binSearch(x,arr);
        if(res!=-1){
            System.out.println(res + " found at ");
        }else{
            System.out.println("not found");
        }*/
    }
    public static int linSearch(int x, int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
        
    } 
     public static int binSearch(int x, int arr[]){
       int left=0; int right = arr.length-1;
       while(left<=right){
           int mid = (left + right)/2;
           if(arr[mid]==x){
               return mid;
           }
           if(arr[mid]< x){ //3< 5
               left=mid+1;
           }else{
                right = mid-1;
           }
          
       }
        return -1;
        
    } 
     public static void binSort( int arr[]){
       int len = arr.length; boolean flag = false; int temp ;
       for(int i=0; i< len-1;i++){
         for(int j=0; j< len-i-1;j++){
           if(arr[j] > arr[j+1]){
             temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] =temp;
             flag= true;
           }
         }
         if(flag= false){
             break;
           }
       }
       for(int i : arr){
          System.out.print(i +" ");
       }
      
     }
}