public class Arithmetica {
    private int x;
    private int y;

    public Arithmetica(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void printInfo() {
        System.out.println("Сумма чисел: " + (x + y));
        System.out.println("Произведение чисел: " + (x * y));

        if (x > y) {
            System.out.println("Большее число: " + x);
            System.out.println("Меньшее число: " + y);
        } else {
            System.out.println("Большее число: " + y);
            System.out.println("Меньшее число: " + x);
            }
        }
    }