import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class JonathanSacoto {
    public static void jsSC1(){
        System.out.println("jsSC1");
        String simbolo1 = "+";
        String simbolo2 = "-";

        for (int i = 0; i < 4; i++) {
            System.out.print(simbolo1 + " " + simbolo2 + " ");
        }
        System.out.println("");
    }
    public static void jsSC2(){
        System.out.println("jsSC2");
        String simbolo = "+";
        int num1 = 1;
        int num2 = 1;
        int siguiente;
        String serieActual = "";

        for (int i = 0; i < num1; i++) {
            serieActual += simbolo;
        }
        System.out.print(serieActual + " ");

        serieActual = "";
        for (int i = 0; i < num2; i++) {
            serieActual += simbolo;
        }
        System.out.print(serieActual + " "); 

        for (int i = 0; i < 5; i++) {
            siguiente = num1 + num2;
            serieActual = "";
            for (int j = 0; j < siguiente; j++) {
                serieActual += simbolo;
            }
            System.out.print(serieActual + " ");
            num1 = num2;
            num2 = siguiente;
        }
        System.out.println(" ");
    }   
    public static void jsSC3(){
        System.out.println("jsSC3");
        String resultado = "+ ";
        System.out.print(resultado);

        for (int i = 0; i < 6; i++) {
            resultado = resultado + "++";
            System.out.print(resultado);
        }
        System.out.println(" ");
    }
    public static void jsSC4(){
        System.out.println("jsSC4");
        String serie = "+ - * /";
        for(int i = 0; i < 5; i++){
            System.out.print(serie + " ");
        }
        System.out.println(" ");
    }
    public static void jsSC5(){
        System.out.println("jsSC5");
        String serie = "\\ | / - |";
        for(int i = 0; i < 10; i++){
            System.out.print(serie + " ");
        }
        System.out.println(" ");
    }
    public static void jsSC6(){
        System.out.println("jsSC6");
        String resultado = "";
        char letra = 'a';

        for (int i = 0; i < 22; i++) {
            resultado += letra + " ";
            letra++;
        }

        System.out.println(resultado);
    }
    public static void jsSC7(){
        System.out.println("jsSC7");
        String resultado = "";
        char letra = 'a';
        boolean sumar = true;

        resultado += letra;
        letra += 2;

        for (int i = 1; i < 13; i++) {
            if (sumar) {
                resultado += "+";
            } else {
                resultado += "-";
            }
            resultado += letra;
            letra += 2;
            sumar = !sumar;
        }

        System.out.println(resultado);
    }
    public static void jsSC8(){
        System.out.println("jsSC8");
        char[] letras = new char[10];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) ('a' + i);
        }

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < 2 * i + 2; j++) {
                System.out.print(letras[i]);
            }
            System.out.print(" ");
        }
        System.out.println(" ");

    }
    public static void jsSC9(){
        System.out.println("jsSC9");
        char[] letras = new char[10];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) ('a' + i);
        }

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(letras[i]);
            }
            System.out.print(" ");
        }
        System.out.println(" ");

    }
    public static void jsSC10(){
        System.out.println("jsSC10");
        char[] letras = new char[5];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) ('a' + i);
        }

        int repeticiones = 0;
        int anterior;
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(letras[i]);
            }
            System.out.print(" ");
            anterior = repeticiones;
            repeticiones += i + 1;
        }
    }
    public static void jsSN1(){
        System.out.println("jsSN1");
        String tamano = "0";
        String caracter = "1";
        System.out.print(tamano + " " + caracter + " " + caracter + " ");
        for(int i = 0; i < 10; i++){
            String temp = caracter;
            caracter = tamano + caracter;
            System.out.print(caracter.length() + " ");
            tamano = temp;
        }
        System.out.println(" ");
    }
    public static void jsSN2(){
        System.out.println("jsSN2");
        for(int i = 1; i < 10; i++){
            if(i % 2 == 0){
                System.out.print("0 ");
            }else{
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
    public static void jsSN3() {
        System.out.println("jsSN3");
        String numeradorAnterior = "0";
        String numerador = "1";
        String denominador = "1";
        System.out.print(numeradorAnterior + "/" + denominador + " " + numerador + "/" + denominador + " ");
        denominador = "3";
        System.out.print(numerador + "/" + denominador + " ");
    
        for (int i = 0; i < 10; i++) {
            String temp = numerador;
            numerador = numeradorAnterior + numerador;
            numeradorAnterior = temp;
            System.out.print(numerador.length());
            denominador = Integer.toString(Integer.parseInt(denominador) + 2);
            System.out.print("/" + denominador + " ");
        }
        System.out.println(" ");
    }
    public static void jsSN4(){
        System.out.println("jsSN4");
        String numeradorAnterior = "0";
        String numerador = "1";
        String denominador = "2";
        System.out.print(numeradorAnterior + "/" + denominador + " ");
        denominador = "4";
        System.out.print(numerador + "/" + denominador + " ");
        denominador = "6";
        System.out.print(numerador + "/" + denominador + " ");
    
        for (int i = 0; i < 10; i++) {
            String temp = numerador;
            numerador = numeradorAnterior + numerador;
            numeradorAnterior = temp;
            System.out.print(numerador.length());
            denominador = Integer.toString(Integer.parseInt(denominador) + 2);
            System.out.print("/" + denominador + " ");
        }
        System.out.println(" ");
    }
    public static void jsSN5(){
        System.out.println("jsSN5");
        String a = "2";
        String b = "3";

        System.out.print(a + " " + b + " ");

        for(int i = 0; i < 10; i++){
            b = Integer.toString(Integer.parseInt(b) + 2);
            System.out.print(b + " ");
        }
        System.out.println(" ");
    }
    public static void jsSN6() {
        System.out.println("jsSN6");

        String a = "1";

        for(int i = 1; i < 11; i++){
            int operacion = i * i;
            a = Integer.toString(operacion);
            System.out.print(a + " ");
        }
        System.out.println(" ");
    }
    public static void jsSN7(){
        System.out.println("jsSN7");
        String a = "1";

        System.out.print(a + " ");

        for(int i = 1; i < 10; i++){
            a = Integer.toString(Integer.parseInt(a) + 3);
            System.out.print(a + " ");
        }
        System.out.println(" ");
    }    
    public static void jsSN8(){
        System.out.println("jsSN8");
        String a = "3";

        System.out.print(a + " ");

        for(int i = 1; i < 10; i++){
            a = Integer.toString(Integer.parseInt(a) + 5);
            System.out.print(a + " ");
        }
        System.out.println(" ");
    }
    public static void jsSN9(){
        System.out.println("jsSN9");
        String a = "2";

        System.out.print(a + " ");

        for(int i = 1; i < 10; i++){
            a = Integer.toString(Integer.parseInt(a) * 2);
            System.out.print(a + " ");
        }
        System.out.println(" ");
    } 
    public static void jsSN10(){
        System.out.println("jsSN10");
        String a = "3";

        System.out.print(a + " ");

        for(int i = 1; i < 10; i++){
            a = Integer.toString(Integer.parseInt(a) * 3);
            System.out.print(a + " ");
        }
        System.out.println(" ");
    }   
    public static void jsSN11(){
        
        System.out.println("jsSN11");
        String a = "2";
        String b = "4";
        String suma = a;
        System.out.print(a + " ");

        for(int i = 0; i < 10; i++){
            suma = Integer.toString(Integer.parseInt(suma) + Integer.parseInt(b));
            System.out.print(suma + " ");
            b = Integer.toString(Integer.parseInt(b) + 2);
        }
        System.out.println(" ");
    } 
    public static void jsFN1(){
        System.out.println("jsFN1");
        int tamano = 5;

        for (int i = 0; i < tamano; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < tamano - 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < tamano - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }

        for (int i = 0; i < tamano; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }
    public static void jsFN5() {

        System.out.println("jsFN5");
        int numAsteriscos = 9;
        int espacios = 0;

        while (numAsteriscos >= 1) {
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < numAsteriscos; i++) {
                System.out.print("* ");
            }
            System.out.println();

            numAsteriscos -= 2;
            espacios++;
        }
        System.out.println(" ");
    }
    public static void jsFN13(){
        System.out.println("jsFN13");
        int numLineas = 5;

        for (int i = 1; i <= numLineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(" ");
    }
    public void SerieCaracteres6 (){
        System.out.println("Serie Caracteres 6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indique que palabra desea invertir: ");
        String frase = scanner.nextLine();
        String fraseMayuscula = frase.toUpperCase();
        String fraseInvertida = new StringBuilder(fraseMayuscula).reverse().toString();
        System.out.println("Frase invertida:    " + fraseInvertida);

        scanner.close();
    }
    public void SerieCaracteres8(){
        System.out.println("Serie Caracteres 8");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] palabras = {"delira", "Ballena", "Alondra", "España", "Enrique"};
        String[] anagramas = {"lidera", "llenaba", "Ladrona", "apañes", "quieren"};

        int indiceAleatorio = random.nextInt(palabras.length);
        String palabraAleatoria = palabras[indiceAleatorio];
        String anagramaCorrecto = anagramas[indiceAleatorio];

        System.out.println("Adivina el anagrama de la palabra: " + palabraAleatoria);
        int intentos = 0;
        boolean acertado = false;

        while (intentos < 3 && !acertado) {
            System.out.print("Ingresa el anagrama: ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase(anagramaCorrecto)) {
                System.out.println("¡Correcto! El anagrama de " + palabraAleatoria + " es " + anagramaCorrecto);
                acertado = true;
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Incorrecto. Intenta de nuevo.");
                }
            }
        }

        if (!acertado) {
            System.out.println("Lo siento, has fallado. El anagrama correcto de " + palabraAleatoria + " es " + anagramaCorrecto);
        }

        scanner.close();
    }

    public void SeriesArrays5 () throws InterruptedException{
        System.out.println("Serie Arrays 5");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine().replaceAll("\\s+", "");

        int size = nombreCompleto.length();
        char[][] matriz = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriz[i][j] = ' ';
            }
        }

        ArrayList<int[]> posiciones = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                posiciones.add(new int[]{i, j});
            }
        }

        Collections.shuffle(posiciones);

        for (char letra : nombreCompleto.toCharArray()) {
            int[] pos = posiciones.remove(0);
            if (matriz[pos[0]][pos[1]] == ' ') {
                matriz[pos[0]][pos[1]] = letra;
            } else {
                matriz[pos[0]][pos[1]] = '*';
            }
            imprimirMatriz(matriz);
            TimeUnit.SECONDS.sleep(1);
        }

        scanner.close();
    }

    private static void imprimirMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void SeriesLoading4(){
        System.out.println("Serie Loading 4");
        final int MAX = 100;
        final int DELAY = 100;
        String[] frames = {"o0o", "0o0", "oo0", "o0o"};

        for (int i = 0; i <= MAX; i++) {
            int frameIndex = i % frames.length;
            String frame = frames[frameIndex];
            System.out.printf("\r%s %d%%", frame, i);

            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Finalizar con el 100%
        System.out.printf("\r%s %d%%\n", "o0o", MAX);
    }
    
    public void SeriesLoading5(){
        System.out.println("Serie Loading 5");
        int totalSteps = 100;

        for (int step = 0; step <= totalSteps; step++) {
            displayProgressBar(step, totalSteps);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }

        System.out.println();
    }

    public static void displayProgressBar(int progress, int total) {
        int length = 20;
        int completedLength = (int) (length * ((double) progress / total));
        StringBuilder bar = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (i < completedLength - 1) {
                bar.append("=");
            } else if (i == completedLength - 1 && progress != total) {
                bar.append(">");
            } else {
                bar.append(" ");
            }
        }

        int percentage = (int) (100 * ((double) progress / total));
        System.out.print("\r[" + bar + "] " + percentage + "%");
    }

    public void SeriesLoading10(){
        System.out.println("Serie Loading 10");
        Random random = new Random();
        int totalSize = random.nextInt(91) + 10;
        int downloadedSize = 0;
        int stepSize = 5;

        System.out.printf("Downloading ArchivoYarl-win_amd64.whl (%d kB)%n", totalSize);

        while (downloadedSize < totalSize) {
            downloadedSize += stepSize;
            if (downloadedSize > totalSize) {
                downloadedSize = totalSize;
            }
            displayProgressBar2(downloadedSize, totalSize);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
    }

    public static void displayProgressBar2(int progress, int total) {
        int length = 30;
        int completedLength = (int) (length * ((double) progress / total));
        StringBuilder bar = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (i < completedLength) {
                bar.append("-");
            } else {
                bar.append(" ");
            }
        }

        int percentage = (int) (100 * ((double) progress / total));
        String progressBar = String.format("\r[\033[32m%s\033[0m] %.1f / %.1f kB",
                bar.toString(), (double) progress, (double) total);

        System.out.print(progressBar);
    }

    public void SeriesRecursivas4(){
        System.out.println("Serie Recursivas 4");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base (a): ");
        int base = scanner.nextInt();

        System.out.print("Introduce el exponente (b): ");
        int exponente = scanner.nextInt();

        long resultado = potencia(base, exponente);
        System.out.printf("%d^%d = %d%n", base, exponente, resultado);

        scanner.close();
    }

    public static long potencia(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * potencia(a, b - 1);
    }
    
    public void SeriesRecursivas5(){
        System.out.println("Serie Recursivas 5");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número (n): ");
        int n = scanner.nextInt();

        conteoProgresivoHasta(n, 1);

        scanner.close();
    }

    public static void conteoProgresivoHasta(int n, int actual) {
        System.out.println(actual);
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (actual == n) {
            return;
        }

        conteoProgresivoHasta(n, actual + 1);
    }

}

