public class Person {
    public double a ;
    public  double b;
    public  double c;
    public void summa(double a , double b,double c ){
        double p =(a+b+c)/2;
        System.out.println( "плошадь три угольника равна: "+ Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
