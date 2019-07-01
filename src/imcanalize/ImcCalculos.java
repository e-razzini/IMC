
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
    
   
      
            if( resultado >= 18.5 &  resultado <=24.9)    
            {
             System.out.println("Peso normal.");
            }else if( resultado >= 25 &  resultado <=29.9)
            {
              System.out.println("Sobrepeso.");
            }else if(resultado >= 30 & resultado <=34.9)
            {     
             System.out.println("Obesidade grau um");
             
            }else if (resultado >=35 & resultado <=39.9)
            {
              System.out.println("Obesidade grau dois");
            } else if (resultado >=40)       
            {
              System.out.println("Obesidade grau Três"); 
            }
 
          return resultado;     
    }
}
