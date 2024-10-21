import java.util.*;
class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i;
        int count=0;
        int n=str.length();
        for(i=0;i<n;i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println(count+1);
        
       
    }
}