import java.util.LinkedList;

public class Nodo {
  private char id;
  private int distanza;
  private boolean visitato;
  private LinkedList<Link> links;

  public Nodo(char id) {
    this.id = id;
    
    this.distanza = Integer.MAX_VALUE;
    this.visitato = false;
    this.links = new LinkedList<Link>();
    
  }

  public char getId() {
    return id;
  }
  
  public int getDistanza() {
    return distanza;
  }

  public boolean isVisitato() {
    return visitato;
  }

  public LinkedList<Link> getLinks() {
    return links;
  }

  public void setDistanza(int distanza) {
    this.distanza = distanza;
  }

  public void setVisitato(boolean visitato) {
    this.visitato = visitato;
  }


  public void addLink(Link link){
    links.add(link);
  }
}