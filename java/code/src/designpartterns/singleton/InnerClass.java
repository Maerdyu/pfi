package designpartterns.singleton;

public class InnerClass {

    private InnerClass() {
    }

    private static class InnerClassHolder {
        private static final InnerClass INSTANCE = new InnerClass();
    }

    public static InnerClass getInstance() {
        return InnerClassHolder.INSTANCE;
    }
}
