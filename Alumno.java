public class Alumno {
    private String nombre; // atributo tipo String
    private int[] calificaciones; // atributo tipo array

    public Alumno(String nombre, int[] calificaciones) {
        if (calificaciones.length != 5) {
            throw new IllegalArgumentException("Debe haber exactamente 5 calificaciones.");
        }
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Primer método: calcularPromedio
    public double calcularPromedio() {
        int suma = 0;
        for (int cal : calificaciones) {
            suma += cal;
        }
        return suma / (double) calificaciones.length;
    }

    // Segundo método: obtenerCalificacionFinal
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) return 'F';
        else if (promedio <= 60) return 'E';
        else if (promedio <= 70) return 'D';
        else if (promedio <= 80) return 'C';
        else if (promedio <= 90) return 'B';
        else return 'A';
    }

    // Tercer método: imprimirResultados (recibe parámetros)
    public void imprimirResultados(String nombre, double promedio, char calificacionFinal) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        int[] calificaciones = {85, 78, 92, 88, 75};
        Alumno alumno = new Alumno("Juan Pérez", calificaciones);
        double promedio = alumno.calcularPromedio();
        char calificacionFinal = alumno.obtenerCalificacionFinal(promedio);
        alumno.imprimirResultados(alumno.nombre, promedio, calificacionFinal);
    }
}