import java.util.Scanner;

public class codejam_1A_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int y=1;y<=T;y++){
            String str=sc.next();
            int len=str.length();
            System.out.print("Case #"+y+": ");
            String curr=str;
            String curr2=str;
            for(int i=0;i<str.length();i++){
                curr2=str;
                curr=curr2;
                String temp=Character.toString(str.charAt(i));
                curr=curr.substring(0,i)+temp+curr.substring(i);
               
                if(curr.compareTo(curr2)<=0){
                    //System.out.println("NEW LETTER: "+curr+"  "+i);
                    str=curr;
                    curr2=curr;
                    i++;
                }
                else{
                    curr=str;
                    curr2=str;
                }
            }
            System.out.println(curr);
            //System.out.print(str.charAt(str.length()-1));
            
        }
    }
    
}
