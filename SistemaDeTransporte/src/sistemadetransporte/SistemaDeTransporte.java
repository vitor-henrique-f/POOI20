
package sistemadetransporte;

public class SistemaDeTransporte {

    public static void main(String[] args) {
    
        Transporte t1 = new Taxi(4, "CooperTaxi", 10.0);
        Transporte t2 = new Uber(4, "Uber", 10.0);
        Transporte t3 = new Onibus(40, "Empresa Urbana", 5.0);
        Transporte t4 = new Metro(200, "Metrô City", 6.0);

        Transporte[] transportes = {t1, t2, t3, t4};

        for (Transporte t : transportes) {
            System.out.println("Empresa: " + t.getEmpresa());
            System.out.println("Tarifa final: R$" + t.calcularTarifa());
            System.out.println("----------------------");
        }
        
    }
    
}
