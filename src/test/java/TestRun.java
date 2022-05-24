import org.junit.jupiter.api.Test;

public class TestRun {
    static void main(String[] args){
        System.out.println("Main function");
    }

    static class fibo{

        int term(int n){
            int a=1;
            int b=1;
            int c=0;
            if (n==1 || n==2){
                return 1;
            }
            else {
                for (int i = 3; i <= n; i++) {
                    c=a+b;
                    a=b;
                    b=c;
                }
                return c;
            }
        }
    }

    @Test
    void printFunc(){
        fibo fib=new fibo();
        for (int j=1; j<=10; j++){
            System.out.println(fib.term(j));
        }
    }

}
