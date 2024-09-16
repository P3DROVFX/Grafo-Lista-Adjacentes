public class Main {
    public static void main(String[] args) {
        //GRAFOS COM REPRESENTACAO EM LISTA DE ADJACENCIAS SAO MELHORES PARAS GRAFOS MAIS ESPERSSOS, SEM ELES UTILIZAM UMA LIUSTA ENCADEADA CMO NOS QUE
        //APONTAM PARA O PRÓXIMO

        Grafo grafo = new Grafo();
        /*
        T = TABIRA
        Q = QUIXABA
        S = SERRA TALHADA
        P = PRINCESA ISABEL
        G = GARANHUNS
        */

        grafo.addVertices(new Vertices('T'));
        grafo.addVertices(new Vertices('Q'));
        grafo.addVertices(new Vertices('S'));
        grafo.addVertices(new Vertices('P'));
        grafo.addVertices(new Vertices('G'));

        grafo.addAresta(0, 1);
        grafo.addAresta(1, 0);
        grafo.addAresta(1, 2);
        grafo.addAresta(1, 3);
        grafo.addAresta(0, 4);
        grafo.addAresta(2, 0);
        grafo.addAresta(2, 1);
        grafo.addAresta(3, 1);
        grafo.addAresta(4, 0);

        grafo.printGrafo();


    }
}