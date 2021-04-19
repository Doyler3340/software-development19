public class Methods{
    public static void main(String[] args){
        Methods m = new Methods();
        m.method1();
        m.method2(5, "Kevin");
        int sum = m.method3(100, 200);
        System.out.println("method3 returns a value of: "+sum);
        sum = m.method3(3, 7);
        System.out.println("method3 returns a value of: "+sum);
        String test = m.method4();
        System.out.println("method4 returns a value of: "+test);
    }

    public void method1(){
        System.out.println("This is method1");
    }

    public void method 2(int x, String name){
        System.out.println("methods passed the values: "+x);
        System.out.println("name: "+name);
    }

    public int method3(int a, int b,){
        return a + b;
    }
    public int method3(int a, int b, int c){
        return a + b + c;
    }
    public String methods4()
}