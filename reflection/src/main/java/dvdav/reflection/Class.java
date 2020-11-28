package dvdav.reflection;

import dvdav.api.Wrapper;

public class Class<T> implements Wrapper<java.lang.Class<T>> {

    private final java.lang.Class<T> javaClass;

    @SuppressWarnings("unchecked")
    public Class(String name) {
        try {
            javaClass = (java.lang.Class<T>) java.lang.Class.forName(name);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Class<T> findByName(String name) {
        return new Class<>(name);
    }

    @Override
    public java.lang.Class<T> get() {
        return javaClass;
    }
}
