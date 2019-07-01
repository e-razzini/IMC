
package situação;

import imcanalize.ImcCalculos;
import modelo.Individuo;


public class SituacaoPessoa {
Individuo ind = new Individuo();
ImcCalculos ic = new ImcCalculos(ind);

double resultado;


    public double getResultado() {
    return this.resultado;
    }

    public String setResultado(double resultado) {
         String situa ="";
          if( resultado >= 18.5 &  resultado <=24.9)    
            {
              situa = "Peso normal.";

            }else if( resultado >= 25 &  resultado <=29.9)
            {
              situa ="Sobrepeso.";
            }else if(resultado >= 30 & resultado <=34.9)
            {     
             situa ="Obesidade grau um";
             
            }else if (resultado >=35 & resultado <=39.9)
            {
              situa ="Obesidade grau dois";
            } else if (resultado >=40)       
            {
              situa ="Obesidade grau Três"; 
            }
 
            return situa;     
    }

        
}
