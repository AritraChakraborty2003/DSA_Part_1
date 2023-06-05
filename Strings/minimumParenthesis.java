package Strings;
import java.util.*;

public class minimumParenthesis {
    public static void main(String args[]){
        String s="))(()";
        int min=minimum_Parenthesis(s);
        System.out.println("The minimum parenthesis is :- "+ min);

    }
    static int minimum_Parenthesis(String s){
        int n=s.length();
        Stack<Integer> stk=new Stack<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
                stk.push(1);
            else{
                if(!stk.isEmpty()){
                    stk.pop();
                }
                else{
                    cnt++;
                }
            }

        }
        cnt+=stk.size();
        return cnt;

    }


}
