Scanner teclat = new Scanner(System.in);
        System.out.print("Escribe el primer valor que quieres sumar: ");
        int valor1 = teclat.nextInt();
        System.out.print("Escribe el segundo valor que quieres sumar: ");
        int valor2 = teclat.nextInt();
        int resultado = valor1 + valor2;
        System.out.println(valor1 +" + " + valor2 + " es igual a: " + resultado)
