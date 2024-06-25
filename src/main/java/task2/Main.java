package task2;

public class Main {
    public static void main(String[] args) {
        //a = 10
        String a = "1010";
        //b = 35
        String b = "100011";

        BinOps binOps = new BinOps();
        String sum = binOps.sum(a, b);
        System.out.println("Результат a + b в двоичной записи = " + sum);
        // для проверки переведем результат в int
        int sumResult = Integer.parseInt(sum, 2);
        System.out.println("Двоичная строка результата сложения a и b, переведенная в число: " + sumResult);

        String mult = binOps.mult(a, b);
        System.out.println("Результат a * b в двоичной записи = " + mult);
        // для проверки переведем результат в int
        int multResult = Integer.parseInt(mult, 2);
        System.out.println("Двоичная строка результата умножения a и b, переведенная в число: " + multResult);
    }
}
