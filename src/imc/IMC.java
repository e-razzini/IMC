
package imc;

import imcanalize.ImcCalculos;

import modelo.Individuo;
import situacao.SituacaoIndividuo;



public class IMC {

    public static void main(String[] args) {
    
    Individuo ind = new Individuo();
    ImcCalculos ic = new ImcCalculos(ind);
    SituacaoIndividuo si = new SituacaoIndividuo(ind);
    double resultado;
    resultado = ic.calculo();
    String Situacao="";     

    }
    
}
