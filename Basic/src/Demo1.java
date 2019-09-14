//class ABC{
//    int a=10;
//    int b = 20;
//    int c;
//
//    void add(){
//        c = a+b;
//        System.out.print(c);
//    }
//}
//public class Demo1 {
//
//    public static void main(String[] args) {
//        ABC abc = new ABC();
//
//        abc.add();
//
//    }
//}


class ABC{

    int c;

    void add(int a , int b){
        c = a+b;
        System.out.print(c);
    }
}

public class Demo1 {

    public static void main(String[] args) {
        ABC abc = new ABC();
        int c=10;
        int d=20;

        abc.add(c,d);

    }
}