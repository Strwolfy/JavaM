package hash;

public class MyClass {
    private Long id;
    private String name;

    public MyClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object object) {
        System.out.println("Equals is called:" + this + " : " + object);
        MyClass other = (MyClass) object;
        return id.equals(other.id) && name.equals(other.name);
    }
    public int hashCode() {
        System.out.println("HashCode is called:" + this);
        return id.intValue();
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
