/*-There are n number of taxi’s. For simplicity, assume 4. But it should work for any number of taxi’s.
-The are 6 points(A,B,C,D,E,F)
-All the points are in a straight line, and each point is 15kms away from the adjacent points.
-It takes 60 mins to travel from one point to another
-Each taxi charges Rs.100 minimum for the first 5 kilometers and Rs.10 for the subsequent kilometers.
-For simplicity, time can be entered as absolute time. Eg: 9hrs, 15hrs etc.
-All taxi’s are initially stationed at A.
-When a customer books a Taxi, a free taxi at that point is allocated
-If no free taxi is available at that point, a free taxi at the nearest point is allocated.
-If two taxi’s are free at the same point, one with lower earning is allocated
-Note that the taxi only charges the customer from the pickup point to the drop point. Not the distance it travels from an adjacent point to pickup the customer.
-If no taxi is free at that time, booking is rejected*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0;
        int CID=0;
        char PP='\0';
        char DP='\0';
        int PT=0;
        HashMap<Integer,Character> taxi=new HashMap<Integer,Character>();
        while(scan.hasNext()){
            n=scan.nextInt();
            System.out.println("input:"+n);
            CID=scan.nextInt();
            System.out.println("Customer ID:"+CID);
            PP=scan.next().charAt(0);
            System.out.println("Pickup Point:"+PP);
            DP=scan.next().charAt(0);
            System.out.println("Drop Point:"+DP);
            PT=scan.nextInt();
            System.out.println("Pickup time:"+PT);
            int d=distance(PP,DP);
            System.out.println("distance:"+d);
            int a=amount(d);
            System.out.println("amount:"+a);
            int RT=reachTime(d,PT);
            System.out.println("Reached Time:"+RT);
            int IA=allot(taxi,DP,PP);
            System.out.println("Taxi "+IA+" is allotted.");
            System.out.println("--------------");
        }
    }
    public static int allot(HashMap<Integer,Character> taxi,char DP,char PP){
        for(int i=1;i<=4;i++){          //Allot when taxi is available at that location
            if(taxi.containsKey(i)&&taxi.get(i)==PP){
                taxi.put(i,DP);
                System.out.println("Taxi can be allotted.");
                return i;
            }
        }
        int IA=initialAllot(taxi,DP);               //Allot when free taxi is available
        if(IA==0){
            //Do Something
        }else{
            return IA;
        }
        return 0;
    }
    public static int initialAllot(HashMap<Integer,Character> taxi,char DP){
            for(int i=1;i<=4;i++){
                if(!taxi.containsKey(i)){
                    taxi.put(i,DP);
                    System.out.println("Taxi can be allotted.");
                    return i;
                }
            }
        return 0;
    }
    public static int distance(char PP,char DP){
        int d;
        d=(DP-PP)*15;
        return d;
    }
    public static int amount(int d){
        int a=100;
        a+=(d-5)*10;
        return a;
    }
    public static int reachTime(int d,int PT){
        int RT=PT+(d/15);
        if(RT>24){
            RT-=24;
        }
        return RT;
    }
}
