interface customer
{
    int value=100; //public static and final
    void purchase(); //public and abstract
}

class seller implements customer
{
    @Override
    public void purchase() {
        //value = 200 cannot change becos it is final defined in interface
        System.out.println("Customer value is "+value);
    }
}
public class Interface_eg01 {
    public static void main(String[] args) {
        customer c = new seller();
        c.purchase();
        //customer.purchase(); its not static - Question
        System.out.println(customer.value);
    }
}
