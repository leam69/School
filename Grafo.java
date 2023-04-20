import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Grafo{
  
  private LinkedList<Nodo> nodi;
  private LinkedList<Link> links;

  public Grafo(){
    this.nodi = new LinkedList<>();
    this.links = new LinkedList<>();
  }

  public void addNodo(Nodo nodo) {
    nodi.add(nodo);
  }

  public Nodo getNodo(char id) {
    for (Nodo nodo : nodi) {
      if (nodo.getId() == id) {
        return nodo;
      }
    }
    return null;
  }

  public void addLink(Link link) {
    Nodo partenza = link.getPartenza();
    partenza.addLink(link);
    links.add(link);
  }

  public LinkedList<Nodo> getNodi() {
    return nodi;
  }

  public LinkedList<Link> getLinks() {
    return links;
  }

  public static void dijkstra(Grafo grafo, Nodo source) {
    source.setDistanza(0);

    PriorityQueue<Nodo> queue = new PriorityQueue<>(Comparator.comparingInt(Nodo::getDistanza));
    queue.add(source);

    while (!queue.isEmpty()) {
      Nodo nodoCorrente = queue.poll();
      nodoCorrente.setVisitato(true);

      for (Link link : nodoCorrente.getLinks()) {
        Nodo nodoDestinazione = link.getDestinazione();

        if (!nodoDestinazione.isVisitato()) {
          int newDistanza = nodoCorrente.getDistanza() + link.getWeight();

          if (newDistanza < nodoDestinazione.getDistanza()) {
            queue.remove(nodoDestinazione);
            nodoDestinazione.setDistanza(newDistanza);
            nodoDestinazione.setVisitato(true);
            queue.add(nodoDestinazione);
            
          }
        }
      }
    }
  }
}