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


  public static  int sum(int[][] arr){
    return sum(sumRows(arr));
  }


  public static int[] sumCols(int[][] matrix){
    if (matrix.length==0){
      return new int [0];
    }
    int[] totals=new int [matrix[0].length];
    for (int c=0; c< matrix[0].length;c++){
      for (int r=0; r< matrix.length;r++){
        totals[c] += matrix[r][c];
      }
    }
    return totals;
  }
  public static boolean isRowMagic(int[][] matrix){
  int []sumrows= sumRows(matrix);
    for (int i=0; i< sumrows.length-1;i++){
      if (sumrows[i]!=sumrows[i+1]){
        return false;
      }
    }
    return true;

}
public static boolean isColMagic(int[][] matrix){
int []sumcols= sumCols(matrix);
  for (int i=0; i< sumcols.length-1;i++){
    if (sumcols[i]!=sumcols[i+1]){
      return false;
    }
  }
  return true;

}









}
