import java.util.*;
class prg5 {
    public static void main(String[] args) {
        String temp;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        str=String.join(" ", arr);
        System.out.println(str);
        sc.close();
}
}