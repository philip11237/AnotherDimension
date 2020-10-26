public class Tester{
  public static String arrToString(int[] arr){
    String empty = "{";
    for (int i = 0; i <arr.length; i++) {
      if (i==arr.length-1){
        empty += arr[i];}
        else {empty += arr[i]+", ";}
      }
      return empty+="}";
    }
    public static void main (String []args){
      int[] sumtest1={1,2,3,4};
      int[] sumtest2={1,2,3,4,5};
      int[] sumtest3={};
      System.out.println (ArrayOps.sum(sumtest1));
      System.out.println (ArrayOps.sum(sumtest2));
      System.out.println (ArrayOps.sum(sumtest3));

      System.out.println();

      int[] ltest1={1,2,3,4};
      int[] ltest2={-1,-2,-3,-4,-5};
      int[] ltest3={1000};
      System.out.println (ArrayOps.largest(ltest1));
      System.out.println (ArrayOps.largest(ltest2));
      System.out.println (ArrayOps.largest(ltest3));

      System.out.println();

      int[][] srtest1={{1,2,3,4}, {1,2,3,4}};
      int[][] srtest2={{-1,-2,-3,-4,-5} ,{1,2,3,4,5}};
      int[][] srtest3={{1000}, {}};

      System.out.println (arrToString(ArrayOps.sumRows(srtest1)));
      System.out.println (arrToString(ArrayOps.sumRows(srtest2)));
      System.out.println (arrToString(ArrayOps.sumRows(srtest3)));

      System.out.println();

      int[][] lrtest1={{1,2,3,4}, {1,2,3,4}};
      int[][] lrtest2={{-1,-2,-3,-4,-5} ,{1,2,3,4,5}};
      int[][] lrtest3={{1000}, {1}};

      System.out.println (arrToString(ArrayOps.largestRows(lrtest1)));
      System.out.println (arrToString(ArrayOps.largestRows(lrtest2)));
      System.out.println (arrToString(ArrayOps.largestRows(lrtest3)));

      System.out.println();

      int[][] satest1={{1,2,3,4}, {1,2,3,4}};
      int[][] satest2={{-1,-2,-3,-4,-5} ,{1,2,3,4,5}};
      int[][] satest3={{1000}, {1}};

      System.out.println (ArrayOps.sum(satest1));
      System.out.println (ArrayOps.sum(satest2));
      System.out.println (ArrayOps.sum(satest3));

      System.out.println();

      int[][]  A = { {  1,  0, 12, -1 },
      {  7, -2,  2,  1 },
      { -5, -2,  2, -9 }
    };
    System.out.println( arrToString(ArrayOps.sumCols(A)));
    System.out.println( arrToString(ArrayOps.sumCols(srtest1)));
System.out.println();
    int [][] B =  { {  1,  2, 3, 4 },
    {  2, 3,  4,  1 },
    { 3, 4,  1, 2 } };
    int [][] C = { {  1,  1, 1 },
    {  2, 2, 2 },
    { 3,  3, 3 } };

    int [][] D ={ {  2,  2, 2 },
    {  2, 2, 2 } };
    System.out.println( (ArrayOps.isRowMagic(B)));
    System.out.println( (ArrayOps.isRowMagic(C)));
    System.out.println( (ArrayOps.isRowMagic(D)));


  }
}
