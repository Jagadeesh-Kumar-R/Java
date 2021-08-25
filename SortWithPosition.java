import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String[] str=s.split("[, ]");
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        for(int i=0;i<str.length;i++){
            if(i%2==0){
                list1.add(Integer.parseInt(str[i]));
            }else{
                list2.add(Integer.parseInt(str[i]));
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        int ans[]=new int[str.length];
        for(int i=0;i<list1.size();i++){
            ans[i*2]=list1.get(list1.size()-i-1);
        }
        for(int i=0;i<list2.size();i++){
            ans[i*2+1]=list2.get(i);
        }
        for(int i=0;i<str.length;i++){
            if(i+1==str.length){
                System.out.print(ans[i]);
            }else{
                System.out.print(ans[i]+",");
            }
        }
        
    }
}
