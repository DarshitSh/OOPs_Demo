class Bank{  
    int getRateOfInterest(){return 0;}  
    }  
    //Creating child classes.  
      
    class ICICI extends Bank{  
    int getRateOfInterest(){return 7;}  
    }  
    class AXIS extends Bank{  
    int getRateOfInterest(){return 9;}  
    }  
    //Test class to create objects and call the methods  
    class Test2 extends Bank{  
    public static void main(String args[]){  
    ICICI i=new ICICI();  
    AXIS a=new AXIS();  
    System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
    System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
    }  
    }