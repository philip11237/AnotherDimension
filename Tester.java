public class Tester{
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
    }
}
