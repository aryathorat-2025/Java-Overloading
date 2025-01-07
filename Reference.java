public class Reference {
    public static void main(String[] args) {
        System.out.println("hello");
        int a[]={13,4,7,8,78};
        change(a); {
            System.out.println(a[1]);
        }
    }
    public static void change(int[] a) {
        a[1]=0;
    }
}

