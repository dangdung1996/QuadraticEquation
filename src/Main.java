import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("Nhap c: ");
        int c = sc.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        quadraticEquation.delta();
        double x1,x2;
        double candelta = Math.sqrt(quadraticEquation.delta());
        if (quadraticEquation.delta()>0){
            System.out.println("ptrinh co 2 nghiem x1 = "+ (-b-candelta)/(2*a) + "x2 = "+(-b+candelta)/(2*a));
        }else if(quadraticEquation.delta()==0){
            System.out.println("Ptrinh co nghiem duy nhat x1 = x2 = " + -b/(2*a));
        }else {
            System.out.println("ptrinh vo nghiem");
        }
    }
}
