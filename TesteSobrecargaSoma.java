public class TesteSobrecargaSoma {
    public static void main(String[] args) {
        CalculadoraOO c = new CalculadoraOO();
        int x = 1;
        int y = 2;
        int z = 3;
        String s1 = "50";
        String s2 = "60";
        float f1 = 56.7f;
        float f2 = 0.3f;
        // somando dois números reais
        System.out.println(c.soma(f1, f2));
        // somando dois inteiros
        System.out.println(c.soma(x, y));
        // somando inteiro e string
        System.out.println(c.soma(x, s1));
        // somando string e inteiro
        System.out.println(c.soma(s1, x));
        // somando string e string
        System.out.println(c.soma(s1, s2));
        // somando três inteiros
        System.out.println(c.soma(x, y, z));
    }
}
