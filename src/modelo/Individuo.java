
package modelo;

public class Individuo {

private double altura;
private double peso;
private Double resultado;
private String situa;


    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this. peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
     
    }

    public Double getResultado() {
        return (this.peso /(this.altura *this.altura));
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
         this.setSitua();
    }

    public String getSitua() {
        return situa;
    }

   private void setSitua() {
        
       if( resultado >= 18.5 &  resultado <=24.9){    

situa ="Peso normal.";

}else if( resultado >= 25 &  resultado <=29.9){

situa ="Sobrepeso.";

}else if(resultado >= 30 & resultado <=34.9){

situa ="Obesidade grau um";

}else if (resultado >=35 & resultado <=39.9){

situa ="Obesidade grau dois";
} else if (resultado >=40) {      

situa ="Obesidade grau Três";

}
   
        
    }

   

    
}