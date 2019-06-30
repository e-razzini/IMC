
package imc;

import imcanalize.ImcCalculos;

import modelo.Individuo;


public class IMC {

    public static void main(String[] args) {
    
    Individuo ind = new Individuo();
    ImcCalculos ic = new ImcCalculos(ind);
    
    double resultado;
    resultado = ic.calculo();
         

    }
    
}
