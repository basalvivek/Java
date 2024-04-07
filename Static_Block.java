public class Static_Block {

    Static_Block()
    {
        System.out.println("Constructor Block");
    }
    static
    {
        System.out.println("Static Block"); //Static Block run first
    }

    public static void main(String[] args) {
        Static_Block r = new Static_Block();
        System.out.println("Main Block");
    }

}
