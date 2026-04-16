
package sistemadeveiculos;

public class Veiculo{
    
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        if (ano > 1885) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido");
        }
    }

    public void mover() {
        System.out.println("O veículo está se movendo.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano > 1885) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido");
        }
    }
    
}
