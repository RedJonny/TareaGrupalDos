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

}

