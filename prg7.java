import java.util.*;
class prg7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="";
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            char aa[]=arr[i].toCharArray();
            s=s+aa[aa.length-1];
        }
        System.out.println(s);
    }
}