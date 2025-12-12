package itheima.ChangeTyper;

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
    public void watchHome(){
        System.out.println("狗看家");
    }
}
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}


public class Demo2Polymorphic {

    public static void main(String[] args) {
        Demo2Polymorphic d = new Demo2Polymorphic();
        d.useAnimal(new Dog());//Animal a = new Dog()；
        d.useAnimal(new Cat());//Animal a = new Cat();
    }

    public void useAnimal(Animal a) {
        a.eat();
        if(a instanceof Dog) {
            Dog d = (Dog) a;
            d.watchHome();
        }
    }


}
