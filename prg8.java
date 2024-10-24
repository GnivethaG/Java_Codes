import java.util.*;
class prg8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of array");
        int n=sc.nextInt();
         System.out.println("Enter the elements of the array\n");
         int aa[]=new int[n];
         int i;
        for(i=0;i<n;i++)
        {
            aa[i]=sc.nextInt();
        }
         System.out.println("Enter the limit1 and limit 2\n");
         int l1=sc.nextInt();
         int l2=sc.nextInt();
         int sum=0,count=0;
         for(i=l1;i<=l2;i++)
         {
             if(i<n)
             {
                 sum=sum+aa[i];
                 count=count+1;
             }
         }
        System.out.println("\nThe Average Is:"+sum/count);
    }
}