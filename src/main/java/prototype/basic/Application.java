package prototype.basic;

import prototype.basic.src.PrototypeObject;

public class Application {
    public static void main(String[] args) {

        System.out.println("Start Basic Prototype Application");

        PrototypeObject prototypeObject = new PrototypeObject(5, "Five");
        System.out.println("Create prototypeObject " + prototypeObject);

        PrototypeObject firstClone = prototypeObject.clone();
        System.out.println("Create firstClone " + firstClone);

        System.out.println("Class prototypeObject == Class firstClone " + (prototypeObject.getClass() == firstClone.getClass()));
        System.out.println("prototypeObject == firstClone " + (prototypeObject == firstClone));




    }
}
