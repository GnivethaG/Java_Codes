import java.util.*;
class prg6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="";
        char arr[]=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--)
        {
            s=s+arr[i];
        }
        System.out.println(s);
    }
}