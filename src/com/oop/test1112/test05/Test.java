package com.oop.test1112.test05;

public class Test {
    public static void main(String[] args) {
        //向上转型:屏蔽了对象的个性行为，只能看到公有的行为
        Pet p1 = new Dog();
        Pet p2 = new Cat();
        p1.eat();
        p2.eat();
        //向下转型：将父类对象转为子类对象，此时才能访问个性行为
       /* Dog dog = (Dog) p1;
        dog.catchFly();
        dog.eat();
        Cat cat = (Cat) p2;
        cat.catchMouse();
        cat.eat();
*/

        //在转换时，要判断父类指向哪个具体的子类，否则会出错
        //判断子类的类型是， instanceof 关键字
        if (p1 instanceof Dog) {
            Dog dog = (Dog) p1;
            dog.catchFly();

        } else if (p1 instanceof Cat) {
            Cat cat = (Cat) p1;
            cat.catchMouse();
        }
    }
}
