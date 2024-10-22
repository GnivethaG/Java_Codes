import java.util.*;
class prg4 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        while(no>=1)
        {
            int k=no%10;
            if(k%2==0)
            {
                count++;
            }
            no=no/10;
        }
        if(count>2)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}