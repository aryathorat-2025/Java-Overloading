public class Sample1 {
    public int sum(int a){
        int  result =0;
        for(int i=0;i<a;i++){
//            result+=a[i];
        }
        return result;
    }
    public int sum(int a, int b){
        return a+b;
    }
}

 class VarArg_overlo {
    public static void main(String[] args) {
        Sample1 g= new Sample1();
        int x=g.sum(20);
        System.out.println("Result ="+x);

        int y=g.sum(10,20);

        System.out.println(y);
    }
}

