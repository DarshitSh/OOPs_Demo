class Declaration {

    static final double PI = 3.14;
  
    public static void main(String[] args) {
      System.out.println("Value of PI:  " + PI);
    }
  }





class ClassA {

    public static final double PI = 3.14;
    
  }
  
  public class ClassB {
  
    public static void main(String[] args) {
      System.out.println("Value of PI: " + ClassA.PI);
    }
  }
  