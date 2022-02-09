package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest{

    @Test
    public void validarDiasAntelacionError(){
        double tarifaBase = 90000; 
        int diasAntelacion = -3; 
        int edad = 19;

        double total_pagar = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertEquals("ExcepcionParametrosInvalidos",total_pagar);
    }

    @Test
    public void validarDiasAntelacionCorrecto1(){
        double tarifaBase = 545358; 
        int diasAntelacion = 0; 
        int edad = 20;
        double total = 545358.0;

        double total_pagar = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(total_pagar==total);
    }

    @Test
    public void validarDiasAntelacionCorrecto2(){
        double tarifaBase = 80000; 
        int diasAntelacion = 35; 
        int edad = 80;
        double total = 61600.0;

        double total_pagar = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(total_pagar==total);
    }

    @Test
    public void validarEdadCorrecta(){
        double tarifaBase = 100000; 
        int diasAntelacion = 21; 
        int edad = 49;
        double total = 85000.0;

        double total_pagar = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertTrue(total==total_pagar);
    }

    @Test
    public void validarEdadErronea1(){
        double tarifaBase = 95000; 
        int diasAntelacion = 0; 
        int edad = -15;

        double total_pagar = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertEquals("ExcepcionParametrosInvalidos",total_pagar);
    }

    @Test
    public void validarEdadErronea2(){
        double tarifaBase = 30000;
        int diasAntelacion = 0; 
        int edad = 80000;

        double total_pagar = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertEquals("ExcepcionParametrosInvalidos",total_pagar);
    }
}
