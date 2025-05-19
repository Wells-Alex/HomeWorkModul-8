class Triangle extends Shape {
    public Triangle (String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle...");
    }
}