public class Overload {
    // class with name Overload

        //    print method is used
//    Here we give int parameter so it will accept the int type value 10
        public void print(int a) {
            System.out.println("int-" + a);
        }
        //    print method is used
//    here we give double value so it will accept the double type value 10.2
        public void print(double a) {
            System.out.println("Double -" + a);
        }
        //    print method is used
// Here we give string value so it will accept the string "ABC"
        public void print(String a) {
            System.out.println("String -" + a);
        }
    }

     class Overloading {
        //    declare a class with name OverloadingEx
        public static void main(String[] args) {
//  this si the main method , entry point if the program
//        Object creation of class Sample
            Overload obj= new  Overload();
//       As we give argument it will automatically print according to the datatype
            obj.print(10);
            obj.print(10.2);
            obj.print("ABC");
        }
    }

