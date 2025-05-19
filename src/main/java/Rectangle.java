class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}