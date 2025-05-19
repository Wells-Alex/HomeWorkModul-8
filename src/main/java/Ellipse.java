class Ellipse extends Shape{
    public Ellipse(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing an Ellipse...");
    }
}