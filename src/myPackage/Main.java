package myPackage;

public class Main {
    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };
        person.hello();

        XinChao x = new XinChao() {
            @Override
            public void xinChao() {
                super.xinChao();
            }
        };
        x.xinChao();
    }
}
abstract class XinChao{
    public void xinChao() {
        System.out.println("Xin Chao");
    }
}
// tao doi tuong dong thoi tao 1 lop vo danh;

// co constructor auto;

// OVerride lai cac Ham;

// dung nhieu thuc te;

// tao nhanh subClass cho inplement Interface, hoac extends Abstract;