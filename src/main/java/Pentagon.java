class Pentagon extends Shape {
    public Pentagon(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Pentagon...");
    }
}