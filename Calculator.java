// class
public class Calculator{

// constructor
  public Calculator(){
  }
  //methods
public int add(int x, int y){
return x + y;
}

public int subtract(int x, int y){
return x - y;
}

public int multiply(int x, int y){
return x * y;
}
public int divide(int x, int y){
return x / y;
}
public int modulo(int x, int y){
return x % y;
}

// creating main method
public static void main(String[] args){
// creating objects
Calculator myCalculator = new Calculator();
System.out.println(myCalculator.add(5,7));
System.out.println(myCalculator.subtract(45,11));
System.out.println(myCalculator.multiply(5,7));
System.out.println(myCalculator.divide(72,9));
System.out.println(myCalculator.modulo(22,10));

}
}
