import java.util.Scanner;
import java.util.Stack;


public class Metodos {
    Scanner sc = new Scanner(System.in);
    Stack<PaginaWeb> historial = new Stack<>();

    public Stack<PaginaWeb> VisitarPagina() {
        
        boolean bandera = true;
        int opt = 0;
        
        while (bandera){
            PaginaWeb o = new PaginaWeb();
            System.out.println("Ingrese la Url");
            o.setUrl(sc.nextLine());
            System.out.println("Ingrese el titulo de la pagina");
            o.setTitulo(sc.nextLine());
            System.out.println("Ingrese la fecha de ingreso");
            o.setFecha(sc.nextLine());
            historial.push(o);

            System.out.println("Desea Visitar mas paginas? 1: Si   2:No");

            while (!sc.hasNextInt()){
                System.out.println("ingrese una opcion valida");

            }
            opt = sc.nextInt();
            sc.nextLine();

            if(opt == 2){
                bandera = false;
            }


        }
        return historial;
    }
    
    public void Retroceder(){
        if(!historial.isEmpty()){
            
        }
    }
}
