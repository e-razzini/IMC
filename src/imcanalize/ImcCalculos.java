
package imcanalize;

import modelo.Individuo;


public class ImcCalculos {
private Individuo ind;

    public ImcCalculos(Individuo ind) {
        this.ind = ind;
    }
    
    public double calculo(){

    double altura = this.ind.getAltura();
    double peso = this.ind.getPeso();
    double resultaltura= altura* altura;
    double resultado = peso  / resultaltura;   
    return resultado;
    
   
      
            
    }
}
