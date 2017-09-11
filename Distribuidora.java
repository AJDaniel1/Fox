import java.util.Scanner;

public class Distribuidora{
  Scanner scanner= new Scanner(System.In)
  public Fabrica(String marca, String modelo){
    String char opcion;
    System.out.println ("Por favor introduzca la marca del Vehiculo: ");
    this.marca= scanner.text();
    System.out.println ("Por favor introduzca el modelo del Vehiculo: ");
    this.marca= scanner.text();
    
    System.out.println ("Por favor introduzca que tipo de vehiculo desea: ");
    System.out.println ("1.- Automovil  2.- Motocicleta");
    this.opcion= scanner.text();
    if(opcion==Automovil){
      Automovil miAutomovil = new Automovil(String Color);
      System.out.println ("Por favor introduzca el color del Automovil: ");
      this.color=scanner.text();
        Llanta miLlanta = new Llantas(String Material, int diametro, int presion);
      System.out.println ("Por favor introduzca el material de las llantas del Automovil: ");
      this.llanta = scanner.text();
      System.out.println ("Por favor introduzca diametro de las llantas del Automovil: ");
      this.diametro = scanner.text();
      if(diametro==0){
        System.out.println ("Por favor introduzca un valor mayor a 0: ");
      }
      else:{
      }
      System.out.println ("Por favor introduzca la presion de las llantas del Automovil: ");
      this.presion = scanner.text();
      if(presion==0){
        System.out.println ("Por favor introduzca un valor mayor a 0: ");
      }
      else:{
      }
      
      Motor  miMotor = new Motor(String marca, String modelo, int potencia);
      System.out.println ("Por favor introduzca la marca del motor del automovil: ");
      System.out.println ("Por favor introduzca el modelo del motor del automovil : ");
      Quemacocos miQuemacosos = new Quemacocos(Boolean electrico);
      System.out.println ("Quiere tener quemacocos en su automovil?: ");
    }
    if(opcion==Motocicleta){
     Motocicleta miMotocicleta= new Motocicleta(String Tipo); 
      System.out.println ("Por favor introduzca el material de las llantas de la motocicleta: ");
      Llanta miLlanta = new Llantas(String Material, int diametro, int presion);
      System.out.println ("Por favor introduzca el material de las llantas de la motocicleta: ");
      this.llanta = scanner.text();
      System.out.println ("Por favor introduzca diametro de las llantas de la motocicleta: ");
      this.diametro = scanner.text();
      if(diametro==0){
        System.out.println ("Por favor introduzca un valor mayor a 0: ");
      }
      else:{
      }
      System.out.println ("Por favor introduzca la presion de las llantas de la motocicleta: ");
      this.presion = scanner.text();
      if(presion==0){
        System.out.println ("Por favor introduzca un valor mayor a 0: ");
      }
      else:{
      }
      
      Motor  miMotor = new Motor(String marca, String modelo, int potencia);
      System.out.println ("Por favor introduzca la marca del motor de la motocicleta: ");
      System.out.println ("Por favor introduzca el modelo del motor de la motocicleta : ");
      
      Silenciador miSilenciador = new Silenciador( public void SuprimirRuido);
      public void SuprimirRuido{
      }
      
    }
      
    
  }
  
}
