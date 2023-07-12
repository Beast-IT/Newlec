package 방과후연습용.Jin.상속연습;

public class Program {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//
//        cat1.status();
//
//        Cat cat2 = new Cat(12, "빨강", "Meow");
//        cat2.status();
//
//        Cat cat3 = new Cat(12);
//        cat3.status();
//
//        Cat cat4 = new LiarCat();
//        cat4.status();
        Cat cat1 = new Cat("나비",10);
        cat1.sayAge();

        Cat cat2 = new LiarCat("쿠라",3);
        cat2.sayAge();

//        LiarCat cat3 = new Cat("루비", 6);
//        cat3.sayAge(); // ?
//        cat3.lie(); // ?

        LiarCat cat4 = new LiarCat("드래곤", 4);
        cat4.sayAge(); // ?
        cat4.lie(); // ?

    }
}
