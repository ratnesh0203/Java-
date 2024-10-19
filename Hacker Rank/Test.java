class test 
{ 
    int a; 
    int b; 
    test() 
    {   
        this(10, 20);   
        System.out.print("constructor one "); 
    } 
    test(int a, int b) 
    { 
        this.a = a; 
        this.b = b; 
        System.out.print("constructor two "); 
    } 
}
class Test{
    public static void main(String[] args) 
    { 
        Test object = new Test(); 
    } 
} 