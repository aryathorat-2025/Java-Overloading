public class Sample2 {

        public int sum(int a){
            int  result =0;
            for(int i=0;i<a;i++){
//            result+=a[i];
            }
            return result;
        }
    }

     class VariableArg {
        public static void main(String[] args) {
            Sample2 s= new Sample2();

            int x = s.sum(10);
            int y = s.sum(90);

            System.out.println(x);
            System.out.println(y);
        }
    }

