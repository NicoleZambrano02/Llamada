import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double t,costo;
    String d;
    String turno;
    Scanner n=new Scanner(System.in);
    System.out.println("Escriba el tiempo que dura la llamada");
    t=n.nextDouble();    
    if(t<=5){
      costo=(t*0.5);
    }
    else if(t<=8){
      costo=(t-5)*0.8+5;
    }
    else if(t<=10){
      costo=(t-8)*0.7+(3*0.8)+5;
    }
    else{
      costo=(t-10)*0.5+(2*0.7)+(3*0.8)+5;
    }
    Scanner a=new Scanner(System.in);
    System.out.println("Escriba el dia en el que trabaja");
    d=a.nextLine();
    if(d=="DOMINGO"){
        costo=(costo*0.03)+costo;
    }
    else{
          System.out.println("Escriba el turno en el que trabaja");
          turno=a.nextLine();
          if(turno=="MAT"){
            costo=(costo*0.15)+costo;
          }
          else{
            costo=(costo*0.1)+costo;
          }
        }
    
    System.out.println("Su costo total a pagar es: "+costo);  
  }
}