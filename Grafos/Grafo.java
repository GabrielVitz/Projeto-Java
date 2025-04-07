package Grafos;
import java.util.ArrayList;

public class Grafo<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    //metodo construtor
    public Grafo() {
       this.vertices = new ArrayList<Vertice<TIPO>>();
       this.arestas = new ArrayList<Aresta<TIPO>>();

    }
    public void adicionarVertice(TIPO dado){
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);

    }
    public void adicionarAresta(double peso, TIPO dadoInicio, TIPO dadoFim){
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    //toda vex que eu adicionar um nome, ele vai procurar na lista ver se tem ou não
    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> vertice = null;
        for (int x = 0; x < this.vertices.size(); x++){
            if (this.vertices.get(x).getDado().equals(dado)){
                vertice = this.vertices.get(x);
                break;
            }    
        }
        return vertice;
    }
    public void buscaEmLargura(){
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>(); 
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>(); 
        Vertice<TIPO> atual = this.vertices.get(4); // por que 4 ? por que é apartir do nome "Saitama" 
        marcados.add(atual);                              // que ele vai percorrer todo o grafo  
        System.out.println(atual.getDado());
        fila.add(atual);
        while (fila.size() > 0) {
            Vertice<TIPO> visitado = fila.get(0);
            for(int i = 0;i < visitado.getArestasSaida().size(); i ++ ){
                Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();
                if(!marcados.contains(proximo)){ //se o vertice não for marcado
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
