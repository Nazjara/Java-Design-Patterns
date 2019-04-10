package nazjara;

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return (22/7) * radius * radius;
    }
}
