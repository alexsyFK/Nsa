/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import design.DadosCadastrais;
import design.TelaCadastro;
import design.Test;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Nsa {
    static int keyx;
    public static int user;  
    public static int Mb;  
       public static int key;
   public static ParticipantesNsa member[]=new ParticipantesNsa[10];   
    public static ParticipantesNsa prtc[]=new ParticipantesNsa[10]; 
public static int ctr;   

    


public static int getMb() {
        return Mb;
    }

    public static void setMb(int Mb) {
        Nsa.Mb = Mb;
    }

    public static int getKeyx() {
        return keyx;
    }

    public static void setKeyx(int keyx) {
        Nsa.keyx = keyx;
    }

    public static int getUser() {
        return user;
    }

    public static void setUser(int user) {
        Nsa.user = user;
    }
   
    
    



    public static int getCtr() {
        return ctr;
    }

    public static void setCtr(int ctr) {
        Nsa.ctr = ctr;
    }
   
   




    public static ParticipantesNsa[] getMember() {
        return member;
    }

    public static void setMember(ParticipantesNsa[] member) {
        Nsa.member = member;
    }

public static int getKey() {
        return key;
    }

    public static void setKey(int key) {
        Nsa.key = key;
    }



    public static ParticipantesNsa[] getPrtc() {
        return prtc;
    }

    
    //add membro
    public void AddMember(){
  
if(prtc[ctr].getSituation().equals("aprovado")){    
    
    ParticipantesNsa prt2=new ParticipantesNsa();
    prt2.setId(Nsa.prtc[ctr].getId());
    prt2.setNome(Nsa.prtc[ctr].getNome());
    prt2.setPassword(Nsa.prtc[ctr].getPassword());
    prt2.setIdade(Nsa.prtc[ctr].getIdade());
    prt2.setHabilidade(Nsa.prtc[ctr].getHabilidade());
    prt2.setCargo(Nsa.prtc[ctr].getCargo());
    prt2.setEmail(Nsa.prtc[ctr].getEmail());
    prt2.setSexo(Nsa.prtc[ctr].getSexo());
    prt2.setAnoIns(Nsa.prtc[ctr].getAnoIns());
   prt2.setAnoTerm(Nsa.prtc[ctr].getAnoTerm());
    prt2.setSituation(Nsa.prtc[ctr].getSituation());
   prt2.setPontos(Nsa.prtc[ctr].getPontos());
    member[Mb]=prt2;
      JOptionPane.showMessageDialog(null,"Membro add!");
Mb++;    
}
    
    }
    
    
    
    
    ////checkar usuario  esenha,login screen
     public void chk(String id,String pass){
        DadosCadastrais Dads=new DadosCadastrais();
 
        for(int i =0;i<Mb;i++)
        if(Nsa.member[i].getId().equals(id) && Nsa.member[i].getPassword().equals(pass)){
      Dads.setVisible(true);
     Dads.setLabel(i);
      JOptionPane.showMessageDialog(null,"Bem-vindo "+Nsa.member[i].getNome());

break;
  
       
        }

         }
     
    
     
     public void booble(int i){

    for(;i<Nsa.Mb-1;++i){
    int j=i+1;
Nsa.member[i].setNome(Nsa.member[j].getNome());
        Nsa.member[i].setIdade(Nsa.member[j].getIdade());
        Nsa.member[i].setId(Nsa.member[j].getId());
        Nsa.member[i].setHabilidade(Nsa.member[j].getHabilidade());
        Nsa.member[i].setPassword(Nsa.member[j].getPassword());
        Nsa.member[i].setCargo(Nsa.member[j].getCargo());
        Nsa.member[i].setEmail(Nsa.member[j].getEmail());
        Nsa.member[i].setSexo(Nsa.member[j].getSexo());
        Nsa.member[i].setAnoIns(Nsa.member[j].getAnoIns());
        Nsa.member[i].setAnoTerm(Nsa.member[j].getAnoTerm());
        Nsa.member[i].setPontos(Nsa.member[j].getPontos());
        Nsa.member[i].setSituation(Nsa.member[j].getSituation());
 }
Nsa.Mb--;
}
 
  
 
 
 
   public void ids(){
    int i = 0;
  System.out.println("\n\n");
    for(;i<Nsa.Mb;i++)
        System.out.println("MEMBRO:"+Nsa.member[i].getId());
 
 
   }
}
   
   
   
   
 
