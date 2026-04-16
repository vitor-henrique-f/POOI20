
package sistemadeprodutos;


public class SistemaDeProdutos {

    public static void main(String[] args) {

        Produto p1 = new Livro("Java Básico", 100, 2);
        Produto p2 = new Eletronico("Celular", 2000, 1);
        Produto p3 = new Roupa("Camiseta", 50, 3);
        Produto p4 = new Alimento("Maçã", 10, 5);

        Produto[] produtos = {p1, p2, p3, p4};

        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome());
            System.out.println("Preço final: " + p.calcularPrecoFinal());
            System.out.println("-------------------------");
        }
        
    }
    
}
