package 创建型模式.工厂模式.抽象工厂模式;

class AndroidUIController implements UIController {
    @Override
    public void display() {
        System.out.println("AndroidInterfaceController");
    }
}