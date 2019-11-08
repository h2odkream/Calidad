package com.exampledevco.unittest;

public class Calculadora {
    public String calcular(int numeroArabigo) {

            return construirRomano(numeroArabigo);

    }

    public String construirRomano(int numeroArabigo){

        if(numeroArabigo==5){
            return "A";
        }
        else if(numeroArabigo==6){
            return "I";
        }
        return "j";
    }
}

