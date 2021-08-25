import java.util.*;
public class MergeNumber{

     public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String s1=scan.next();
        String s2=scan.next();
        Queue<Integer> queue=new PriorityQueue<Integer>();
        String num="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='0'&&s1.charAt(i)<='9'){
                num+=s1.charAt(i);
                if(i==s1.length()-1){
                    queue.add(Integer.parseInt(num));
                }
            }else{
                queue.add(Integer.parseInt(num));
                num="";
            }
        }
        num="";
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)>='0'&&s2.charAt(i)<='9'){
                num+=s2.charAt(i);
                if(i==s2.length()-1){
                    queue.add(Integer.parseInt(num));
                }
            }else{
                if(!queue.contains(Integer.parseInt(num))){
                    queue.add(Integer.parseInt(num));
                }
                num="";
            }
        }
        while(!queue.isEmpty()){
            
            System.out.print(queue.poll());
            if(!queue.isEmpty()){
                System.out.print(",");
            }
        }
     }
}
