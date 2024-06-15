import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JonathanSacotoRetos2 {
    public void SerieCaracteres6 (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indique que palabra desea invertir: ");
        String frase = scanner.nextLine();
        String fraseMayuscula = frase.toUpperCase();
        String fraseInvertida = new StringBuilder(fraseMayuscula).reverse().toString();
        System.out.println("Frase invertida:    " + fraseInvertida);

        scanner.close();
    }
    public void SerieCaracteres8(){
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
