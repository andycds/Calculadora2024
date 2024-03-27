import javax.swing.JOptionPane;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(
                Double.parseDouble(JOptionPane.showInputDialog("Digite seu número preferido")));
        double resultadoSoma = calc.somar(2, 2);
        System.out.println(resultadoSoma);

        System.out.println(calc.somarComPreferido(
                Double.parseDouble(JOptionPane.showInputDialog("Digite seu número para somar com o preferido"))));

        System.out.println(calc.subtrair(10, 3));
    }
}
