import java.util.*;
public class PrintCharactersInGivenNumberOfTimes{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        String num="";
        char ch='\0';
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                num+=s.charAt(i);
            }else{
                if(i!=0){
                    map.put(ch,Integer.parseInt(num));
                }
                ch=s.charAt(i);
                num="";
            }
        }
        map.put(ch,Integer.parseInt(num));
        for(char i:map.keySet()){
            for(int j=0;j<map.get(i);j++){
                System.out.print(i);
            }
        }
    }
}
