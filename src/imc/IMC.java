
package imc;

import imcanalize.ImcCalculos;

import modelo.Individuo;
import situação.SituacaoPessoa;


public class IMC {

    public static void main(String[] args) {
    
    Individuo ind = new Individuo();
    ImcCalculos ic = new ImcCalculos(ind);
        SituacaoPessoa SituacaoPessoa = new SituacaoPessoa(ic);
    double resultado;
    resultado = ic.calculo();
         

    }
    
}
