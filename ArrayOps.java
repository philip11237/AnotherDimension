public class ArrayOps{
  public static int sum(int[] arr){
    int total=0;
    for (int i=0; i< arr.length;i++){
      total += arr[i];
    }
    return total;
  }
  public static  int largest(int[]arr) {
    int tracker=arr[0];
    for (int i=1; i< arr.length;i++){
      if (arr[i]>=tracker){
        tracker=arr[i];
      }
    }
    return tracker;
  }











}
