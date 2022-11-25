import java.util.Scanner;

public class Main {
    static int besAzalt(int x){
        if (x<=0)
            return x;
        else{
            System.out.print(x+" ");
            return besAzalt(x-5);
        }
    }
    static int besArttır(int n1, int n2){
        if (n1>n2)
            return n1;
        else{
            System.out.print(n1+" ");
            return besArttır(n1+5,n2);
        }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n=input.nextInt();
        besArttır(besAzalt(n),n);
    }
}
