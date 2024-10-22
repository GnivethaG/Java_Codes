import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter A string");
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int i;
        int count=0;
        int n=str.length();
        for(i=0;i<n;i++)
        {

            char ch=str.charAt(i);
            int no=(int)ch;
            if(no>=97 && no<=122)
            {
                count++;
            }
        }
        System.out.println("The count of Lowercase is : "+count);
        sc.close();
    }
}