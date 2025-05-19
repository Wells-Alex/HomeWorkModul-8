public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract String getName();
    public void draw() {
        System.out.println("Drawing a shape...");
    }
 }