package ejerciciosarrays;

//import java.util.Scanner;
//import javax.swing.JOptionPane;


public class EjerciciosArrays {

  
    public static void main(String[] args)
    {
    //       Scanner sc = new Scanner(System.in);
     /*Desarrolla un programa en Java que permita gestionar el inventario de una 
    biblioteca. El programa debe: 
    • Declarar e inicializar un array de libros con información básica (título, 
    autor, cantidad en stock). 
    • Implementar funcionalidades para mostrar el inventario, agregar 
    nuevas copias de libros, prestar libros, buscar libros y ordenar el 
    inventario por título.*/


    //  class libro
    //    {
    //        public String titulo;
    //        public String autor;
    //        public int stock;
    //        
    //        public libro(String titulo, String autor, int stock)
    //        {
    //            this.titulo = titulo;
    //            this.autor = autor;
    //            this.stock = stock;
    //        }
    //         public void mostrarInfo()
    //        {
    //            System.out.println("Libro [Titulo: " + titulo + ", Autor: " + autor + ", Stock: " + stock + "].");
    //        }
    //    }
    //        int numLibros;
    //        
    //        System.out.println("Ingrese la cantidad de libros en el inventario: ");
    //        numLibros = sc.nextInt();
    //        
    //        libro[] inventario = new libro[numLibros];
    //        for(int a =0; a <numLibros; a++)
    //        {
    //            System.out.println("Ingrese el titulo del libro: " + (a + 1));
    //            String titulo = sc.next();
    //            
    //            System.out.println("Ingrese el autor del libro" + (a +1));
    //            String autor = sc.next();
    //            
    //            System.out.println("Ingrese la cantidad en stock del libro; " + (a+1));
    //            int stock = sc.nextInt();
    //            
    //            inventario[a] = new libro(titulo, autor, stock);
    //        }
    //        System.out.println("Inventario de la biblioteca: ");
    //        for(libro Libro : inventario)
    //        {
    //            Libro.mostrarInfo();
    //        }
    //    }

    /*Desarrolla un programa en Java que permita gestionar el alquiler de 
    vehículos en una agencia de alquiler de coches. El programa debe: 
    1. Declarar e inicializar un array de vehículos con información básica (modelo, 
    matrícula, precio por día, disponibilidad). 
    2. Implementar funcionalidades para mostrar la lista de vehículos, alquilar un 
    vehículo, devolver un vehículo, buscar un vehículo y ordenar la lista por 
    precio.*/
    //
    //        class vehiculo
    //        {
    //          String modelo;
    //          String matricula;
    //          double precioXdia;
    //          boolean disponible;
    //          
    //          public vehiculo(String modelo, String matricula, double precioXdia)
    //          {
    //              this.modelo = modelo;
    //              this.matricula = matricula;
    //              this.precioXdia = precioXdia;
    //              this.disponible = true;
    //          }
    //          
    //          public void mostrar()
    //          {
    //                System.out.println("Modelo: " + modelo);
    //                System.out.println("Matrícula: " + matricula);
    //                System.out.println("Precio por día: $" + precioXdia);
    //                System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    //                System.out.println();
    //          }
    //        }
    //        
    //        int numVehiculos;
    //        System.out.println("Ingrese la cantidad de vehiculos en el inventarios: ");
    //        numVehiculos = sc.nextInt();
    //        vehiculo[] inventario = new vehiculo[numVehiculos];
    //        for(int b = 1; b<numVehiculos; b++)
    //        {
    //            System.out.println("Ingrese el modelo del veiculo: "+ (b+1));
    //            String modelo = sc.next();
    //            System.out.println("Ingrese la matricula del vehiculo: " + (b+1));
    //            String matricula=sc.next();
    //            
    //            System.out.println("Ingrese el precio por dia del vehiculo: " + (b+1));
    //            double precioXdia=sc.nextDouble();
    //            
    //            inventario[b] = new vehiculo(modelo, matricula, precioXdia);    
    //        }
    //        System.out.println("lista de vehiculos: ");
    //        for(vehiculo Vehiculo : inventario)
    //        {
    //            Vehiculo.mostrar();
    //        }
    //        
    //    }

    /* Desarrolla un programa en Java que permita gestionar las reservas en un 
    restaurante. El programa debe: 
    1. Declarar e inicializar un array de mesas con información sobre su 
    disponibilidad y capacidad. 
    2. Implementar funcionalidades para mostrar la disponibilidad, realizar nuevas 
    reservas, cancelar reservas, buscar mesas y ordenar las mesas por 
    capacidad. */

    //           class Mesa
    //           { 
    //               public int capacidad;
    //               public boolean disponibilidad;
    //               
    //               public Mesa(int capacidad, boolean disponibilidad)
    //               {
    //               this.capacidad = capacidad;
    //               this.disponibilidad= disponibilidad;
    //               }
    //           }
    //
    //           Mesa[] mesas= new Mesa[10];
    //           mesas[0] = new Mesa(4, true);
    //           mesas[1]= new Mesa(6, true);

    /*Desarrolla un programa en Java que permita gestionar el inventario de una 
    tienda de ropa. El programa debe: 
    1. Declarar e inicializar un array de productos con información sobre tipo de 
    ropa, cantidad en stock y precio. 
    2. Implementar funcionalidades para mostrar el inventario, agregar nuevas 
    unidades, vender productos, buscar productos y ordenar el inventario por 
    precio. */
    //
    //      class Productos
    //      {
    //         public String tipo;
    //         public String talla;
    //         public String cantStock;
    //         public double precio;
    //         
    //         public Productos(String tipo, String talla, String cantStock, double precio)
    //         {
    //             this.tipo = tipo;
    //             this.talla=talla;
    //             this.cantStock=cantStock;
    //             this.precio=precio;     
    //         }
    //      }
    //      
    //      Productos[] inventario = new Productos[6];
    //      inventario[0] =new Productos("Camiseta basico", "S, L, M, XL", "10 unidades de c/u", 40.99);
    //      inventario[1] =new Productos("Jeans cargo", "S, L, M", "8 unidades de c/u", 90.00);
    //      inventario[2] =new Productos("Vestido coctel", "S, L, M", "5 unidades de c/u", 50.99);
    //      inventario[3] =new Productos("chaqueta cuero rojo", "S, L, M, XL", "3 unidades de c/u", 120.99);
    //      inventario[4] =new Productos("Falda jean", "S, L, M, XL", "10 unidades de c/u", 40.99);
    //      inventario[5] =new Productos("Conjunto sudadera", "S, L, M, XL, XXL", "10 unidades de c/u", 30.00);
    //      inventario[6] =new Productos("Buzo lana cuello tortuga", "S, L, M, XL, XXL", "10 unidades de c/u", 40.99);        
    /*Desarrolla un programa en Java que permita gestionar los proyectos en una 
    empresa de desarrollo de software. El programa debe: 
    1. Declarar e inicializar un array de proyectos con información sobre nombre 
    del proyecto, duración en días y estado (completado o en progreso). 
    2. Implementar funcionalidades para mostrar los proyectos, agregar nuevos 
    proyectos, actualizar el estado de un proyecto, buscar proyectos y ordenar 
    los proyectos por duración. */

    //        class Proyectos
    //        {
    //            public String nombreProyec
    //            public String duracion;
    //            public String estado;
    //            
    //            public Proyectos(String nombreProyecto, String duracion, String estado)
    //            {
    //                this.nombreProyecto=nombreProyecto;
    //                this.duracion=duracion;
    //                this.estado=estado;
    //            }
    //        }
    //            
    //            Proyectos[] proyectos = new Proyectos[5];
    //            p

    //             proyectos[1]= new Proyectos("PearProyect", "45 dias", "En proceso");
    //              proyectos[2]= new Proyectos("TravelProyect", "30 dias", "En proceso");
    //               proyectos[3]= new Proyectos("ProyectA", "10 dias", "completado");
    //                proyectos[4]= new Proyectos("ProyectB", "20 dias", "completado");
    //

    // EJERCICIO 26 
    //        int Miembros = 50;
    //        String[]nombre = new String[Miembros];
    //        int[] edad = new int[Miembros];
    //        String[] deportes= new String[Miembros];
    //        double[]mensualidad= new double[Miembros];
    //        int numMiembros=0;
    //        
       //     while(true)
    //        {
    //            System.out.println("            CLUB DEPORTIVO            ");
    //            System.out.println("1. Agregar miembro");
    //            System.out.println("2. Mostrar lista de miembros");
    //            System.out.println("3. Buscar informacion por nombre");
    //            System.out.println("4. Calcular el promedio de edades");
    //            System.out.println("ELEGIR OPCION");
    ////            int opcion= sc.nextInt();
    ////            sc.nextLine();
    ////            
    //                switch(opcion)
    //                {
    //                    case 1 -> {
    //                        if(numMiembros < Miembros)
    //                        {
    //                            System.out.println("Nombre: ");
    //                            nombre[numMiembros]=sc.nextLine();
    //                            System.out.println("Edad: ");
    //                            edad[numMiembros]=sc.nextInt();
    //                            sc.nextLine();
    //                            
    //                            System.out.println("Deporte: ");
    //                            deportes[numMiembros]=sc.nextLine();
    //                            System.out.println("Mensualidad: ");
    //                            mensualidad[numMiembros]=sc.nextDouble();
    //                            numMiembros++;   
    //                            
    //                            System.out.println("Usuario registrado con exito!!!");
    //                        }else
    //                        {
    //                            System.out.println("Limite de miembros alcanzado. ");
    //                        }
    //                }
    //                    
    //                    case 2 -> {
    //                        System.out.println("LISTA DE MIEMBROS: ");
    //                        for(int d =0; d < numMiembros; d++)
    //                        {
    //                            System.out.println(nombre[d] + edad[d] + "anios" + deportes[d] + mensualidad[d]);                  
    //                        }
    //                }
    //                    case 3 -> {
    //                        System.out.println("Buscar miembro por nombre: ");
    //                        String buscar = sc.nextLine();
    //                        boolean encontrado = false;
    //                        for(int e=0; e < numMiembros; e++)
    //                        {
    //                            if(nombre[e].equalsIgnoreCase(buscar))
    //                            {
    //                                System.out.println("Miembro encontrado: ");
    //                                System.out.println(nombre[e] + edad[e] + "años" + deportes[e] + mensualidad[e]);
    //                                encontrado = true;
    //                                break;
    //                            }
    //                        }
    //                        if(!encontrado)
    //                        {
    //                            System.out.println("Miembro no encontrado, verificar datos,");
    //                        }
    //                }
    //                    case 4 -> {
    //                        int edades=0;
    //                        for(int f=0; f<numMiembros; f++)
    //                        {
    //                            edades += edad[f];
    //                        }
    //                        double promedio=(double)edades/numMiembros;
    //                        System.out.println("El promedio de edad de los miembros es" + promedio + "años");
    //                }  
    //                        
    //                    default -> System.out.println("Opcion invalida, intentelo de nuevo. ");
    //                }
    //        }     

    //Ejercicio27
    //
    //        int reservas = 30;
    //        String[] cliente = new String[reservas];
    //        String[] pelicula = new String[reservas];
    //        int[] numEntradas = new int[reservas];
    //        double[] precioTotal = new double[reservas];
    //        int numReservas = 0;
    //        
    ////        String[] cartelera ={
    ////            "Barbie","Deadpool 4","Inside out2","Los minions"
    ////                
    ////        };
    //
    //        while (true) {
    //            String opciones = JOptionPane.showInputDialog("Menu: \n" +
    //                    "1. Registrar una reserva. \n" +
    //                    "2. Buscar reservas por nombre del cliente. \n" +
    //                    "3. Mostrar todas las reservas registradas. \n" +
    //                    "4. Calcular el ingreso total. \n" +
    //                    "5. Salir.");
    //            switch (opciones) {
    //                case "1":
    //                    if (numReservas < reservas) {
    //                        cliente[numReservas] = JOptionPane.showInputDialog("Nombre del cliente");
    //                        pelicula[numReservas] = JOptionPane.showInputDialog("Seleccione película");
    //                        numEntradas[numReservas] = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas entradas va a adquirir?"));
    //                        precioTotal[numReservas] = calcularPrecioTotal(numEntradas[numReservas]);
    //                        numReservas++;
    //                    } else {
    //                        JOptionPane.showMessageDialog(null, "¡La sala está llena!");
    //                    }
    //                    break;
    //                case "2":
    //                    String buscar = JOptionPane.showInputDialog("Buscar reservas por nombre del cliente: ");
    //                    boolean encontrado = false;
    //
    //                    for (int i = 0; i < numReservas; i++) {
    //                        if (cliente[i].equalsIgnoreCase(buscar)) {
    //                            JOptionPane.showMessageDialog(null, "Nombre: " + cliente[i] +
    //                                    "\nPelícula: " + pelicula[i] +
    //                                    "\nCantidad de entradas: " + numEntradas[i] +
    //                                    "\nTotal: $" + precioTotal[i]);
    //                            encontrado = true;
    //                        }
    //                    }
    //
    //                    if (!encontrado) {
    //                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
    //                    }
    //                    break;
    //                case "3":
    //                    mostrarReservas(cliente, pelicula, numEntradas, precioTotal, numReservas);
    //                    break;
    //                case "4":
    //                    double ingresoTotal = calcularIngresoTotal(precioTotal, numReservas);
    //                    JOptionPane.showMessageDialog(null, "Ingreso total: $" + ingresoTotal);
    //                    break;
    //                case "5":
    //                    System.exit(0);
    //                default:
    //                    JOptionPane.showMessageDialog(null, "Opción inválida.");
    //            }
    //        }
    //    }
    //
    //    public static double calcularPrecioTotal(int numEntradas) {
    //        double precioEntrada = 10.0; // Precio por entrada
    //        return numEntradas * precioEntrada;
    //    }
    ////
    //    public static void mostrarReservas(String[] nombres, String[] peliculas, int[] numEntradas, double[] precioTotal, int numReservas) {
    //        StringBuilder sb = new StringBuilder();
    //        for (int i = 0; i < numReservas; i++) {
    //            sb.append("Cliente: ").append(nombres[i]).append(", Película: ").append(peliculas[i])
    //                    .append(", Entradas: ").append(numEntradas[i]).append(", Precio Total: $").append(precioTotal[i])
    //                    .append("\n");
    //        }
    //        JOptionPane.showMessageDialog(null, sb.toString());
    //    }
    //
    //    public static double calcularIngresoTotal(double[] precioTotal, int numReservas) {
    //        double total = 0.0;
    //        for (int i = 0; i < numReservas; i++) {
    //            total += precioTotal[i];
    //        }
    //        return total;
    //    }
    //}

    //Ejercicio28

    //        int Miembros = 50;
    //        String[] nombre = new String[Miembros];
    //        int[] edad = new int[Miembros];
    //        String[] LibroFavorito = new String[Miembros];
    //        int numMiembros = 0;
    //
    //        while (true) {
    //            String opciones = JOptionPane.showInputDialog("Menu: \n" +
    //                    "1. Mostrar lista de todos los socios. \n" +
    //                    "2. Agregar nuevos socios al club. \n" +
    //                    "3. Buscar socios por nombre. \n" +
    //                    "4. Calcular y mostrar el promedio de edad de los socios.\n" +
    //                    "5. Salir.");
    //            switch (opciones) {
    //                case "1":
    //                    StringBuilder listaSocios = new StringBuilder("LISTA DE MIEMBROS:\n");
    //                    for (int d = 0; d < numMiembros; d++) {
    //                        listaSocios.append(nombre[d]).append(" - ").append(edad[d]).append(" años - ").append(LibroFavorito[d]).append("\n");
    //                    }
    //                    JOptionPane.showMessageDialog(null, listaSocios.toString());
    //                    break;
    //                case "2":
    //                    if (numMiembros < Miembros) {
    //                        nombre[numMiembros] = JOptionPane.showInputDialog("Nombre:");
    //                        edad[numMiembros] = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
    //                        LibroFavorito[numMiembros] = JOptionPane.showInputDialog("Libro favorito:");
    //                        numMiembros++;
    //                        JOptionPane.showMessageDialog(null, "¡Miembro registrado con éxito!");
    //                    } else {
    //                        JOptionPane.showMessageDialog(null, "Límite de miembros alcanzado.");
    //                    }
    //                    break;
    //                case "3":
    //                    String buscar = JOptionPane.showInputDialog("Buscar miembros del club por nombre:");
    //                    boolean encontrado = false;
    //                    for (int i = 0; i < numMiembros; i++) {
    //                        if (nombre[i].equalsIgnoreCase(buscar)) {
    //                            JOptionPane.showMessageDialog(null, "Nombre: " + nombre[i] +
    //                                    "\nEdad: " + edad[i] +
    //                                    "\nLibro favorito: " + LibroFavorito[i]);
    //                            encontrado = true;
    //                            break;
    //                        }
    //                    }
    //                    if (!encontrado) {
    //                        JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
    //                    }
    //                    break;
    //                case "4":
    //                    int totalEdades = 0;
    //                    for (int f = 0; f < numMiembros; f++) {
    //                        totalEdades += edad[f];
    //                    }
    //                    double promedio = (double) totalEdades / numMiembros;
    //                    JOptionPane.showMessageDialog(null, "El promedio de edad de los miembros es " + promedio + " años.");
    //                    break;
    //                case "5":
    //                    System.exit(0);
    //                default:
    //                    JOptionPane.showMessageDialog(null, "Opción inválida.");
    //            }
    //        }
    //    }
    //}
    //

    //        int inscripcionesNatacion = 50;
    //        String[] nombre = new String[inscripcionesNatacion];
    //        int[] nivel = new int[inscripcionesNatacion];
    //        String[] mensualidad = new String[inscripcionesNatacion];
    //        int numMiembros = 0;
    //
    //        while (true) {
    //            String opciones = JOptionPane.showInputDialog("Menu: \n" +
    //                    "1. Mostrar las inscripciones realizadas. \n" +
    //                    "2. Agregar nueva inscripcion. \n" +
    //                    "3. Buscar iscripcion por nombre. \n" +
    //                    "4. Calcular ingresos generados por inscripciones.\n" +
    //                    "5. Salir.");
    //            switch (opciones) {
    //                case "1":
    //                    StringBuilder listaInscripciones = new StringBuilder("INSCRIPCIONES REGISTRADAS: \n");
    //                    for (int d = 0; d < numMiembros; d++) {
    //                        listaInscripciones.append(nombre[d]).append(" - ").append(nivel[d]).append(" nivel -  $").append(mensualidad[d]).append("\n");
    //                    }
    //                    JOptionPane.showMessageDialog(null, listaInscripciones.toString());
    //                    break;
    //                case "2":
    //                    if (numMiembros < inscripcionesNatacion) {
    //                        nombre[numMiembros] = JOptionPane.showInputDialog("Nombre:");
    //                        nivel[numMiembros] = Integer.parseInt(JOptionPane.showInputDialog("Nivel:"));
    //                        mensualidad[numMiembros] = JOptionPane.showInputDialog("Mensualidad:");
    //                        numMiembros++;
    //                        JOptionPane.showMessageDialog(null, "¡Miembro registrado con éxito!");
    //                    } else {
    //                        JOptionPane.showMessageDialog(null, "Límite de miembros alcanzado.");
    //                    }
    //                    break;
    //                case "3":
    //                    String buscar = JOptionPane.showInputDialog("Buscar inscripciones por nombre:");
    //                    boolean encontrado = false;
    //                    for (int i = 0; i < numMiembros; i++) {
    //                        if (nombre[i].equalsIgnoreCase(buscar)) {
    //                            JOptionPane.showMessageDialog(null, "Nombre: " + nombre[i] +
    //                                    "\nEdad: " + nivel[i] +
    //                                    "\nLibro favorito: " + mensualidad[i]);
    //                            encontrado = true;
    //                            break;
    //                        }
    //                    }
    //                    if (!encontrado) {
    //                        JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
    //                    }
    //                    break;
    //                case "4":
    //                    int totalEdades = 0;
    //                    for (int f = 0; f < numMiembros; f++) {
    //                        totalEdades += nivel[f];
    //                    }
    //                    double promedio = (double) totalEdades / numMiembros;
    //                    JOptionPane.showMessageDialog(null, "Ingresos generados por inscripciones " + promedio + " años.");
    //                    break;
    //                case "5":
    //                    System.exit(0);
    //                default:
    //                    JOptionPane.showMessageDialog(null, "Opción inválida.");
    //            }
    //        }
    //    }
}






  
