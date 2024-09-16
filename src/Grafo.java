import java.util.*;

public class Grafo {
    ArrayList<LinkedList<Vertices>> listaAdjacentes;

    public Grafo() {
        listaAdjacentes = new ArrayList<>();
    }

    public void addVertices(Vertices vertice) {
        LinkedList<Vertices> listaAtual = new LinkedList<>();
        listaAtual.add(vertice);
        listaAdjacentes.add(listaAtual);
    }

    public void addAresta(int fonte, int destino) {
        LinkedList<Vertices> listaAtual = listaAdjacentes.get(fonte);
        Vertices verticeDestino = listaAdjacentes.get(destino).get(0);
        listaAtual.add((verticeDestino));
    }

    public boolean checkAresta(int fonte, int detino) {
        LinkedList<Vertices> listaAtual = listaAdjacentes.get(fonte);
        Vertices verticeDestino = listaAdjacentes.get(detino).get(0);
        for (Vertices vertice : listaAtual) {
            if (vertice == verticeDestino) {
                return true;
            }
        }
        return false;
    }

    public void printGrafo() {
        for (LinkedList<Vertices> listaAtual : listaAdjacentes) {
            for (Vertices vertice : listaAtual) {
                System.out.print(vertice.dado + "->");
            }
            System.out.println();
        }
    }
}
