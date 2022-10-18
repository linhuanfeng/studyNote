package 父子类加载顺序.父子相同属性;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Son().getName()); // son
    }
    static class Father{
        private String name="father";
    }
    static class Son extends Father{
        private String name="son";
        public String getName() {
            return name;
        }
    }
}
