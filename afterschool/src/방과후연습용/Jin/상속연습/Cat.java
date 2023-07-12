package 방과후연습용.Jin.상속연습;

public class Cat {
//    private int age;
//    private String color;
//    private String name;



//    public Cat(){
//        age = 12;
//        color = "Black";
//        name = "나비";
//    }
//    public Cat(int age, String color,String name){
//        this.age=age;
//        this.color=color;
//        this.name=name;
//    }
//    public Cat(int age){
//        this.age=age;
//    }
//    public void status(){
//        System.out.println("집나간 고양이를 찾습니다.");
//        System.out.printf("나이 : %d\n",age);
//        System.out.printf("색상 : %s\n",color);
//        System.out.printf("이름 : %s\n",name);
//    }



    String name;
    int age;
    public Cat(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void sayAge(){
        System.out.printf("고양이 이름 : %s\n",name);
        System.out.printf("고양이 나이 : %d\n",age);
        System.out.println();
    }
    public void lie() {
        System.out.println("생쥐가 나타났다!");
    }
}
