public class Pilha {

    private int topo;
    private char pilha[];

    public Pilha(int tamanho) {
        this.topo = 0;
        this.pilha = new char[tamanho];
    }

    public boolean push(char simbolo) {
        if (this.topo < this.pilha.length) {
            this.pilha[this.topo] = simbolo;
            this.topo++;
            return true;
        }
        return false;
    }

    public char pop() {
        if (!pilhaVazia()) {
            char topoPilha = this.pilha[this.topo - 1];
            this.topo--;
            return topoPilha;
        }
        return '\0';
    }

    public char buscarTopo() {
        if (!pilhaVazia()) {
            return this.pilha[this.topo - 1];
        }
        return '\0';
    }

    public boolean pilhaVazia() {
        return this.topo == 0;
    }
}