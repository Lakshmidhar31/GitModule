public class Calculator{
    public int add(int a, int b){
        System.out.println("This is Add Method with two parameters");
        return a + b;
    }

    public int add(int a, int b, int c){
        System.out.println("This is Add Method with three parameters");
        return a + b + c;
    }

    public int add(int a, int b, int c, int d){
        System.out.println("This is Add Method with four parameters");
        return a + b + c + d;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public int mul(int a, int b){
        return a * b;
    }

    public int sqrt(int a){
        return Math.sqrt(a);
    }
}