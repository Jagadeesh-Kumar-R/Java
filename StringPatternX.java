import java.util.*;
public class StringPaternX{

     public static void main(String []args){
         Scanner scan=new Scanner(System.in);
        String s=scan.next();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==s.length()-j-1||i==j){
                    if(i==j){
                        System.out.print(s.charAt(i));
                    }else{
                        System.out.print(s.charAt(s.length()-i-1));
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }
}
