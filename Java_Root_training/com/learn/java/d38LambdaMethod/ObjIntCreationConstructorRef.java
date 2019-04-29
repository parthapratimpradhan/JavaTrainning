package com.learn.java.d38LambdaMethod;

public class ObjIntCreationConstructorRef {
    private int num;
    public ObjIntCreationConstructorRef(int num) {
        this.num = num;
    }
    public ObjIntCreationConstructorRef(ObjIntCreationConstructorRef n) {
        this.num = n.num;
    }
    public static void main(String[] args) {
        // using the "IntSupplier" functional interface
        int num = 10;
        IntSupplier s1 = ObjIntCreationConstructorRef::new;
        ObjIntCreationConstructorRef newObj1 = s1.apply(num);
        System.out.println("new object has a instance value " + newObj1.num);
        // using the "IntObjectSupplier" functional interface
        IntObjectSupplier s2 = ObjIntCreationConstructorRef::new;
        ObjIntCreationConstructorRef newObj = s2.apply(newObj1);
        System.out.println("new object has a instance value " + newObj.num);
    }
}
