package designpartterns.singleton;

public class DoubleCheck {

    private volatile static DoubleCheck INSTANCE;

    public DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
