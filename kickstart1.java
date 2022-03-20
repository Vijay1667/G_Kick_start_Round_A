import java.util.*;
//Code by Vijay
class kickstart1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int q=1;q<=T;q++){
            String original=sc.next();
            String typed=sc.next();
            int res= delete(original,typed);
            if(res==-1){
                System.out.println("Case #"+q+": IMPOSSIBLE");
            }
            else{
            System.out.println("Case #"+q+": "+res);
            }
        }
    }
    static int delete(String a1,String a2){
        if(a1.length()>a2.length()){
            return -1;
        }
        boolean flag=true;
        int ind=0;
        for(int i=0;i<a1.length();i++){
            ind=a2.indexOf(a1.charAt(i),ind);
            if(ind==-1){
                return -1;
                
            }
            ind++;
            System.out.print("\nind="+ind);
        }
        return (a2.length()-a1.length());
    }
}

/*2
aaaa
aaaaa
bbbbb
bbbbc

Case #1: 1
Case #2: IMPOSSIBLE
*/


/*
2
Ilovecoding
IIllovecoding
KickstartIsFun
kkickstartiisfun


Case #1: 2
Case #2: IMPOSSIBLE
*/
