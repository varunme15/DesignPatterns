package singleton;

public class LazyHolderSIngleton {
	private LazyHolderSIngleton(){};
	private static class LazyHolder {
        private static final LazyHolderSIngleton INSTANCE = new LazyHolderSIngleton();
    }
 
    public static LazyHolderSIngleton getInstance() {
        return LazyHolder.INSTANCE;
    }

}
