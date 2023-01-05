class Reserve_bank
{
    public void account(){
        private int b = 100;
        System.out.println("Savings bank account created");
    }
}
class Axis_bank extends Reserve_bank
{
    public void kyc()
    {
            System.out.println("The KYC will be done offline");           
    }
}
class Bank extends Axis_bank
{
    public void online_Kyc() 
    {
        protected int a = 10;
        System.out.println(a);
        System.out.println("The KYC will be done online. Just send us the details"); 
    }


    public static void main(String args[]) 
    {
    Bank ob = new Bank();
    ob.account();
    ob.kyc();
    ob.online_Kyc();
    
    }
}
