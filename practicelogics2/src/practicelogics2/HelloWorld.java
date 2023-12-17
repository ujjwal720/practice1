package practicelogics2;
import java.util.Arrays;
public class HelloWorld{

     public static void main(String []args){
        String input="Apple123Zoom567Tomato319";
        System.out.println("Input :"+input);
        StringBuffer buffer=new StringBuffer();
        String alpha="",num="";
        int i=0;
        while(i<input.length())
        {
            char c=input.charAt(i);
            if(!(c>='0' && c<='9'))
            {
               alpha=alpha.concat(String.valueOf(c));
               i++;
               char d='\u0000';
                if(i<input.length())
                {
                    d=input.charAt(i);
                }
               if(d>='0' && d<='9' || i==input.length())
               {
                   buffer.append(alpha);
                   alpha="";
               }
            }
            else
            {
               num=num.concat(String.valueOf(c));
               i++;
               char e='\u0000';
               if(i<input.length())
               {
                 e=input.charAt(i);
               }
               if(!(e>='0' && e<='9') || i==input.length())
               {

                StringBuffer nb=new StringBuffer(String.valueOf(num));



                   buffer.append(nb.reverse());
                   num="";
               }
               
            }
        }
        System.out.println("Output :"+buffer);
     }
}
