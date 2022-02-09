# LABORATORIO No.03

## Casos de Equivalencia
1. DEAD:\
    isAlive = False

2. UNDERAGE:\
    getAge < 18

3. INVALID_AGE:\
    getAge < 0 AND getAge > 120

4. DUPLICATED:\
    person01.getId = person02.getId

5. VALID:\
    Not DEAD, Not UNDERAGE, Not INVALID_AGE, Not DUPLICATED

# DESCUENTO DE TARIFAS

## Diseño de Pruebas
1. Deberia arrojar la excepcion  `ExcepcionParametrosInvalidos` cuando:
    * `diasAtelacion < 0`
    * `edad <= 0 OR edad >= 120`

2. Los casos son:
    * Clase de Equivalencia: `diasAtelacion < 0`\
      Resultado: Incorrecto
    
    * Clase de Equivalencia: `edad <= 0 OR edad >= 120`\
      Resultado: Incorrecto

    * Clase de Equivalencia: `edad > 0 OR edad < 120`\
      Resultado: Correcto

    * Clase de Equivalencia: `diasAtelacion >= 0`\
      Resultado: Correcto

3. Los casos son:
    * Numero: -2\
      Clase de Equivalencia: Dias de antelacion\
      Resultado: Incorrecto
    
    * Numero: -10\
      Clase de Equivalencia: Edad\
      Resultado: Incorrecto

    * Numero: 50\
      Clase de Equivalencia: Edad\
      Resultado: Correcto

    * Numero: 6\
      Clase de Equivalencia: Dias de antelacion\
      Resultado: Correcto

4. Las condiciones limite o de frontera son:
    * Dias de Antelacion: `diasAtelacion < 0`
    * Edad: `edad <= 0 OR edad >= 120`

5. Los casos son:
    * `diasAntelacion = -2`
    * `diasAntelacion = 0`
    * `diasAntelacion = 35`
    * `edad = -10`
    * `edad = 50`
    * `edad = 1000`

## Implementacion de Pruebas
Para las pruebas de:
```java
public void validateDiasAntelacionErroneo(){...}
public void validateEdadErronea01(){...}
public void validateEdadErronea02(){...}
```
Los resultados marcan un error al ejecutar las pruebas ya que el codigo no esta implementado para corregir estos fallos en el momento que se le ingresan parametros incorrectos a los que deberian ser ingresados normalmente. Por lo tanto podemos concluir que el codigo presenta fallas y debera ser corregido a futuro.
