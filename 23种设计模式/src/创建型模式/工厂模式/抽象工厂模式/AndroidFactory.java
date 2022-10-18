package 创建型模式.工厂模式.抽象工厂模式;

public class AndroidFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }
    @Override
    public UIController createInterfaceController() {
        return new AndroidUIController();
    }
}