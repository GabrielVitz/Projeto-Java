package Grafos;
import java.util.ArrayList;
public class ImplementandoGrafos {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();    
        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Creber");
        grafo.adicionarVertice("Gabriel");
        grafo.adicionarVertice("Saitama");

        grafo.adicionarAresta(2, "João", "Lorenzo");
        grafo.adicionarAresta(3, "Lorenzo", "Gabriel");
        grafo.adicionarAresta(1, "Gabriel", "Creber");
        grafo.adicionarAresta(1, "João", "Creber");
        grafo.adicionarAresta(2, "Saitama", "Lorenzo");
        grafo.adicionarAresta(3, "Saitama", "João");


        grafo.buscaEmLargura();
    }
}
