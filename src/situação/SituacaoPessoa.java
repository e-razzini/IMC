
package situação;

import imcanalize.ImcCalculos;
import modelo.Individuo;


public class SituacaoPessoa {
Individuo ind = new Individuo();
    ImcCalculos ic = new ImcCalculos(ind);
    
    String situa;
    double resultado = ic.calculo();

}
