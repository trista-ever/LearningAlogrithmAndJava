import java.util.Scanner;

/**
 * 2017/4/6 15:41
 *
 * @author weiyu si
 */
public class WeiRuanOne {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int P=in.nextInt();
        int Q=in.nextInt();
        int N=in.nextInt();
        int divide=1;
        double result=0;
        for(int i=0;i<N; i++){
            int temP=P/divide;
            System.out.println("temp:"+temP);
            result+=calculate(temP,Q);
            System.out.println("result:"+result);
            divide = divide*2;
        }
        in.close();
        System.out.println("result2:"+result);
        System.out.print((double)Math.round(result*100)/100); //add double  Math.round(double) return int

    }
    static double calculate(int P,int Q){
        double result=0; //type
        int count=1;
        result+= P*count*0.01; //success
        System.out.println("1");
        System.out.println(result);
        int right = 100-P;
        System.out.println(right);
        while (true){
            P=P+Q;
            count++;
            if(P>=100){
                return result+=right*count*0.01;
            }
            result+= right*count*P*0.01; //success
            right=right*(1-P);
      //      System.out.println("2");
      //      System.out.println(result);
        }
    }
}
