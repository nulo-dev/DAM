Scanner teclat = new Scanner(System.in);
        System.out.print("Escribe el valor a: ");
        int a = teclat.nextInt();
        System.out.print("Escribe el valor b: ");
        int b = teclat.nextInt();
        System.out.print("Escribe el valor c: ");
        int c = teclat.nextInt();
        double resultado = ((1/(a+b)) - c);
        System.out.println("El resultado es: " + resultado);
