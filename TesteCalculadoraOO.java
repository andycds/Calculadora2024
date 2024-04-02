import javax.swing.JOptionPane;

public class TesteCalculadoraOO {
    public static void main(String[] args) {
        CalculadoraOO c = new CalculadoraOO();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão"));
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro operando?"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo operando?"));
        int resultado;
        if (opcao == 1) {
            resultado = c.soma(operando1, operando2);
        } else if (opcao == 2) {
            resultado = c.subtracao(operando1, operando2);
        } else if (opcao == 3) {
            resultado = c.multiplicacao(operando1, operando2);
        } else {
            resultado = c.divisao(operando1, operando2);
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
