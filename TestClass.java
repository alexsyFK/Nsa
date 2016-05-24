/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class TestClass {
 int perguntas;    
 int erros;    
 int acertos;    

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
int pontos=0;
         public int ComputarPontos(boolean a,boolean b,boolean c,boolean d,boolean e){
         pontos+=a==true?20:0;
         
pontos+=b==true?20:0;
         pontos+=c==true?20:0;
         pontos+=d==true?20:0;
         pontos+=e==true?20:0;
        
             JOptionPane.showMessageDialog(null,"finalizado com sucesso! ");
         return pontos;
         }

         
         public void Situation(){
          Nsa.prtc[Nsa.ctr].setSituation(Nsa.prtc[Nsa.ctr].getPontos()>=60?"aprovado":"reprovado");
         }
         
         
         
    public int getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(int perguntas) {
        this.perguntas = perguntas;
    }
         
 
         void Respostas(){
         /*1-6
         2-insert
         3-update
         4-2775
         5-join;
        */
                 }
         
         
         }
