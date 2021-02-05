import java.util.Scanner;

public class Puntos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidadAlumnos = 0;

        System.out.println("Ingrese cantadidad de alumnos");
        cantidadAlumnos=leer.nextInt();

        String[] nombre = new String[cantidadAlumnos];
        String AuxiliarNombre = "";
        int[] nota1 = new int[cantidadAlumnos],nota2 = new int[cantidadAlumnos],nota3 = new int[cantidadAlumnos];
        double[] promedioAlumno=new double[cantidadAlumnos];
        double notaAlta = 0, acumuladorPromedios = 0,promedioGrupo=0,acumulador = 0;

        for (int i=0;i<cantidadAlumnos;i++){
            System.out.println("Ingrese nombre del alumno");
            nombre[i]=leer.next();
            System.out.println("Ingrese nota 1");
            nota1[i]=leer.nextInt();
            System.out.println("Ingrese nota 2");
            nota2[i]=leer.nextInt();
            System.out.println("Ingrese nota 3");
            nota3[i]=leer.nextInt();
            promedioAlumno[i]=nota1[i]+nota2[i]+nota3[i];
            acumuladorPromedios=promedioAlumno[i]/3;
            System.out.println("El promedio de notas del alumno "+nombre[i]+" es "+acumuladorPromedios);

           if(acumuladorPromedios>notaAlta){
               notaAlta=acumuladorPromedios;
               AuxiliarNombre=nombre[i];
           }

           promedioGrupo=acumuladorPromedios+acumulador;
           acumulador=acumuladorPromedios;

        }
        System.out.println("El promedio del grupo es "+promedioGrupo/cantidadAlumnos);
        System.out.println("El alumno con la nota mas alta es "+AuxiliarNombre+" su nota promedio fue "+notaAlta);
    }
}
