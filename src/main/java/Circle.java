class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}