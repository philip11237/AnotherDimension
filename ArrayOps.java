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


  public static int[] sumRows(int[][] matrix){
    int[] totals=new int [matrix.length];
    for (int i=0; i< matrix.length;i++){
      totals[i]=sum(matrix[i]);
  }
  return totals;
}
public static int[] largestRows(int[][] matrix){
  int[] totals=new int [matrix.length];
  for (int i=0; i< matrix.length;i++){
    totals[i]=largest(matrix[i]);
}
return totals;
}










}
