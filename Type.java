// Java Example 2
// Type inference

public class Type {
    // a return type of 'int' is required in the function declaration 
    // it cannot be inferred by the compiler in Java
    public static int foo(int x) {
        return x + 1;
    }

    public static void main(String[] args) {
        System.out.println(foo(5));
    }
}
