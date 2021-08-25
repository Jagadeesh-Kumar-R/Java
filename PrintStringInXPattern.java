import java.util.*;
public class PrintStringInXPattern{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==j||j==s.length()-i-1){
                    System.out.print(s.charAt(j));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        PrintX(s,0);
    }
    public static void PrintX(String s,int i){
        if(i==s.length()){
            return;
        }else{
            name(s,i,0);
        }
        System.out.println();
        PrintX(s,++i);
    }
    public static void name(String s,int i,int j){
        if(j==s.length()){
            return;
        }
        if(i==j||j==s.length()-i-1){
            System.out.print(s.charAt(j));
        }else{
            System.out.print(" ");
        }
        name(s,i,++j);
    }
}
