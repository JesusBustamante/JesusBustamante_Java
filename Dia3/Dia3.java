package dia3;

import java.util.Scanner;

public class Dia3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE PROGRAMAS ---");
            System.out.println("1. Imprimir números naturales del 1 al n");
            System.out.println("2. Imprimir números naturales en orden inverso");
            System.out.println("3. Imprimir tablas de multiplicar");
            System.out.println("4. Imprimir tablas de multiplicar en orden inverso");
            System.out.println("5. Imprimir alfabeto");
            System.out.println("6. Imprimir números pares e impares");
            System.out.println("7. Suma de números naturales entre 1 y n");
            System.out.println("8. Suma de números pares entre 1 y n");
            System.out.println("9. Suma de números impares entre 1 y n");
            System.out.println("10. Imprimir valores ASCII");
            System.out.println("11. Calcular factorial de un número");
            System.out.println("12. Calcular exponente de un número");
            System.out.println("13. Invertir dígitos de un número");
            System.out.println("14. Sumar dígitos de un número");
            System.out.println("15. Verificar si un número es primo");
            System.out.println("16. Calcular MCD de dos números");
            System.out.println("17. Contar números positivos, negativos y ceros");
            System.out.println("18. Encontrar el número más grande y más pequeño");
            System.out.println("19. Números divisibles por 9 entre 100 y 200");
            System.out.println("20. Verificar si un número es fuerte");
            System.out.println("21. Convertir hexadecimal a decimal");
            System.out.println("22. Convertir hexadecimal a octal");
            System.out.println("23. Convertir hexadecimal a binario");
            System.out.println("24. Convertir decimal a hexadecimal");
            System.out.println("25. Convertir decimal a octal");
            System.out.println("26. Convertir decimal a binario");
            System.out.println("27. Convertir binario a octal");
            System.out.println("28. Convertir binario a decimal");
            System.out.println("29. Convertir binario a hexadecimal");
            System.out.println("30. Convertir octal a binario");
            System.out.println("31. Convertir octal a decimal");
            System.out.println("32. Convertir octal a hexadecimal");
            System.out.println("33. Complemento a 1 de un número binario");
            System.out.println("34. Complemento a 2 de un número binario");
            System.out.println("35. Generar secuencia de Fibonacci");
            System.out.println("36. Imprimir números fuertes del 1 al 100000");
            System.out.println("37. Imprimir números perfectos del 1 al 10000");
            System.out.println("38. Verificar si un número es perfecto");
            System.out.println("39. Imprimir números de Armstrong del 1 al 1000");
            System.out.println("40. Verificar si un número es de Armstrong");
            System.out.println("41. Imprimir factores primos de un número");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    nAnverso();
                    break;
                case 2:
                    nReverso();
                    break;
                case 3:
                    tablasMultiplicar();
                    break;
                case 4:
                    tablasMultiplicarInverso();
                    break;
                case 5:
                    alfabeto();
                    break;
                case 6:
                    parImpar();
                    break;
                case 7:
                    sumaNatural();
                    break;
                case 8:
                    sumaPar();
                    break;
                case 9:
                    sumaImpar();
                    break;
                case 10:
                    ascii();
                    break;
                case 11:
                    factorial();
                    break;
                case 12:
                    exponente();
                    break;
                case 13:
                    invertirDigito();
                    break;
                case 14:
                    sumarDigito();
                    break;
                case 15:
                    nPrimo();
                    break;
                case 16:
                    mcd();
                    break;
                case 17:
                    numerosInfinitos();
                    break;
                case 18:
                    lowerN();
                    break;
                case 19:
                    divisible9();
                    break;
                case 20:
                    numeroFuerte();
                    break;
                case 21:
                    hexadecimalADecimal();
                    break;
                case 22:
                    hexadecimalAOctal();
                    break;
                case 23:
                    hexadecimalABinario();
                    break;
                case 24:
                    decimalAHexadecimal();
                    break;
                case 25:
                    decimalAOctal();
                    break;
                case 26:
                    decimalABinario();
                    break;
                case 27:
                    binarioAOctal();
                    break;
                case 28:
                    binarioADecimal();
                    break;
                case 29:
                    binarioAHexadecimal();
                    break;
                case 30:
                    octalABinario();
                    break;
                case 31:
                    octalADecimal();
                    break;
                case 32:
                    octalAHexadecimal();
                    break;
                case 33:
                    complementoA1();
                    break;
                case 34:
                    complementoA2();
                    break;
                case 35:
                    fibonacci();
                    break;
                case 36:
                    nFuerteMil();
                    break;
                case 37:
                    imprimirNumerosPerfectos();
                    break;
                case 38:
                    verificarNumeroPerfecto();
                    break;
                case 39:
                    imprimirNumerosArmstrong();
                    break;
                case 40:
                    verificarNumeroArmstrong();
                    break;
                case 41:
                    imprimirFactoresPrimos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close(); // Cerrar el Scanner al finalizar
        
    }
    
    static void nAnverso() {
        // Escribe un programa para imprimir todos los números naturales del 1 al n.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    
    static void nReverso() {
        // Escribe un programa para imprimir todos los números naturales en orden inverso.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        for(int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
    
    static void tablasMultiplicar() {
        // Escribe un programa para imprimir tablas de multiplicar.
        System.out.println("Tablas de multiplicar");
        System.out.println("----------------------");
        
        for(int i = 1; i <= 10; i++) {
            
            System.out.println("\nTabla del " + i);
            System.out.println("-------------");
            for(int a = 1; a <= 10; a++) {
                int result;
                result = i*a;

                System.out.println(i + " x " + a + " = " + result);
            }
        }
    }
    
    static void tablasMultiplicarInverso() {
        // Escribe un programa para imprimir tablas de multiplicar en orden inverso.
        System.out.println("Tablas de multiplicar");
        System.out.println("----------------------");
        
        for(int i = 10; i >= 1; i--) {
            
            System.out.println("\nTabla del " + i);
            System.out.println("-------------");
            for(int a = 10; a >= 1; a--) {
                int result;
                result = i*a;

                System.out.println(i + " x " + a + " = " + result);
            }
        }
    }
    
    static void alfabeto() {
        // Escribe un programa para imprimir todas las letras del alfabeto de la 'a' a la 'z'. 
        System.out.println("ALFABETO");
        for(char letra ='a'; letra<='z'; letra++) {
            System.out.print(letra + " ");
        }
        System.out.println("\n----------------------------------------------------------");
        for(char letra ='Z'; letra>='A'; letra--) {
            System.out.print(letra + " ");
        }
    }
    
    static void parImpar() {
        // Escribe un programa para imprimir todos los números pares entre 1 y 100.
        
        System.out.println("Numeros Pares");
        for(int i = 1; i < 101; i++) {
            if(i %2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(" \n");
        
        System.out.println("Numeros Impares");
        for(int i = 1; i < 101; i++) {
            if(i %2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    static void sumaNatural() {
        // Escribe un programa para encontrar la suma de todos los números naturales entre 1 y n.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        int suma = 0;
        for(int i = 1; i <= n; i++) {
            suma += i;
            System.out.println(suma);
        }
    }
    
    static void sumaPar() {
        // Escribe un programa para encontrar la suma de todos los números pares entre 1 y n.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        int suma = 0;
        for(int i = 0; i <= n; i++) {
            if(i %2 == 0) {
                suma += i;
                System.out.println(suma);
            }  
        }
    }
    
    static void sumaImpar() {
        // Escribe un programa para encontrar la suma de todos los números pares entre 1 y n.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        int suma = 0;
        for(int i = 0; i <= n; i++) {
            if(i %2 != 0) {
                suma += i;
                System.out.println(suma);
            }  
        }
    }
    
    static void ascii() {
        // Escribe un programa para imprimir los valores ASCII.
        System.out.println("Caracteres ASCII del 0 al 255:");
        
        for (int i = 0; i <= 255; i++) {
            System.out.println("ASCII " + i + " = " + (char) i);
        }
    }
    
    static void factorial() {
        // Escribe un programa para encontrar el factorial de cualquier número.
        System.out.print("Ingresa un número entero: ");
        
        int n;
        n = sc.nextInt();
        int multiplicacion;
        multiplicacion = 1;
        
       for(int i = n; i >= 1; i--) {
           multiplicacion *= i;
           
       } 
        System.out.println("El factorial de " + n + " = " + multiplicacion);
    }
    
    static void exponente() {
        // Escribe un programa para calcular el valor de un número elevado a la potencia de otro.
        System.out.print("Ingrese un número entero como base: ");
        int b;
        b = sc.nextInt();
        
        System.out.print("Ingrese un número entero como exponente: ");
        int e;
        e = sc.nextInt();
        
        int result;
        result = 1;
        
        for(int i = 0; i < e; i++) {
            result *= b;
        }
        
        System.out.println(b + " con exponente " + e + " = " + result);
    }
    
    static void invertirDigito() {
        // Escribe un programa para invertir los dígitos de un número dado.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        int nReverso;
        nReverso = 0;
        
        while(n != 0) {
            nReverso = nReverso * 10 + n % 10;
            n /= 10;
        }
        System.out.print("Dígitos invertidos: " + nReverso);
    }
    
    static void sumarDigito() {
       
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        int suma = 0;
        
        while(n != 0) {
            int digito = n % 10;
            suma += digito;
            n /= 10;
        }
        
        System.out.println("La suma de los dígitos es = " + suma);
    }
    
    static void nPrimo() {
        // Escribe un programa para verificar si un número dado es primo o no.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }
    }
    
    static void mcd() {
        // Escribe un programa para calcular el MCD (Máximo Común Divisor) de dos números dados.
        System.out.print("Ingresa un número entero: ");
        int n1;
        n1 = sc.nextInt();
        
        System.out.print("Ingresa un número entero: ");
        int n2;
        n2 = sc.nextInt();
        
        while(n2 != 0) {
            int residuo = n1 % n2;
            n1 = n2;
            n2 = residuo;
            
        }
        System.out.println("Su MCD es = " + n1);
    }
    
    static void numerosInfinitos() {
        // Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre la
        // cantidad de números positivos, negativos y ceros ingresados.
        
        int negativos = 0;
        int positivos = 0;
        int cero = 0;
        
        char continuar;
        
        do {
            System.out.print("Ingresa un número: ");
            int n = sc.nextInt();
            
            if(n > 0) {
                positivos ++;
            } else if(n < 0) {
                negativos++;
            } else {
                cero++;
            }
            
            System.out.println("Deseas ingresar otro número(s/n): ");
            continuar = sc.next().charAt(0);
        }   while (continuar == 's' || continuar == 'S');
            System.out.println("Cantidad de números positivos: " + positivos);
            System.out.println("Cantidad de números negativos: " + negativos);
            System.out.println("Cantidad de ceros: " + cero);
    }
    
    static void lowerN() {
        // Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre el
        // número más grande y el más pequeño ingresado.
        
        char continuar;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        do {
            System.out.print("Ingresa un número: ");
            int n = sc.nextInt();
            
            if (n > maxi) {
                maxi = n;
            }
            if (n < mini) {
                mini = n;
            }
            
            System.out.println("Deseas ingresar otro número(s/n): ");
            continuar = sc.next().charAt(0);
        }   while (continuar == 's' || continuar == 'S');
            System.out.println("El número más grande es: " + maxi);
            System.out.println("El número más pequeño es: " + mini);
            
    }

    static void divisible9() {
        // Escribe un programa para encontrar los números y la suma de todos los enteros entre 100 y 200 que sean
        // divisibles por 9.
        int suma = 0;

        for(int i = 100; i <= 200; i++) {
            if(i % 9 == 0) {
                System.out.print(i + " + ");
                suma += i;
            }
        }

        System.out.print("El resultado es: " + suma);
    }

    static void numeroFuerte() {
        System.out.print("Ingresa un número entero: ");
        int n = sc.nextInt();
        int sumaFactoriales = 0, temp = n;

        while (temp > 0) {
            int digito = temp % 10;
            int factorial = 1;

            for (int i = 1; i <= digito; i++) {
                factorial *= i;
            }

            sumaFactoriales += factorial;
            temp /= 10;
        }

        if (sumaFactoriales == n) {
            System.out.println(n + " es un número fuerte.");
        } else {
            System.out.println(n + " no es un número fuerte.");
        }
    }

    static void hexadecimalADecimal() {
        System.out.print("Ingresa un número hexadecimal: ");
        String hexadecimal = sc.next();
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("El valor decimal es: " + decimal);
    }

    static void hexadecimalAOctal() {
        System.out.print("Ingresa un número hexadecimal: ");
        String hexadecimal = sc.next();
        int decimal = Integer.parseInt(hexadecimal, 16);
        String octal = Integer.toOctalString(decimal);
        System.out.println("El valor octal es: " + octal);
    }

    static void hexadecimalABinario() {
        System.out.print("Ingresa un número hexadecimal: ");
        String hexadecimal = sc.next();
        int decimal = Integer.parseInt(hexadecimal, 16);
        String binario = Integer.toBinaryString(decimal);
        System.out.println("El valor binario es: " + binario);
    }

    static void decimalAHexadecimal() {
        System.out.print("Ingresa un número decimal: ");
        int decimal = sc.nextInt();
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println("El valor hexadecimal es: " + hexadecimal);
    }

    static void decimalAOctal() {
        System.out.print("Ingresa un número decimal: ");
        int decimal = sc.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("El valor octal es: " + octal);
    }

    static void decimalABinario() {
        System.out.print("Ingresa un número decimal: ");
        int decimal = sc.nextInt();
        String binario = Integer.toBinaryString(decimal);
        System.out.println("El valor binario es: " + binario);
    }

    static void binarioAOctal() {
        System.out.print("Ingresa un número binario: ");
        String binario = sc.next();
        int decimal = Integer.parseInt(binario, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("El valor octal es: " + octal);
    }
    
    static void binarioADecimal() {

        System.out.print("Introduce un número binario: ");
        String binario = sc.next();

        int decimal = Integer.parseInt(binario, 2);
        System.out.println("El número decimal es: " + decimal);
    }

    static void binarioAHexadecimal() {

        System.out.print("Introduce un número binario: ");
        String binario = sc.next();

        int decimal = Integer.parseInt(binario, 2);
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println("El número hexadecimal es: " + hexadecimal);
    }

    static void octalABinario() {

        System.out.print("Introduce un número octal: ");
        String octal = sc.next();

        int decimal = Integer.parseInt(octal, 8);
        String binario = Integer.toBinaryString(decimal);
        System.out.println("El número binario es: " + binario);
    }

    static void octalADecimal() {

        System.out.print("Introduce un número octal: ");
        String octal = sc.next();

        int decimal = Integer.parseInt(octal, 8);
        System.out.println("El número decimal es: " + decimal);
    }

    static void octalAHexadecimal() {

        System.out.print("Introduce un número octal: ");
        String octal = sc.next();

        int decimal = Integer.parseInt(octal, 8);
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println("El número hexadecimal es: " + hexadecimal);
    }

    static void complementoA1() {

        System.out.print("Introduce un número binario: ");
        String binario = sc.next();

        StringBuilder complemento = new StringBuilder();
        for (char c : binario.toCharArray()) {
            complemento.append((c == '0') ? '1' : '0');
        }
        System.out.println("El complemento a 1 es: " + complemento.toString());
    }

    static void complementoA2() {

        System.out.print("Introduce un número binario: ");
        String binario = sc.next();

        StringBuilder complemento1 = new StringBuilder();
        for (char c : binario.toCharArray()) {
            complemento1.append((c == '0') ? '1' : '0');
        }

        String complemento2 = Integer.toBinaryString(Integer.parseInt(complemento1.toString(), 2) + 1);
        System.out.println("El complemento a 2 es: " + complemento2);
    }
    
    static void fibonacci() {
        
        System.out.print("Por favor, ingrese un valor entero (representando hasta qué término de la secuencia se generará: ");
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;

        while(a < n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }      
    }
    
    static void nFuerteMil() {
        System.out.println("Números Fuertes del 1 al 100000:");

        for (int i = 1; i <= 100000; i++) {
            int sumaFactoriales = 0;
            int original = i;
            int n = i;

            while (n != 0) {
                int digito = n % 10;

                // Calcular el factorial del dígito
                int fact = 1;
                for (int j = 1; j <= digito; j++) {
                    fact *= j;
                }

                sumaFactoriales += fact;
                n /= 10;
            }

            if (sumaFactoriales == original) {
                System.out.println(original);
            }
        }
    }
    
    static void imprimirNumerosPerfectos() {
        System.out.println("Números Perfectos entre 1 y 10000:");
        for (int i = 1; i <= 10000; i++) {
            if (esNumeroPerfecto(i)) {
                System.out.println(i);
            }
        }
    }

    static void verificarNumeroPerfecto() {

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }
    
    static void imprimirNumerosArmstrong() {
        System.out.println("Números de Armstrong entre 1 y 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (esNumeroArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static void verificarNumeroArmstrong() {

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (esNumeroArmstrong(numero)) {
            System.out.println(numero + " es un número de Armstrong.");
        } else {
            System.out.println(numero + " no es un número de Armstrong.");
        }
    }

    static void imprimirFactoresPrimos() {

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        System.out.println("Factores primos de " + numero + ":");
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.println(i);
                numero /= i;
            }
        }
    }
    
    static boolean esNumeroPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }

    static boolean esNumeroArmstrong(int numero) {
        int original = numero;
        int suma = 0;
        int digitos = String.valueOf(numero).length();

        while (numero != 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, digitos);
            numero /= 10;
        }

        return suma == original;
    }
}
