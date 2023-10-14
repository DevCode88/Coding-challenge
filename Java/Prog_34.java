//POP & PUSH
public class Prog_34 {
    char[] Stack = new char[100];
    int Top = -1;
    void _Push(char x){
//        write code
    }
char pop() {
    if (Top == -1)
        return 0;
    else
        return Stack[Top--];
   }
   int _Priority(char x){
        if(x == '(')
            return 0;
        if(x == '+' || x == '_')
            return 1;
        if(x == '*' || x == '/')
            return 2;
        return 0;
   }

//   main start
    public static void main(String[] args){
        char[] Exp = new char[100];
        char xe,x;
        System.out.println("Enter Expr. >> ");
        System.out.println(Exp);

    }
}
