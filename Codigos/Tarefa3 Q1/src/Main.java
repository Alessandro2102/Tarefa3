import java.util.ArrayList;
import java.util.List;

class Carro {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void dirigir() {
        System.out.println("Carro modelo: " + modelo);
    }
}

class Pessoa {
    private String nome;
    private List<Carro> carrosUsados;

    public Pessoa(String nome) {
        this.nome = nome;
        this.carrosUsados = new ArrayList<>();
    }

    public void usarCarro(Carro carro) {
        carrosUsados.add(carro);
        carro.dirigir();
    }

    public void listarCarrosUsados() {
        System.out.println(nome + " Usou os carros:");
        for (Carro c : carrosUsados) {
            System.out.println("- " + c.getModelo());
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Peugeot");
        Carro carro2 = new Carro("Mobi");
        Carro carro3 = new Carro("Yaris");

        Pessoa alessandro = new Pessoa("Alessandro");

        alessandro.usarCarro(carro1);
        alessandro.usarCarro(carro2);
        alessandro.usarCarro(carro3);

        alessandro.listarCarrosUsados();
    }
}

