
package sistemadispositivoseletronicos;


public class Dispositivo {
    
    private String nome;
    private String marca;
    private boolean ligado;

    public Dispositivo(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(nome + " foi ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " foi desligado.");
    }

    public void executarFuncao() {
        System.out.println("Executando função genérica.");
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
