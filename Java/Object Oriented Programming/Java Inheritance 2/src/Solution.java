class Solution {
    public static void main( String args[] ) {
        Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");
    }
}

class Adder extends Arithmetic {

}

class Arithmetic {
    public int add( int a, int b ) {
        return a + b;
    }
}
