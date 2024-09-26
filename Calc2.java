package calculadora2;

public class Calc2 {
    private double x;

    private double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    public double soma(double x, double y) {
        setX(x + y);
        return getX();
    }
    public double subtracao(double x, double y) {
        setX(x - y);
        return getX();
    }
    public double multiplicacao(double x, double y) {
        setX(x * y);
        return getX();
    }
    public double divisao(double x, double y) {
        setX(x / y);
        return getX();
    }


}
