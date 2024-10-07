
package funciones;

import java.util.Scanner;


public class Funciones {

   
    public static void main(String[] args) {
        /*  La empresa GlobalTech necesita un programa en Java para calcular el 
            salario anual y la deducción de retención en la fuente de un empleado. El 
            programa debe incluir una función que reciba el salario mensual de un 
            empleado y el porcentaje de retención en la fuente, y devuelva el salario 
            anual total y el monto de la deducción de retención en la fuente.*/
        
      
        Scanner sc = new Scanner(System.in);
       
        /*La tienda SuperMart necesita un programa en Java para determinar el nivel
        de stock de productos, con una función que recibe las cantidades de varios
        productos y el nivel mínimo requerido de stock, y determina si es necesario
        realizar un pedido para cada producto.*/
//        System.out.println("Ingrese el nivel minimo requerido de stock: ");
//          int nivelMinimo = sc.nextInt();
//        System.out.println("Ingrese la cantidad de productos: ");
//        int cantProductos = sc.nextInt();
//        for (int a=1; a <= cantProductos; a++)
//        {
//            System.out.println("Ingrese la cantidad actual del producto: " + a + ":");
//            int cantActual=sc.nextInt();
//            if (cantActual < nivelMinimo)
//            {
//                System.out.println("Realizar pedido del producto " + a);
//            }else{
//                System.out.println("No es necesario realizar pedido para el producto " + a);
//            }
//        }
        /* Una fábrica necesita un programa en Java para calcular el costo total de
        producción, con una función que recibe los costos de materiales, mano de
        obra y gastos generales, y devuelve el costo total de producción.*/
//        System.out.println("Ingrese el costo de los materiales empleados en la produccion: ");
//     double materiales = sc.nextDouble();
//        System.out.println("Ingrese el costo de la mano de obra: ");
//     double manoDobra = sc.nextDouble();
//        System.out.println("Ingrese el total de los gastos generales: ");
//     double gastosGenerales = sc.nextDouble();
//     double costoTotal = (materiales + manoDobra + gastosGenerales);
//        System.out.println("El costo total de la produccion es de: " + costoTotal);
/*  La corporación FinTech necesita un programa en Java para evaluar el
        rendimiento trimestral de departamentos, con una función que recibe las
        ganancias trimestrales de varios departamentos y determina cuál tuvo el
        mejor rendimiento.*/ 
//        int numDpto;
//        System.out.println("Ingrese el numero de departamentos: ");
//        numDpto = sc.nextInt();
//        
//        double[] gananciasTrimestrales = new double[numDpto];
//        for (int b = 0; b < numDpto; b++ )
//        {
//            System.out.println("Ingrese las ganancias trimestrales del departamento " + (b+1) + ":");
//            gananciasTrimestrales[b]= sc.nextDouble();           
//        }
//        int dptoMejorGanancia = ObtMejorDpto(gananciasTrimestrales);
//        System.out.println("El departamento " + (dptoMejorGanancia + 1) + " tuvo las ganancias mas altas" );
//    }
//        public static int ObtMejorDpto (double[]gananciasTrimestrales)
//        {
//            double maxGanancias = gananciasTrimestrales[0];
//            int dptoMejorGanancia =0;  
//            for (int b =1; b<gananciasTrimestrales.length; b++)
//            {
//                if(gananciasTrimestrales[b] > maxGanancias)
//                {
//                    maxGanancias = gananciasTrimestrales[b];
//                    dptoMejorGanancia=b;
//                }
//            }
//            return dptoMejorGanancia;
/*Una empresa de tecnología necesita un programa en Java para calcular la
        depreciación anual de un activo, con una función que recibe el valor inicial,
        el valor residual y la vida útil de un activo, y devuelve la depreciación anual
        utilizando el método de línea recta. */
//        System.out.println("Ingrese el valor inicial de su activo: ");
//            double valorInicial = sc.nextDouble();
//            System.out.println("Ingrese el valor residual: ");
//            double valorResidual = sc.nextDouble();
//            System.out.println("Ingrese en anios la vida util de su activo: ");
//            int vidaUtil= sc.nextInt();
//            
//            double depreciacionAnual = calculoLineal(valorInicial, valorResidual, vidaUtil);
//            System.out.println("La depreciacion anual es de: " + depreciacionAnual);   
//        }
//         public static double calculoLineal(double valorInicial, double valorResidual, int vidaUtil)
//            {
//                double montoDepreciable = valorInicial - valorResidual;
//                return montoDepreciable / vidaUtil;
//            }
/*Un asesor financiero necesita un programa en Java para calcular la
        rentabilidad de una inversión, con una función que recibe el capital inicial, la
        tasa de interés anual y el número de años, y devuelve el valor futuro de la
        inversión utilizando interés compuesto. *///        
//        System.out.println("Ingrese su Salario mensual: ");
//        double salarioMensual = sc.nextDouble();
//        System.out.println("Ingrese el porcentaje de retencion en fuente: %");
//        double retencionFuente = sc.nextDouble();
//        double salarioAnual= calcularSalarioAnual(salarioMensual);
//        double deduccion = calcularDeduccion(salarioMensual, retencionFuente);
//        
//        System.out.println("Salario anual total: $" + salarioAnual);
//        System.out.println("La deduccion de retencion en la fuente es: $" + deduccion );
//    }
//    
//    public static double calcularSalarioAnual(double salarioMensual)
//    {
//        return salarioMensual *12;    
//    }
//    public static double calcularDeduccion (double salarioMensual, double retencionFuente)
//    {
//        return(salarioMensual * 12) * (retencionFuente/100);
//        
//    }
/* Un asesor financiero necesita un programa en Java para calcular la 
rentabilidad de una inversión, con una función que recibe el capital inicial, la 
tasa de interés anual y el número de años, y devuelve el valor futuro de la 
inversión utilizando interés compuesto.*/

//        System.out.println("Ingrese el capital inicial: ");
//           double CapitalInicial = sc.nextDouble();
//           System.out.println("ingrese la tasa de interes anual: ");
//           double interesAnual = sc.nextDouble(); System.out.println("%");
//           System.out.println("Ingrese el numero de años de la inversion: ");
//           int numAnios = sc.nextInt();
//           double valorFuturo = calcular(CapitalInicial, interesAnual, numAnios);
//           System.out.println("El valor futuro de su inversion es de: " + valorFuturo);
//    }
//    
//    public static double calcular(double CapitalInicial, double interesAnual, int numAnios)
//    {
//        double interesPeriodo = interesAnual /12;
//        int numPeriodos = numAnios*12;
//        return CapitalInicial * Math.pow(1 + interesPeriodo, numPeriodos);
//    }
/*La empresa WorkHours Inc. necesita un programa en Java para generar un 
informe de horas extras trabajadas por empleados, con una función que 
recibe los nombres de empleados y las horas extras trabajadas por cada 
uno, y genera un informe detallado de las horas extras.*/

//       int numEmpleados;
//        System.out.println("Ingrese la cantidad de empleados");
//        numEmpleados=sc.nextInt();
//         
//        for(int c = 1; c <= numEmpleados; c++)
//        {
//            System.out.println("Ingrese el nombre del empleado: " + c );
//            String nombreEmpleado=sc.next();
//            System.out.println("ingrese las horas trabajadas por " + nombreEmpleado + ":");
//            int extras = sc.nextInt();
//            
//            generarInforme(nombreEmpleado, extras);
//        }
//    }
//    public static void generarInforme(String nombreEmpleado, int extras)
//    {
//        System.out.println("Informe para: " + nombreEmpleado);
//        System.out.println("Horas extras trabajadas: " + extras);
//        System.out.println();
//    }
/*Una constructora necesita un programa en Java para calcular el costo de 
un proyecto de construcción, con una función que recibe los costos de 
materiales, mano de obra y equipos, y devuelve el costo total del proyecto. */
//        System.out.println("Ingrese el valor total de los materiales: ");
//       double cosMateriales = sc.nextDouble();
//        System.out.println("Ingrese el valor total de la mano de obra: ");
//       double manoObra = sc.nextDouble();
//        System.out.println("Ingrese el valor total por los equipos: ");
//       double equipos = sc.nextDouble();
//       double Total = (cosMateriales + manoObra + equipos);
//       
//        System.out.println("El costo total de este proyecto es de: " + Total);
//        

/*Una empresa de manufactura necesita un programa en Java para calcular 
la nómina semanal de los empleados, con una función que recibe las horas 
trabajadas y el salario por hora de varios empleados, y devuelve la nómina 
total de la semana. */
//        int cantEmpleados;
//        System.out.println("Ingrese el numero de empleados: ");
//        cantEmpleados= sc.nextInt();
//        
//        double Nomina = 0.0;
//        for(int d = 1; d <= cantEmpleados; d++)
//        {
//            System.out.println("Ingrese las horas de trabajo del empleado/a: " + d + ";");
//            double horasTrabajadas = sc.nextDouble();
//            System.out.println("Ingrese el salario por hora del empleado " + d + ":");
//            double salarioXhora = sc.nextDouble();
//            
//            double salarioSemanal=calcular(horasTrabajadas, salarioXhora, Nomina += salarioSemanal);
//            
//            System.out.println("El salario semanal del empleado " + d +":" + salarioSemanal);
//            System.out.println("La nomina total de la semana es de: " + Nomina);
//        }
//            
//       public static double calcular(double horasTrabajadas, double salarioXhora)
//            {
//                double salarioSemanal = horasTrabajadas * salarioXhora;
//                if(horasTrabajadas > 40)
//                {
//                    salarioSemanal += (horasTrabajadas - 40) * (salarioXhora/2); 
//                }
//                return salarioSemanal;
//            }
    /*Una empresa de mensajería 
 necesita un programa en Java para calcular el 
tiempo estimado de entrega de un paquete, con una función que recibe la 
distancia y la velocidad promedio del vehículo de entrega, y devuelve el 
tiempo estimado de entrega.*/
//    
//        System.out.println("Ingrese la distancia que recorrera el paquete: ");
//        double distancia = sc.nextDouble();
//        System.out.println("Ingrese la velocidad promedio del vehiculo: ");
//        double velocidad = sc.nextDouble();
//        double tiempo =calcular (distancia, velocidad);
//        System.out.println("El tiempo estimado de entrega es de: " + tiempo + "horas. ");
//    }   
//    
//    public static double calcular(double distancia, double velocidad)
//    {
//        return distancia/velocidad;
//    }
//}
//    
//    11
//    public static double calcularConsumoPromedio(double[] distancia, double[] consumo) {
//        double Tdistancia = 0;
//        double Tcombustible = 0;
//
//        for (int i = 0; i < distancia.length; i++) {
//            Tdistancia += distancia[i];
//            Tcombustible += consumo[i];
//        }
//
//        // Evitar división por cero
//        if (Tcombustible == 0) {
//            return 0;
//        }
//
//        return Tdistancia / Tcombustible;
//    }
//12
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Ingrese el número de vehículos: ");
//        int numVehiculos = sc.nextInt();
//        double[] distancia = new double[numVehiculos];
//        double[] consumo = new double[numVehiculos];
//
//        for (int i = 0; i < numVehiculos; i++) {
//            System.out.print("Ingrese la distancia recorrida por el vehículo " + (i + 1) + ": ");
//            distancia[i] = sc.nextDouble();
//            System.out.print("Ingrese el combustible que el vehículo consumió: ");
//            consumo[i] = sc.nextDouble();
//        }
//
//        double consumoPromedio = calcularConsumoPromedio(distancia, consumo);
//        System.out.println("El consumo promedio de combustible de la flota elegida es: " + consumoPromedio + " km/l");
//    }
//
//        System.out.print("Ingrese el número de equipos: ");
//        int numEquipos = sc.nextInt();
//
//        String[] nombresEquipos = new String[numEquipos];
//        int[] puntosEquipos = new int[numEquipos];
//
//        for (int i = 0; i < numEquipos; i++) {
//            System.out.print("Ingrese el nombre del equipo " + (i + 1) + ": ");
//            nombresEquipos[i] = sc.next();
//            System.out.print("Ingrese los puntos del equipo " + (i + 1) + ": ");
//            puntosEquipos[i] = sc.nextInt();
//        }
//
//        // Encontrar el equipo con más puntos
//        int maxPuntos = puntosEquipos[0];
//        String equipoMaxPuntos = nombresEquipos[0];
//
//        for (int i = 1; i < numEquipos; i++) {
//            if (puntosEquipos[i] > maxPuntos) {
//                maxPuntos = puntosEquipos[i];
//                equipoMaxPuntos = nombresEquipos[i];
//            }
//        }
//
//        System.out.println("El equipo con más puntos es: " + equipoMaxPuntos);
//        System.out.println("Puntos obtenidos: " + maxPuntos);
//    }
//13  
  //    System.out.print("Ingrese la cantidad de asignaturas: ");
//        int numAsignaturas = sc.nextInt();
//
//        double[] calificaciones = new double[numAsignaturas];
//        double sumaCalificaciones = 0;
//
//        for (int i = 0; i < numAsignaturas; i++) {
//            System.out.print("Ingrese la calificación en la asignatura " + (i + 1) + ": ");
//            calificaciones[i] = sc.nextDouble();
//            sumaCalificaciones += calificaciones[i];
//        }
//
//        double promedio = sumaCalificaciones / numAsignaturas;
//  System.out.println("El promedio del estudiante es: " + promedio);
//    }
//14
// System.out.print("Ingrese la cantidad de productos: ");
//        int numProductos = sc.nextInt();
//
//        ArrayList<String> nombresProductos = new ArrayList<>();
//        ArrayList<Double> calificacionesProductos = new ArrayList<>();
//
//        for (int i = 0; i < numProductos; i++) {
//            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
//            String nombreProducto = sc.next();
//            nombresProductos.add(nombreProducto);
//
//            System.out.print("Ingrese la calificación del producto (de 1 a 5): ");
//            double calificacion = sc.nextDouble();
//            calificacionesProductos.add(calificacion);
//        }
//
//        // Calcular el promedio de calificaciones
//        double sumaCalificaciones = 0;
//        for (double calificacion : calificacionesProductos) {
//            sumaCalificaciones += calificacion;
//        }
//        double promedioCalificaciones = sumaCalificaciones / numProductos;
//
//        // Encontrar el producto con la mejor calificación
//        String mejorProducto = "";
//        double mejorCalificacion = 0;
//
//        for (int i = 0; i < numProductos; i++) {
//            if (calificacionesProductos.get(i) > mejorCalificacion) {
//                mejorCalificacion = calificacionesProductos.get(i);
//                mejorProducto = nombresProductos.get(i);
//            }
//        }
//
//        System.out.println("El producto con la mejor calificación promedio es: " + mejorProducto);
//        System.out.println("Calificación promedio: " + promedioCalificaciones);
//
//15
//System.out.print("Ingrese la cantidad de electrodomésticos: ");
//        int numElectrodomesticos = sc.nextInt();
//
//        double[] consumos = new double[numElectrodomesticos];
//        double[] rendimientos = new double[numElectrodomesticos];
//
//        for (int i = 0; i < numElectrodomesticos; i++) {
//            System.out.print("Ingrese el consumo de energía (kWh) del electrodoméstico " + (i + 1) + ": ");
//            consumos[i] = sc.nextDouble();
//
//            System.out.print("Ingrese el rendimiento (potencia en vatios) del electrodoméstico " + (i + 1) + ": ");
//            rendimientos[i] = sc.nextDouble();
//        }
//
//      
//        double[] eficiencias = new double[numElectrodomesticos];
//        for (int i = 0; i < numElectrodomesticos; i++) {
//            eficiencias[i] = rendimientos[i] / consumos[i];
//        }
//
//      
//        System.out.println("Eficiencias energéticas de los electrodomésticos:");
//        for (int i = 0; i < numElectrodomesticos; i++) {
//            System.out.println("Electrodoméstico " + (i + 1) + ": " + eficiencias[i]);
//        }
//16
//
//System.out.print("Ingrese el costo de alquiler del lugar: $");
//        double costoAlquiler = sc.nextDouble();
//
//        System.out.print("Ingrese el costo del catering: $");
//        double costoCatering = sc.nextDouble();
//
//        System.out.print("Ingrese el costo del entretenimiento: $");
//        double costoEntretenimiento = sc.nextDouble();
//
//        System.out.print("Ingrese otros gastos (si no hay, ingrese 0): $");
//        double otrosGastos = sc.nextDouble();
//
//        // Calcular el costo total del evento
//        double costoTotal = costoAlquiler + costoCatering + costoEntretenimiento + otrosGastos;
//
//        System.out.println("El costo total del evento corporativo es: $" + costoTotal);}  

//17
//System.out.print("Ingrese la cantidad de clientes: ");
//        int numClientes = sc.nextInt();
//
//        int[] puntuaciones = new int[numClientes];
//        int sumaPuntuaciones = 0;
//
//        for (int i = 0; i < numClientes; i++) {
//            System.out.print("Ingrese la puntuación del cliente " + (i + 1) + " (1-10): ");
//            puntuaciones[i] = sc.nextInt();
//            sumaPuntuaciones += puntuaciones[i];
//        }
//
//        double promedioSatisfaccion = (double) sumaPuntuaciones / numClientes;
//        System.out.println("El promedio de satisfacción del cliente es: " + promedioSatisfaccion);


//18
//System.out.print("Ingrese la cantidad de metas cumplidas: ");
//        int metasCumplidas = sc.nextInt();
//
//        System.out.print("Ingrese el total de metas establecidas: ");
//        int totalMetas = sc.nextInt();
//
//        // Calcular el porcentaje de cumplimiento
//        double porcentajeCumplimiento = (double) metasCumplidas / totalMetas * 100;
//
//        System.out.println("El porcentaje de cumplimiento de metas es: " + porcentajeCumplimiento + "%");
//19
//    System.out.print("Ingrese la capacidad total del almacén (m³): ");
//        double capacidadTotal = sc.nextDouble();
//
//        System.out.print("Ingrese la cantidad de espacio ocupado (m³): ");
//        double espacioOcupado = sc.nextDouble();
//
//        // Calcular la capacidad restante
//        double capacidadRestante = capacidadTotal - espacioOcupado;
//
//        System.out.println("La capacidad restante de almacenamiento es: " + capacidadRestante + " m³");
 //20
//     System.out.print("Ingrese la distancia recorrida (en kilómetros): ");
//        double distanciaRecorrida = sc.nextDouble();
//
//        System.out.print("Ingrese la tarifa total del viaje: $");
//        double tarifaTotal = sc.nextDouble();
//
//        // Calcular el costo por kilómetro
//        double costoPorKilometro = tarifaTotal / distanciaRecorrida;
//
//        System.out.println("El costo por kilómetro del viaje es: $" + costoPorKilometro);
    }
}
   
   
