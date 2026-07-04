package entities;

public class Triangle {
    // Atributos da classe Triangle
    public double a;
    public double b;
    public double c;

    // Método para calcular a área do triângulo dentro da classe Triangle
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt( p * (p - a) * (p - b) * (p - c));
    }
}
