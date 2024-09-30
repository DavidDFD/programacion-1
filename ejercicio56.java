import java.util.Scanner;

public class ejercicio56 {

    public static void main(String[] args) {
      
// notas de los estudiantes 
Scanner leer = new Scanner(System.in);
System.out.print("Digite cantidad de estudiantes: ");
int estudiantes = leer.nextInt();
double nota = 0.0;
int aprobados =0, noaprobados = 0;

for(int i = 1; i<= estudiantes; i++){
System.out.println("Nota estudiante" + i +": ");
nota = leer.nextDouble();

if (nota >=5.0){
    aprobados++;

}else{
    noaprobados++;
}
}
System.out.println("aprobados:" + aprobados + "noaprobados:" + noaprobados);




    }
}