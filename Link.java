public class Link {
  
  private Nodo nodoPartenza, nodoDestinazione;
  private int weight;

  public Link(Nodo nodoPartenza, Nodo nodoDestinazione, int weight) {
    
    this.nodoPartenza = nodoPartenza;
    this.nodoDestinazione = nodoDestinazione;
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }
  
  public Nodo getPartenza() {
    return nodoPartenza;
  }

  public Nodo getDestinazione() {
    return nodoDestinazione;
  }

  
  
}