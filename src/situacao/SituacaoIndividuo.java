
package situacao;

import imcanalize.ImcCalculos;
import modelo.Individuo;


public class SituacaoIndividuo {
    
  Individuo ind = new Individuo();
  ImcCalculos ic = new ImcCalculos(ind);   
    
   String situacao ="";
   double resultado = ic.calculo();
   
    public String getSituacao() {
        return this.situacao;
    }

    public void setSituacao(String situacao) {
       
        
            if( resultado >= 18.5 &  resultado <=24.9){    
            
              situacao ="Peso normal.";
            
            }else if( resultado >= 25 &  resultado <=29.9){
            
              situacao ="Sobrepeso.";
              
            }else if(resultado >= 30 & resultado <=34.9){
                
              situacao ="Obesidade grau um";
             
            }else if (resultado >=35 & resultado <=39.9){
            
             situacao ="Obesidade grau dois";
            } else if (resultado >=40) {      
            
               situacao ="Obesidade grau Três";
              

            }
    
       this.situacao = situacao;
    
}
}