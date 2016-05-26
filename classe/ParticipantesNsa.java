/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import static classes.Nsa.prtc;
import design.DadosCadastrais;
import design.TelaCadastro;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ParticipantesNsa {
 static int prtcs;
    static int control;
 static  int j;
 
 
 private String id;
 private String nome;
 private String  password;
 private String  habilidade;
 private String  cargo;   
 private String email;   
 private String sexo;   
 private String AnoIns;   
 private String AnoTerm;  
 private String situation="pendente";
 private Integer idade;
private Integer pontos=0;

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        ParticipantesNsa.j = j;
    }

 
   

   
    
public void ParticipantesNsa(String nome,String  password,String  habilidade,String  cargo,String email,String sexo,String id,int idade){
this.nome=nome;
this.password=password;
this.habilidade=habilidade;
this.cargo=cargo;        
this.email=email;
this.sexo=sexo;
this.id=id;
this.idade=idade;       
}
 
 public  ParticipantesNsa(){
 
 }
 
 public  ParticipantesNsa(String id){
 this.id=id;
 }
 
 

  public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getAnoIns() {
        return AnoIns;
    }

    public void setAnoIns(String AnoIns) {
        this.AnoIns = AnoIns;
    }

   

    
    

 

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

 
    public String getAnoTerm() {
        return AnoTerm;
    }

    public void setAnoTerm(String AnoTerm) {
        this.AnoTerm = AnoTerm;
    }
 
    public ParticipantesNsa[] getA() {
        return a;
    }

    public void setA(ParticipantesNsa[] a) {
        this.a = a;
    }
ParticipantesNsa[] a = new ParticipantesNsa[5];
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    *
    *métodos
    *
    */
    
    
    
    
  

  
    public void Cad(String id,String nome,String pass,int idade,String habilidade,String cargo,String email,String sexo){
   
   ParticipantesNsa prt=new ParticipantesNsa();
   control=Nsa.key;
   prtcs=Nsa.key-1;        

DateFormat data = new SimpleDateFormat("dd/MM/yy");
Date cad = new Date();
Calendar cal = Calendar.getInstance();
    cal.add(Calendar.YEAR, +1);
   prt.setAnoTerm(data.format(cal.getTime()));

     
   do{
       
       
    prt.setId(id);
    prt.setNome(nome);
    prt.setPassword(pass);
    prt.setIdade(idade);
    prt.setHabilidade(habilidade);
    prt.setCargo(cargo);
    prt.setEmail(email);
    prt.setSexo(sexo);
    prt.setAnoIns(data.format(cad));
    Nsa.prtc[control]=prt;
    JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!");
   ++Nsa.key;
    break;
   
   }
   while(Nsa.prtc[Nsa.key].equals(null));
        
        }



 
      
      
      
      
      
      
      
      
    
//remove prtc
public void booble(int i){

    for(;i<Nsa.key-1;++i){
    int j=i+1;
Nsa.prtc[i].setNome(Nsa.prtc[j].getNome());
 Nsa.prtc[i].setIdade(Nsa.prtc[j].getIdade());
        Nsa.prtc[i].setId(Nsa.prtc[j].getId());
        Nsa.prtc[i].setHabilidade(Nsa.prtc[j].getHabilidade());
        Nsa.prtc[i].setPassword(Nsa.prtc[j].getPassword());
        Nsa.prtc[i].setCargo(Nsa.prtc[j].getCargo());
        Nsa.prtc[i].setEmail(Nsa.prtc[j].getEmail());
        Nsa.prtc[i].setSexo(Nsa.prtc[j].getSexo());
        Nsa.prtc[i].setAnoIns(Nsa.prtc[j].getAnoIns());
        Nsa.prtc[i].setAnoTerm(Nsa.prtc[j].getAnoTerm());
        Nsa.prtc[i].setPontos(Nsa.prtc[j].getPontos());
        Nsa.prtc[i].setSituation(Nsa.prtc[j].getSituation());
 }
Nsa.key--;
Nsa.keyx=Nsa.key;
JOptionPane.showMessageDialog(null,"exclusão com sucesso!");



}
 




//imprimir prtc p/ teste    
    public void ids(){
    int i = 0;
   System.out.println("\n");
for(;i<Nsa.key;i++)
   System.out.println("PARTICIPANTE:"+Nsa.prtc[i].getId());

    }
    
    //imprimir
 public void imp(){

    System.out.println("ID:"+Nsa.prtc[j].getId());
    System.out.println("NOME:"+Nsa.prtc[j].getNome());
    System.out.println("PASSWORD:"+Nsa.prtc[j].getPassword());
    System.out.println("IDADE:"+Nsa.prtc[j].getIdade());
    System.out.println("HABILIDADE:"+Nsa.prtc[j].getHabilidade());
    System.out.println("CARGO:"+Nsa.prtc[j].getCargo());
    System.out.println("EMAIL:"+Nsa.prtc[j].getEmail());
    System.out.println("SEXO:"+Nsa.prtc[j].getSexo());
    System.out.println("AnoInsc:"+Nsa.prtc[j].getAnoIns());
    j++;
     }
       
   

    //chk prtc p/ login
 public void chk(String id,String pass){
        DadosCadastrais Dads=new DadosCadastrais();
 
        for(int i =0;i<Nsa.key;i++){
        if(Nsa.prtc[i].getId().equals(id) && Nsa.prtc[i].getPassword().equals(pass)){
      Dads.setVisible(true);
     Dads.setLabel(i);
      JOptionPane.showMessageDialog(null,"Bem-vindo "+Nsa.prtc[i].getNome());

break;
        }
       
        }

         }




}



    
