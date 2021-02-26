import java.util.*;
public class zoho {
    static void printstr(String str)
    {
        int size=str.length();
        int i,j;

        for(i=0;i<size;i++)
        {
            for(j=2*(size-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        String str1="";
        int size=str.length();
        int k=size-1;
        int mid=size/2;
        for(int i=mid;i<size;i++)
        {
            str1=str1+str.charAt(i);            
            if(i==k){
                 i=-1;
                 size=mid;}
        }
        printstr(str1);
    }


    
}
