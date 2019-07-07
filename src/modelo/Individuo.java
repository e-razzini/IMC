
package modelo;

public class Individuo {

private double altura;
private double peso;
private Double resultado;
private String situacao;


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
        return this.resultado ;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
        
    }

    public String getSituacao() {
        return this. situacao;
    }

    public void  setSituacao(double resultado) {
        
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
     this.situacao=situacao;
           
}    
}