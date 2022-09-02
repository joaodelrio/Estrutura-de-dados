public abstract class ListaEstatica {
    
    public int prim;
    public int ultimo;
    
    abstract public void insere(Conta p);
    abstract public void limpaLista();
    abstract public String busca(String s);
    abstract public void remove(String r);
    abstract public void imprimeLista();
    
}
