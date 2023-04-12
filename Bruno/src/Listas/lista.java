package Listas;
public class lista {
    private Integer[] elementos = new Integer[10];
    public int quantidadeElementos(){
        int quantidade = 0;
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] != null) {
                quantidade++;
            }
        }
        return quantidade;
    }
    public boolean estaCheia(){
        return quantidadeElementos() == elementos.length;
    }
    public boolean estaVazia(){
        return quantidadeElementos() == 0;
    }
    public void inserirElemento(Integer elemento){
        if(estaCheia()) return;
        
        Integer posicaoDisponivel = null;
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i] == null) {
                posicaoDisponivel = i;
                break;
            }
        }
        
        elementos[posicaoDisponivel] = elemento;
    }
    	public String imprimirLista() {
    		String valor = "";
    		for(int i=0; i<elementos.length; i++) {
    			if(elementos[i] != null) {
    				valor += elementos [i] +" ";
    		}
    			
    	}
    		return valor;
    }
    		
                
    	public void remover (int valor) {
    		for (int i=0; i<elementos.length; i++) {
    			if (elementos[i] == valor) {
    				elementos [i] = null;
    				break;
    			}
    			break;
    		}
    	}
            }




