public class QuadraticEquation {
    int a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double delta(){
        return this.b*this.b-4*this.a*this.c;
    }

}
