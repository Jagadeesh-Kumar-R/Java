import java.util.*;
public class ReverseWordsOfString{

    public static void reverse(String[] str,int len){
        System.out.print(str[len]+" ");
        if(len==0){
            return;
        }
        reverse(str,--len);
    }
     public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String[] str=s.split(" ");
        reverse(str,str.length-1);
     }
}
