import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] ingredientes = {
                "Pan de hamburguesa", "Carne de ternera a la parrilla", "Pechuga de pollo a la parrilla",
                "Hamburguesa a base de plantas", "Lechuga", "Tomate", "Cebolla", "Pepinillos", "Queso Cheddar", "Queso Vegano",
                "Bacon", "Salsa barbacoa", "Ketchup", "Mostaza", "Mayonesa", "Jalapeños", "Salsa picante", "Cebolla caramelizada",
                "Pan vegano", "Aguacate", "Alioli vegano", "Pan de hamburguesa pequeño", "Doble carne de ternera a la parrilla",
                "Doble queso Cheddar", "Doble hamburguesa a base de plantas"};

        String[] menu = {"Menú Parrilla Ternera", "Menú Pollo Frito",  "Menú Jr Meal", "Menú Vegano", "Menú Ahorro"};
        double[] precioMenu = {8.50, 8.00, 9.00, 6.00, 5.50};

        String[] hamburguesas = {"Ternera", "Pollo", "Veganas", "Kid", "De ahorro"};

        String[][] hamburTernera = {
                {"Hamburguesa Parrilla clásica", ingredientes[0], ingredientes[1], ingredientes[4], ingredientes[5], ingredientes[6], ingredientes[7], ingredientes[8], ingredientes[12], ingredientes[13]},
                {"Hamburguesa Doble parrilla", ingredientes[0], ingredientes[22], ingredientes[23], ingredientes[4], ingredientes[5], ingredientes[6], ingredientes[7], ingredientes[12], ingredientes[13]},
                {"Hamburguesa Parrilla barbacoa", ingredientes[0], ingredientes[1], ingredientes[8], ingredientes[10], ingredientes[11], ingredientes[17]}
        };
        double[] precioHamburTernera = {6.50, 8.50, 5.50};

        String[][] hamburPollo = {
                {"Hamburguesa de Pollo clásico", ingredientes[0], ingredientes[2], ingredientes[4], ingredientes[5], ingredientes[6], ingredientes[14]},
                {"Hamburguesa de Pollo picante", ingredientes[0], ingredientes[2], ingredientes[4], ingredientes[5], ingredientes[8], ingredientes[15], ingredientes[16]},
                {"Hamburguesa de Pollo parrilla", ingredientes[0], ingredientes[2], ingredientes[4], ingredientes[5], ingredientes[6], ingredientes[7], ingredientes[14]}
        };
        double[] precioHamburPollo = {5.00, 6.50, 7.50};

        String[][] hamburVegana = {
                {"Hamburguesa Vegana clásica", ingredientes[18], ingredientes[3], ingredientes[4], ingredientes[5], ingredientes[6], ingredientes[7], ingredientes[20]},
                {"Hamburguesa Vegana doble clásica", ingredientes[18], ingredientes[24], ingredientes[4], ingredientes[5], ingredientes[6], ingredientes[7], ingredientes[20]}
        };
        double[] precioHamburVegana = {6.00, 7.50};

        String[][] hamburKid = {
                {"Hamburguesa de Ternera Kid", ingredientes[21], ingredientes[1], ingredientes[8], ingredientes[12]},
                {"Hamburguesa de Pollo Kid", ingredientes[21], ingredientes[2], ingredientes[8], ingredientes[12]}
        };
        double[] precioHamburKid = {4.00, 4.00};

        String[][] hamburAhorro = {
                {"Hamburguesa Ahorro de Ternera", ingredientes[0], ingredientes[1], ingredientes[6], ingredientes[12]},
                {"Hamburguesa Ahorro de Pollo", ingredientes[0], ingredientes[2], ingredientes[6], ingredientes[14]},
        };
        double[] precioHamburAhorro = {3.00, 3.00};

        String[] complementos = {"Patatas normales", "Patatas Deluxe", "Aros de cebolla", "Nuggets", "Patatas Kid"};
        double[] precioComplementos = {2.00, 2.50, 2.50, 3.00, 1.50};

        String[] postres = {"Mix de postres", "Helado", "Baklava"};
        double[] precioPostres = {5.00, 2.50, 5.0};

        String[] ensaladas = {"Ensalada César", "Ensalada Mediterránea"};
        double[] precioEnsaladas = {4.50, 4.50};

        String[] bebidas = {"Coca-Cola", "Pepsi", "Aquarius", "Nestea"};
        double[] precioBebidas = {1.50, 1.50, 1.50, 1.50};

        String[] salsas = {"Ketchup", "Mayonesa", "Mostaza"};
        double[] precioSalsas = {0.50, 0.50, 0.50};

        String[] comanda = new String[30];
        double[] precioComanda = new double[30];

        Scanner sc = new Scanner(System.in);
        boolean ctrl1=true;
        int posicionComanda=0;

        while (ctrl1) {
            System.out.println("\n");
            System.out.println("Bienvenido a Burguer Meal! Esta es nuestra carta:");
            System.out.println("1.- Menús Parrilla Ternera");
            System.out.println("2.- Menús Pollo Frito");
            System.out.println("3.- Meal JR");
            System.out.println("4.- Menús Vegetarianos");
            System.out.println("5.- Meal Ahorro");
            System.out.println("6.- Hamburguesas");
            System.out.println("7.- Bebidas");
            System.out.println("8.- Complementos");
            System.out.println("9.- Ensaladas");
            System.out.println("10.- Postres");
            System.out.println("11.- Salsas");
            System.out.println("12.- Ver ticket");
            System.out.println("0.- Salir");
            System.out.println("Elige una opción");
            int opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 0:
                    System.out.println("Salir del programa");
                    ctrl1 = false;
                    sc.close();
                    break;
                case 1:                                                           // menús parrilla
                    System.out.println("Has seleccionado el " + menu[opcionMenu - 1] +
                            " - su precio es de " + precioMenu[opcionMenu - 1] + " euros");

                    System.out.println("\n");
                    System.out.println("Elige la haburguesa:");
                    for (int i = 0; i < hamburTernera.length; i++) {
                        System.out.println((i + 1) + " " + hamburTernera[i][0]);
                    }
                    int opcionHamburTernera = sc.nextInt();
                    if (opcionHamburTernera > 0 && opcionHamburTernera <= hamburTernera.length) {
                        System.out.println("Has elegido la " + hamburTernera[opcionHamburTernera - 1][0]);
                        System.out.println("Esta hamburguesa lleva...");
                        for (int j = 1; j < hamburTernera[opcionHamburTernera - 1].length; j++) {
                            System.out.println("- " + hamburTernera[opcionHamburTernera - 1][j]);
                        }
                    } else {
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    System.out.println("\n");
                    System.out.println("Elige una bebida");
                    for (int i = 0; i < bebidas.length; i++) {
                        System.out.println((i + 1) + " " + bebidas[i]);
                    }
                    int opcionBebida1 = sc.nextInt();
                    if (opcionBebida1 > 0 && opcionBebida1 <= bebidas.length) {
                        System.out.println("\n");
                    } else {
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    System.out.println("Elige un complemento:");
                    for (int i = 0; i < complementos.length; i++) {
                        System.out.println((i + 1) + " " + complementos[i]);
                    }
                    int opcionComplemento1 = sc.nextInt();
                    if (opcionComplemento1 > 0 && opcionComplemento1 <= complementos.length) {
                    } else {
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    //contadorComanda=contadorComanda+1;
                    comanda[posicionComanda] = menu[(opcionMenu - 1)] + " con " + hamburTernera[opcionHamburTernera - 1][0] + ", " + bebidas[opcionBebida1 - 1] + " y " + complementos[opcionComplemento1 - 1];
                    precioComanda[posicionComanda] = precioMenu[opcionMenu - 1];
                    posicionComanda++;
                    break;

                case 2:                                         //menu pollo frito
                    System.out.println("Has seleccionado el " + menu[opcionMenu - 1] +
                            " - su precio es de " + precioMenu[opcionMenu - 1] + " euros ");

                    System.out.println("\n");
                    System.out.println("Elige la haburguesa:");
                    for (int i = 0; i < hamburPollo.length; i++) {
                        System.out.println((i + 1) + " " + hamburPollo[i][0]);
                    }
                    int opcionHamburPollo = sc.nextInt();
                    if (opcionHamburPollo > 0 && opcionHamburPollo <= hamburPollo.length) {
                        System.out.println("Has elegido la " + hamburPollo[opcionHamburPollo - 1][0]);
                        System.out.println("Esta hamburguesa lleva...");
                        for (int j = 1; j < hamburPollo[opcionHamburPollo - 1].length; j++) {
                            System.out.println("- " + hamburPollo[opcionHamburPollo - 1][j]);
                        }
                    } else {
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    System.out.println("\n");
                    System.out.println("Elige una bebida");
                    for (int i = 0; i < bebidas.length; i++) {
                        System.out.println((i + 1) + " " + bebidas[i]);
                    }
                    int opBebi2 = sc.nextInt();
                    if (opBebi2 > 0 && opBebi2 <= bebidas.length) {
                        System.out.println("\n");
                    } else {
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    System.out.println("Elige un complemento:");
                    for (int i = 0; i < complementos.length; i++) {
                        System.out.println((i + 1) + " " + complementos[i]);
                    }
                    int opComp2 = sc.nextInt();
                    if (opComp2 > 0 && opComp2 <= complementos.length) {
                        System.out.println("\n");
                    } else {
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    comanda[posicionComanda] = menu[(opcionMenu - 1)] + " con " + hamburPollo[opcionHamburPollo - 1][0] + ", " + bebidas[opBebi2 - 1] + " y " + complementos[opComp2 - 1];
                    precioComanda[posicionComanda] = precioMenu[opcionMenu - 1];
                    posicionComanda++;
                    break;

                case 3:                                           //menu JR
                    System.out.println("Has seleccionado el " + menu[opcionMenu - 1] +
                            " - su precio es de " + precioMenu[opcionMenu - 1] + " euros ");

                    System.out.println("\n");
                    System.out.println("Elige la haburguesa:");
                    for (int i = 0; i < hamburKid.length; i++) {
                        System.out.println((i + 1) + " " + hamburKid[i][0]);
                    }
                    int opcionHamburKid = sc.nextInt();
                    if (opcionHamburKid > 0 && opcionHamburKid <= hamburKid.length) {
                        System.out.println("Has elegido la " + hamburKid[opcionHamburKid - 1][0]);
                        System.out.println("Esta hamburguesa lleva...");
                        for (int j = 1; j < hamburKid[opcionHamburKid - 1].length; j++) {
                            System.out.println("- " + hamburKid[opcionHamburKid - 1][j]);
                        }
                    } else {
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    System.out.println("\n");
                    System.out.println("Elige una bebida");
                    for (int i = 0; i < bebidas.length; i++) {
                        System.out.println((i + 1) + " " + bebidas[i]);
                    }
                    int opBebi3 = sc.nextInt();
                    if (opBebi3 > 0 && opBebi3 <= bebidas.length) {
                        System.out.println("\n");
                    } else {
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    System.out.println("Elige un complemento:");
                    for (int i = 0; i < complementos.length; i++) {
                        System.out.println((i + 1) + " " + complementos[i]);
                    }
                    int opComp3 = sc.nextInt();
                    if (opComp3 > 0 && opComp3 <= complementos.length) {
                        System.out.println("\n");
                    } else {
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }
                    comanda[posicionComanda] = menu[(opcionMenu - 1)] + " con " + hamburKid[opcionHamburKid - 1][0] + ", " + bebidas[opBebi3 - 1] + " y " + complementos[opComp3 - 1];
                    precioComanda[posicionComanda] = precioMenu[opcionMenu - 1];
                    posicionComanda++;
                    break;

                case 4:                                              //menu vegano
                    System.out.println("Has seleccionado el " + menu[opcionMenu - 1] +
                            " - su precio es de " + precioMenu[opcionMenu - 1] + " euros");

                    System.out.println("\n");
                    System.out.println("Elige la haburguesa");
                    for (int i = 0; i < hamburVegana.length; i++) {
                        System.out.println((i + 1) + " " + hamburVegana[i][0]);
                    }
                    int opcionHamburVegana = sc.nextInt();
                    if (opcionHamburVegana > 0 && opcionHamburVegana <= hamburVegana.length) {
                        System.out.println("Has elegido la " + hamburVegana[opcionHamburVegana - 1][0]);
                        System.out.println("Esta hamburguesa lleva...");
                        for (int j = 1; j < hamburVegana[opcionHamburVegana - 1].length; j++) {
                        System.out.println("- " + hamburVegana[opcionHamburVegana - 1][j]);
                    }
                     }else{
                     System.out.println("Has elegido una opción incorrecta");
                     break;
                    }
                    System.out.println("\n");
                    System.out.println("Elige una bebida");
                    for (int i = 0; i < bebidas.length; i++) {
                        System.out.println((i + 1) + " " + bebidas[i]);
                    }
                    int opBebi4 = sc.nextInt();
                    if(opBebi4>0 && opBebi4<=bebidas.length){
                        System.out.println("\n");
                    }else{
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    System.out.println("Elige un complemento:");
                    for (int i = 0; i < complementos.length; i++) {
                        System.out.println((i + 1) + " " + complementos[i]);
                    }
                    int opComp4 = sc.nextInt();
                    if(opComp4>0 && opComp4<=complementos.length){
                    }else{
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }
                    comanda[posicionComanda] = menu[(opcionMenu-1)] + " con " + hamburVegana[opcionHamburVegana-1][0] + ", " + bebidas[opBebi4-1] + " y " + complementos[opComp4-1];
                    precioComanda[posicionComanda] = precioMenu[opcionMenu-1];
                    posicionComanda++;
                    break;

                case 5:                                                     //menu ahorro
                    System.out.println("Has seleccionado el " + menu[opcionMenu-1] +
                            " - su precio es de " + precioMenu[opcionMenu-1] + " euros");

                    System.out.println("\n");
                    System.out.println("Elige la haburguesa");
                    for (int i = 0; i < hamburAhorro.length; i++) {
                        System.out.println((i + 1) + " " + hamburAhorro[i][0]);
                    }
                    int opcionHamburAhorro = sc.nextInt();
                    if(opcionHamburAhorro>0 && opcionHamburAhorro<=hamburAhorro.length) {
                        System.out.println("Has elegido la " + hamburAhorro[opcionHamburAhorro - 1][0]);
                        System.out.println("Esta hamburguesa lleva...");
                        for (int j = 1; j < hamburAhorro[opcionHamburAhorro - 1].length; j++) {
                            System.out.println("- " + hamburAhorro[opcionHamburAhorro - 1][j]);
                        }
                    }else{
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    System.out.println("\n");
                    System.out.println("Elige una bebida");
                    for (int i = 0; i < bebidas.length; i++) {
                        System.out.println((i + 1) + " " + bebidas[i]);
                    }
                    int opBebi5 = sc.nextInt();
                    if(opBebi5>0 && opBebi5<=bebidas.length) {
                        System.out.println("\n");
                    }else{
                        System.out.println("Has elegido una opción incorrecta");
                        break;
                    }

                    System.out.println("Elige un complemento:");
                    for (int i = 0; i < complementos.length; i++) {
                        System.out.println((i + 1) + " " + complementos[i]);
                    }
                    int opComp5 = sc.nextInt();
                    if(opComp5>0 && opComp5<=complementos.length){
                    }else{

                    }
                    comanda[posicionComanda] = menu[(opcionMenu-1)] + " con " + hamburAhorro[opcionHamburAhorro-1][0] + ", " + bebidas[opBebi5-1] + " y " + complementos[opComp5-1];
                    precioComanda[posicionComanda] = precioMenu[opcionMenu-1];
                    posicionComanda++;
                    break;

                case 6:                                                   // solo hamburguesa
                    boolean ctrl2=true;
                    while(ctrl2) {

                        System.out.println("\n");
                        System.out.println("Elige el tipo de hamburguesa:");
                        for (int i = 0; i < hamburguesas.length; i++) {
                            System.out.println((i + 1) + " " + hamburguesas[i]);
                        }
                        System.out.println("0 - Volver al menú principal");
                        int opcionHambuesa = sc.nextInt();

                        switch (opcionHambuesa) {
                            case 0:
                                ctrl2 = false;
                                break;
                            case 1:                                         //solo hamburguesa ternera
                                System.out.println("Elige tu favorita:");
                                for (int i = 0; i < hamburTernera.length; i++) {
                                    System.out.println((i + 1) + " " + hamburTernera[i][0] + " - " + precioHamburTernera[i] + " euros");
                                }
                                int opcionHamburTerneraSola = sc.nextInt();
                                if(opcionHamburTerneraSola>0 && opcionHamburTerneraSola<=hamburTernera.length) {
                                    System.out.println("Esta hamburguesa lleva los siguientes ingredientes:");
                                    for (int j = 1; j < hamburTernera[opcionHamburTerneraSola - 1].length; j++) {
                                        System.out.println("- " + hamburTernera[opcionHamburTerneraSola - 1][j]);
                                    }
                                    comanda[posicionComanda] = hamburTernera[opcionHamburTerneraSola-1][0];
                                    precioComanda[posicionComanda] = precioHamburTernera[opcionHamburTerneraSola-1];
                                    posicionComanda++;
                                }else{
                                    System.out.println("Has elegido una opción incorrecta");                                   break;
                                }
                                break;
                            case 2:                                           // solo hamburguesa pollo
                                System.out.println("Elige tu favorita:");
                                for (int i = 0; i < hamburPollo.length; i++) {
                                    System.out.println((i + 1) + " " + hamburPollo[i][0]+ " - " + precioHamburPollo[i] + " euros");
                                }
                                int opcionHamburPolloSola = sc.nextInt();
                                if(opcionHamburPolloSola>0 && opcionHamburPolloSola<=hamburPollo.length) {
                                    System.out.println("Esta hamburguesa lleva los siguientes ingredientes:");
                                    for (int j = 1; j < hamburPollo[opcionHamburPolloSola - 1].length; j++) {
                                        System.out.println("- " + hamburPollo[opcionHamburPolloSola - 1][j]);
                                    }
                                    comanda[posicionComanda] = hamburPollo[opcionHamburPolloSola - 1][0];
                                    precioComanda[posicionComanda] = precioHamburPollo[opcionHamburPolloSola - 1];
                                    posicionComanda++;
                                }else{
                                    System.out.println("Has elegido una opción incorrecta");
                                }
                                break;
                            case 3:                                         // solo hamburguesa vegana
                                System.out.println("Elige tu favorita:");
                                for (int i = 0; i < hamburVegana.length; i++) {
                                    System.out.println((i + 1) + " " + hamburVegana[i][0]+ " - " + precioHamburVegana[i] + " euros");
                                }
                                int opcionHamburVeganaSola = sc.nextInt();
                                if(opcionHamburVeganaSola>0 && opcionHamburVeganaSola<=hamburVegana.length) {
                                    System.out.println("Esta hamburguesa lleva los siguientes ingredientes:");
                                    for (int j = 1; j < hamburVegana[opcionHamburVeganaSola - 1].length; j++) {
                                        System.out.println("- " + hamburVegana[opcionHamburVeganaSola - 1][j]);
                                    }
                                    comanda[posicionComanda] = hamburVegana[opcionHamburVeganaSola - 1][0];
                                    precioComanda[posicionComanda] = precioHamburVegana[opcionHamburVeganaSola - 1];
                                    posicionComanda++;
                                }else{
                                    System.out.println("Has elegido una opción incorrecta");
                                }
                                break;
                            case 4:                                       //solo hamburguesa kid
                                System.out.println("Elige tu favorita:");
                                for (int i = 0; i < hamburKid.length; i++) {
                                    System.out.println((i + 1) + " " + hamburKid[i][0]+ " - " + precioHamburKid[i] + " euros");
                                }
                                int opcionHamburKidSola = sc.nextInt();
                                if(opcionHamburKidSola>0 && opcionHamburKidSola<=hamburKid.length) {
                                    System.out.println("Esta hamburguesa lleva los siguientes ingredientes:");
                                    for (int j = 1; j < hamburKid[opcionHamburKidSola - 1].length; j++) {
                                        System.out.println("- " + hamburKid[opcionHamburKidSola - 1][j]);
                                    }
                                    comanda[posicionComanda] = hamburKid[opcionHamburKidSola - 1][0];
                                    precioComanda[posicionComanda] = precioHamburKid[opcionHamburKidSola - 1];
                                    posicionComanda++;
                                }else{
                                    System.out.println("Has elegido una opción incorrecta");
                                }
                                break;
                            case 5:                                              //solo hamburguesa ahorro
                                System.out.println("Elige tu favorita:");
                                for (int i = 0; i < hamburAhorro.length; i++) {
                                    System.out.println((i + 1) + " " + hamburAhorro[i][0]+ " - " + precioHamburAhorro[i] + " euros");
                                }
                                int opcionHambuAhorroSola = sc.nextInt();
                                if(opcionHambuAhorroSola>0 && opcionHambuAhorroSola<=hamburAhorro.length) {
                                    System.out.println("Esta hamburguesa lleva los siguientes ingredientes:");
                                    for (int j = 1; j < hamburAhorro[opcionHambuAhorroSola - 1].length; j++) {
                                        System.out.println("- " + hamburAhorro[opcionHambuAhorroSola - 1][j]);
                                    }
                                    comanda[posicionComanda] = hamburAhorro[opcionHambuAhorroSola - 1][0];
                                    precioComanda[posicionComanda] = precioHamburAhorro[opcionHambuAhorroSola - 1];
                                    posicionComanda++;
                                }else{
                                    System.out.println("Has elegido una opción incorrecta");
                                }
                                break;
                            default:
                                System.out.println("Opción no válida");
                                ;

                        } //fin switch 2

                    } //fin while 2
                    break;

                case 7:                                                                 //solo bebidas
                    System.out.println("Elige tu bebida:");
                    for (int i = 0; i < bebidas.length; i++) {
                        System.out.println((i + 1) + " " + bebidas[i]+ " - " + precioBebidas[i] + " euros");
                    }
                    int opcionBebidaSola = sc.nextInt();
                    if(opcionBebidaSola>0 && opcionBebidaSola<=bebidas.length) {
                        comanda[posicionComanda] = bebidas[opcionBebidaSola - 1];
                        precioComanda[posicionComanda] = precioBebidas[opcionBebidaSola - 1];
                        posicionComanda++;
                        System.out.println("Has elegido " + bebidas[opcionBebidaSola - 1]);
                    }else {
                        System.out.println("Has elegido una opción incorrecta");
                    }
                    break;

                case 8:                                                         //solo complementos
                    System.out.println("Elige tu complemento:");
                    for (int i = 0; i < complementos.length; i++) {
                        System.out.println((i + 1) + " " + complementos[i]+ " - " + precioComplementos[i] + " euros");
                    }
                    int opcionComplementoSolo = sc.nextInt();
                    if(opcionComplementoSolo>0 && opcionComplementoSolo<=complementos.length) {
                        comanda[posicionComanda] = complementos[opcionComplementoSolo - 1];
                        precioComanda[posicionComanda] = precioComplementos[opcionComplementoSolo - 1];
                        posicionComanda++;
                        System.out.println("Has elegido " + complementos[opcionComplementoSolo - 1]);
                    }else{
                        System.out.println("Has elegido una opción incorrecta");
                    }
                    break;

                case 9:                                                                 // ensaladas
                    System.out.println("Elige tu ensalada:");
                    for (int i = 0; i < ensaladas.length; i++) {
                        System.out.println((i + 1) + " " + ensaladas[i]+ " - " + precioEnsaladas[i] + " euros");
                    }
                    int opcionEnsaladaSola = sc.nextInt();
                    if(opcionEnsaladaSola>0 && opcionEnsaladaSola<=ensaladas.length) {
                        comanda[posicionComanda] = ensaladas[opcionEnsaladaSola - 1];
                        precioComanda[posicionComanda] = precioEnsaladas[opcionEnsaladaSola - 1];
                        posicionComanda++;
                        System.out.println("Has elegido " + ensaladas[opcionEnsaladaSola - 1]);
                    }else{
                        System.out.println("Has elegido una opción incorrecta");
                    }
                    break;

                case 10:                                                             // postres
                    System.out.println("Elige tu postre:");
                    for (int i = 0; i < postres.length; i++) {
                        System.out.println((i + 1) + " " + postres[i]+ " - " + precioPostres[i] + " euros");
                    }
                    int opcionPostreSolo = sc.nextInt();
                    if(opcionPostreSolo>0 && opcionPostreSolo<=postres.length) {
                        comanda[posicionComanda] = postres[opcionPostreSolo - 1];
                        precioComanda[posicionComanda] = precioPostres[opcionPostreSolo - 1];
                        posicionComanda++;
                        System.out.println("Has elegido " + postres[opcionPostreSolo - 1]);
                    }else{
                        System.out.println("Has elegido una opción incorrecta");
                    }
                    break;

                case 11:                                                             // extras
                    System.out.println("Elige tu salsa:");
                    for (int i = 0; i < salsas.length; i++) {
                        System.out.println((i + 1) + " " + salsas[i]+ " - " + precioSalsas[i] + " euros");
                    }
                    int opcionSalsaSola = sc.nextInt();
                    if(opcionSalsaSola>0 && opcionSalsaSola<=salsas.length) {
                        comanda[posicionComanda] = salsas[opcionSalsaSola - 1];
                        precioComanda[posicionComanda] = precioSalsas[opcionSalsaSola - 1];
                        posicionComanda++;
                        System.out.println("Has elegido " + salsas[opcionSalsaSola - 1]);
                    }else{
                        System.out.println("Has elegido una opción incorrecta");
                    }
                    break;

                case 12:                                                        // imprimir ticket y pagar
                    System.out.println("\n");
                    double total=0;
                    System.out.println("---------TICKET DE COMPRA----------");
                    for (int i =0; i < precioComanda.length;i++) {
                         if (precioComanda[i] !=0) {
                            System.out.println(comanda[i] + " ......... " + precioComanda[i] + " euros");
                            total = total + precioComanda[i];
                        }
                    }
                    System.out.println("TOTAL A PAGAR: " + total + " EUROS.");
                    System.out.println("----------------------------------");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;

            } //fin switch 1

        } // fin while 1

    } // fin main
}//fin class