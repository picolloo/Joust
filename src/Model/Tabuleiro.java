/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import rede.Lance;


/**
 *
 * @author Lucas
 */
public class Tabuleiro {   
    
    private Cavalo jogador1;
    private Cavalo jogador2;
    private Posicao posicoes[][] = new Posicao[8][8];
    private boolean partidaEmAndamento;    

    public Tabuleiro() {
        for (int i = 0; i < posicoes.length; ++i) {
            for (int j = 0; j < posicoes.length; ++j) {
                posicoes[i][j] = new Posicao();
            }
        }
        
        this.jogador1 = this.jogador2 = null;
    }      
    
    public void criaJogador1(String idJogador) {
    	this.jogador1 = new Cavalo(idJogador, 1, 7, 3);       	  
    }
    
    public void criaJogador2(String idJogador) {
    	this.jogador2 = new Cavalo(idJogador, 2, 0, 4);  
    }
    
    
    public int trataLance(Lance lance) {
        Cavalo jogador = getJogador(lance.getIdJogador());
        
        if (validaPosicaoDestino(jogador.getLinha(), jogador.getColuna(),
                                lance.getLinha(), lance.getColuna())) {
            return verificarVencedor(lance.getIdJogador()) ? 2 : 0;
        }
        
        return 1;
    }
    
    public void assumirLance(Lance lance) {
        Cavalo jogador = getJogador(lance.getIdJogador());
        
        getPosicaoJogador(jogador).desativar();
        getPosicao(lance.getLinha(), lance.getColuna()).setOcupacao(jogador.getCor());
    }
    
    public Cavalo getJogador(String idJogador) {
    	return jogador1.getId().equals(idJogador) ? jogador1 : jogador2;
    }
    
    public boolean validaPosicaoDestino(int linhaAtual, int colunaAtual, int linhaDest, int colunaDest) {
        int linha = linhaAtual - linhaDest;
        int coluna = colunaAtual - colunaDest;
        
        if (linha >= -2 && linha != 0 && linha <= 2
                && coluna >= -2 && coluna != 0 && coluna <= 2
                && Math.abs(linha) != Math.abs(coluna)) {
        	
        	return true;
        }            
        else {
            linha = linhaAtual + linhaDest;
            coluna = colunaAtual + colunaDest; 
            
            return linha >= -2 && linha != 0 && linha <= 2
                && coluna >= -2 && coluna != 0 && coluna <= 2
                		&& Math.abs(linha) != Math.abs(coluna);
        }
    }
    
    public Posicao getPosicaoJogador(Cavalo jogador){ 
        for (int i = 0; i < posicoes.length; ++i) {
            for (int j = 0; j < posicoes.length; ++j) {
                if (posicoes[i][j].informarOcupante() == jogador.getCor())
                	return posicoes[i][j];
            }
        }
        return null;
    }
    

    public boolean infomarEmAndamento() {
        return partidaEmAndamento;
    }

    public void setEmAndamento(boolean partidaEmAndamento) {
        this.partidaEmAndamento = partidaEmAndamento;
    }
    
    public Posicao getPosicao(int linha, int coluna){ 
        return posicoes[linha][coluna];
    }
    
    public void resetarPosicoes() {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                posicoes[i][j].setOcupacao(0);
            }
        }
    }
    
    public String getIdVencedor() {
    	return jogador1.isVencedor() ? jogador1.getId() : jogador2.getId();
    }
    
      
    public boolean verificarVencedor(String idJogador) {    	
    	Cavalo jogador = getJogador(idJogador);
    	
    	for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
            	if (validaPosicaoDestino(jogador.getLinha(), jogador.getColuna(), i, j))
            		return false;        	
            }
        }   	    	
    	
        return true;
    }

    public void ativarPosicoesIniciais() {  
        resetarPosicoes();
        posicoes[0][4].setOcupacao(jogador2.getCor());
        posicoes[7][3].setOcupacao(jogador1.getCor());         
   }
 
}
