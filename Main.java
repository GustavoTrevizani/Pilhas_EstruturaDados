public class Main {

    public static void main(String[] args) {

        String[] testes = {
                "5 + 3 * [(2 - 1)]", // VÁLIDA
                "5 + * 3", // INVÁLIDA (dois operadores seguidos)
                "(5 + 3) / / 2", // INVÁLIDA (dois operadores seguidos)
                "+ 5 - 2", // INVÁLIDA (começa com operador)
                "5 + 3 -", // INVÁLIDA (termina com operador)
                "5 + ( * 3)", // INVÁLIDA (operador após abertura)
                "5 + (3 - )", // INVÁLIDA (fechamento após operador)
                "{5 + [3 * (2 / 2)]}" // VÁLIDA
        };

        System.out.println("--- Validador de Expressões ---");

        for (String string : testes) {
            System.out.printf(
                    "Expressão: %-25s -> %s\n",
                    string,
                    (ValidadorExpressao.isValida(string)
                            ? "VÁLIDA"
                            : "INVÁLIDA"));
        }
    }
}