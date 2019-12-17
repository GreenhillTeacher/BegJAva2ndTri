/*
Changing the size of a figure
Maria I Suarez
12/6/2019
Ver 1
 */
public class SizeFigure {
    public static final int SIZE=4;
    public static void main(String [] args)
    {
        line();
        top();
        bot();
        line();
        bot();
        top();
        line();
    }
    public static void line(){
        System.out.print("+");
        for(int dash =1; dash <= 2*SIZE +1; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void top(){
        for(int line=1; line <= SIZE; line++)
        {
            System.out.print("|");
            spaces(line);
            for(int slash=1; slash<= line-1; slash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for(int slash=1; slash<= line-1; slash++) {
                System.out.print("\\");
            }
            spaces(line);
            System.out.println("|");
        }
    }
    public static void spaces(int line){
        for(int space=1; space <=-line+(SIZE+1);space++)
        {
            System.out.print(" ");
        }
    }
//    method to control the number of spaces at the
    public static void spaces2(int line){
        for(int space=1; space <=line;space++)
        {
            System.out.print(" ");
        }
    }
    public static void bot(){
        for(int line=1; line <= SIZE; line++)
        {
            System.out.print("|");
            spaces2(line);
            for(int slash=1; slash<= -line+SIZE; slash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for(int slash=1; slash<= -line+SIZE; slash++) {
                System.out.print("/");
            }
            spaces2(line);
            System.out.println("|");
        }

    }
}
