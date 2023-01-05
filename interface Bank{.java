interface Banking{  
    double rateOfInterest();  
    }  
    class SBI implements Banking{  
    public double rateOfInterest(){return 9.5;}  
    }  
    class PNB implements Banking{  
    public double rateOfInterest(){return 9.7;}  
    }  
    class TestInterface2{  
    public static void main(String[] args){  
    Banking b=new SBI();  
    System.out.println("ROI: "+b.rateOfInterest());  
    }}  