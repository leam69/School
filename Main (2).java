public class Main {
  public static void main(String[] args) {
    
    
    Grafo grafo = creaGrafo();

    
    Grafo.dijkstra(grafo, grafo.getNodo('A'));

    for (Nodo nodo : grafo.getNodi()) {
      System.out.println("Nodo " + nodo.getId() + " | " + "Distanza = " + nodo.getDistanza());
    }
  }

  public static Grafo creaGrafo() {
    Grafo grafo = new Grafo();

    Nodo nodoA = new Nodo('A');
    Nodo nodoB = new Nodo('B');
    Nodo nodoC = new Nodo('C');
    Nodo nodoD = new Nodo('D');
    Nodo nodoE = new Nodo('E');

    grafo.addNodo(nodoA);
    grafo.addNodo(nodoB);
    grafo.addNodo(nodoC);
    grafo.addNodo(nodoD);
    grafo.addNodo(nodoE);

    grafo.addLink(new Link(nodoA, nodoB, 4));
    grafo.addLink(new Link(nodoA, nodoC, 10));
    grafo.addLink(new Link(nodoB, nodoC, 2));
    grafo.addLink(new Link(nodoB, nodoD, 1));
    grafo.addLink(new Link(nodoC, nodoD, 8));
    grafo.addLink(new Link(nodoC, nodoE, 3));
    grafo.addLink(new Link(nodoD, nodoE, 5));

    return grafo;
  }
}