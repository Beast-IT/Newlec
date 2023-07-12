package 방과후연습용.Jin.상속연습;

public class LiarCat extends Cat{
//    @Override
//    public void status() {
//        super.status();
//        System.out.println("찾았다!");
//    }
    public LiarCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayAge() {
        age=age*2;
        super.sayAge();
    }

    @Override
    public void lie() {
        super.lie();
    }
}
