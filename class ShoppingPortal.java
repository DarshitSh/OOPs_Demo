class Overload
{
    void typeofPayment(String username, String password)
    {
        System.out.println("Payment through internet Banking");
    }

    void typeofPayment(int mobile, int otp){
        System.out.println("Payment through Google Pay");
    }

    void typeofPayment(int crednum, int cvv, String date)
    {
        System.out.println("Payment through Card");
    }

    public static void main(String args){
        Overload ob = new Overload();
        ob.typeofPayment(54,89);

    }
}