# LABORATORIO No.03

## Casos de Equivalencia
1. DEAD:\ 
    isAlive = False 
    
    Al mostrar que una persona no está viva, nos debería dar error debido a que no puede ser registrada

2. UNDERAGE:\
    getAge < 18
    
    Solo las personas mayores de 18 años pueden registrarse

3. INVALID_AGE:\
    getAge < 0 AND getAge > 120
    
    Una edad logica de una persona debe ir entre 0 y 120 años

4. DUPLICATED:\
    person1.getId == person2.getId
    
    Dos personas no pueden tener el mismo Id

5. VALID:\
    Not DEAD, Not UNDERAGE, Not INVALID_AGE, Not DUPLICATED
    
    Si tiene estas condiciones, no es una persona valida para ser registrada

# DESCUENTO DE TARIFAS

## Diseño de Pruebas
1. Deberia arrojar la excepcion  `ExcepcionParametrosInvalidos` cuando:
    * `diasAtelacion < 0`
    * `edad <= 0 OR edad >= 120`

2. Los casos son:
    * Clase de Equivalencia: `diasAntelacion < 0`\
      Resultado debería ser incorrecto
    
    * Clase de Equivalencia: `edad <= 0 OR edad >= 120`\
      Resultado debería ser incorrecto

    * Clase de Equivalencia: `edad > 0 OR edad < 120`\
      Resultado debería ser correcto

    * Clase de Equivalencia: `diasAtelacion >= 0`\
      Resultado debería ser correcto

3. Los casos son:
    * Numero: -2\
      Clase de Equivalencia: Dias de antelacion\
      Resultado debería ser incorrecto
    
    * Numero: -10\
      Clase de Equivalencia: Edad\
      Resultado debería ser incorrecto

    * Numero: 50\
      Clase de Equivalencia: Edad\
      Resultado debería ser correcto

    * Numero: 6\
      Clase de Equivalencia: Dias de antelacion\
      Resultado debería ser correcto

4. Las condiciones limite o de frontera son:
    * Dias de Antelacion: `diasAntelacion < 0`
    * Edad: `edad <= 0 OR edad >= 120`

5. Los casos son:
    * `diasAntelacion = -20`
    * `diasAntelacion = 0`
    * `diasAntelacion = 40`
    * `edad = -15`
    * `edad = 51`
    * `edad = 15000`

## Implementacion de Pruebas
Para las pruebas de:
```java
public void validarDiasAntelacionError(){...}
public void validarEdadErronea1(){...}
public void validarEdadErronea2(){...}
```
Los resultados de estas 3 pruebas, son erroneos, debido a que el jar no está mostrando los errores cuando se ingresan datos invalidos, En estas 3 pruebas en especifico deberia dar error, pero al no reconocerlo, salen las 3 pruebas fallidas
