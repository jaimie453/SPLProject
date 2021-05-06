// Java Example 1 
// Object Oriented

public class Square {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    public int getArea() {
        return size * size;
    }

    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println(s.getArea());    // prints 25
    }
}

