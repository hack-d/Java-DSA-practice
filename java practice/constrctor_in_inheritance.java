class base1 {
    base1() {
        System.out.println("I am a constructor");
    }

    base1(int a) {
        System.out.println("I am an overloaded constructor with value of a as:" + a);
    }
}

class derived1 extends base1 {
    derived1() {
        //super(1);
        System.out.println("I am a derived1 constructor");
    }

    derived1(int x, int y) {
        //super(1);
        System.out.println("I am an overloaded derived class constructor with values " + x+" and "+y);
    }
}

class ChildOfDerived extends derived1{
    ChildOfDerived(int x,int y,int z){
        super(4,5);
        System.out.println("I am a ChildOfDerived class constructor with values of "+4+","+5+"and"+6);
    }
}

public class constrctor_in_inheritance {
    public static void main(String[] args) {
        // base1 base=new base1();
        //derived1 derived = new derived1(4,5);
        ChildOfDerived cd=new ChildOfDerived(3, 4, 5);
    }

}
