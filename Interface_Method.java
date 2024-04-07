interface Client
{
    void webdesign();
    void webdevelope();
}

abstract class RajTech implements Client
{
    @Override
    public void webdesign()
    {
        System.out.println("Web Design");
    }
}
class RahulTech extends RajTech
{
    @Override
    public void webdevelope()
    {
        System.out.println("Web Develop");
    }
}
class Interface_Method
{
    public static void main(String[] args)
    {
        RahulTech r=new RahulTech();
        r.webdesign();
        r.webdevelope();
    }

}

