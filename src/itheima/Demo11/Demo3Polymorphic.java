package itheima.Demo11;

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}


public class Demo3Polymorphic {

    public static void main(String[] args) {
        Demo3Polymorphic d = new Demo3Polymorphic();
        d.useAnimal(new Dog());//Animal a = new Dog()；
        d.useAnimal(new Cat());//Animal a = new Cat();
    }

    public void useAnimal(Animal a) {
        a.eat();
    }


}
