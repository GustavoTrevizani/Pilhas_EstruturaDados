public class ValidadorExpressao {

    public static boolean isValida(String expressao) {

        Pilha pilha = new Pilha(expressao.length());

        char[] caracteres = expressao.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {

            char atual = caracteres[i];

            if (atual == ' ') {
                continue;
            }

            if (ehAbertura(atual)) {
                pilha.push(atual);
            }

            else if (ehFechamento(atual)) {

                if (pilha.pilhaVazia()) {
                    return false;
                }

                char topo = pilha.pop();

                if (!combina(topo, atual)) {
                    return false;
                }
            }

            else if (ehOperador(atual)) {

                if (i == 0 || i == caracteres.length - 1) {
                    return false;
                }

                char anterior = procurarAnterior(caracteres, i);
                char proximo = procurarProximo(caracteres, i);

                if (ehOperador(anterior) || ehOperador(proximo)) {
                    return false;
                }

                if (ehAbertura(anterior)) {
                    return false;
                }

                if (ehFechamento(proximo)) {
                    return false;
                }
            }
        }

        return pilha.pilhaVazia();
    }

    private static char procurarAnterior(char[] caracteres, int indice) {

        for (int i = indice - 1; i >= 0; i--) {

            if (caracteres[i] != ' ') {
                return caracteres[i];
            }
        }

        return '\0';
    }

    private static char procurarProximo(char[] caracteres, int indice) {

        for (int i = indice + 1; i < caracteres.length; i++) {

            if (caracteres[i] != ' ') {
                return caracteres[i];
            }
        }

        return '\0';
    }

    private static boolean ehOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static boolean ehAbertura(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private static boolean ehFechamento(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private static boolean combina(char abertura, char fechamento) {

        return (abertura == '(' && fechamento == ')')
                || (abertura == '[' && fechamento == ']')
                || (abertura == '{' && fechamento == '}');
    }
}