package Animal;

public class Object {
    public String toString() {
        return getClass().getName() + "@"
                + Integer.toHexString(hashCode());
    }

    public boolean equals(java.lang.Object obj) {
        return this == obj;
    }
    public native int hashCode();
}
