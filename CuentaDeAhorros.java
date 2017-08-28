import java.util.Scanner;

public class CuentaDeAhorros
{
    String Nombre;
    double Saldo=0;
    double Interes=0;
    
    public CuentaDeAhorros(String N,int S, int I)
    {
        Nombre = N;
        Saldo=S;
        Interes=I;
    }
    
    public void obtener_saldo()
    {
        
        System.out.println("El saldo de la cuenta es $ " + Saldo);
    }
        public void obtener_interes()
    {
        
        System.out.println("El interes de la cuenta es " + Interes + "% anual");
    }
  
    public void retiro()
    {
        double Retiro=0;
        Scanner Lectura = new Scanner(System.in);
                
        System.out.println("Introduzca el valor a retirar ");
                Retiro=Lectura.nextInt();
                while ((Retiro>Saldo)||(Retiro<=0))
                {
                if(Retiro>Saldo)
                {
                System.out.println("Saldo insuficiente, tiene disponible $ "+ Saldo);
                System.out.println("introduzca un valor inferior a este saldo");
                    }                
                if(Retiro<=0)
                System.out.println("Transaccion invalida: Introduzca un valor superior a 0 e inferior a $ "+ Saldo);

                Retiro=Lectura.nextInt();                
                }

                if (Retiro<=Saldo)
                {
                    Saldo=Saldo-Retiro;
                System.out.println("Transacción exitosa: El nuevo saldo de su cuenta es $ "+ Saldo);
                }  
                
            }
            
    public void deposito()
    {
        int Deposito=0;
        Scanner Lectura = new Scanner(System.in);
                
        System.out.println("Introduzca el valor a depositar ");
                Deposito=Lectura.nextInt();
                while ((Deposito<=0))
                {
                System.out.println("Transaccion invalida: Introduzca un valor superior a 0");
                Deposito=Lectura.nextInt();                
                }
                Saldo=Saldo+Deposito;
                System.out.println("Transacción exitosa: El nuevo saldo de su cuenta es $"+ Saldo);
     }  
        
    public void intereses()
    {
        double Interes_mensual=0;
        
        Interes_mensual=Math.round((0.01*Interes)/12*Saldo);
        Saldo=Saldo+Interes_mensual;
        System.out.println("Transacción exitosa: Se abonaron los intereses del mes por un valor de $"+ Interes_mensual);
        obtener_saldo();
     }  

     public void menu()
    {
        String  Menu="0";
        Scanner Lectura = new Scanner(System.in);        
        while(!Menu.equals("6")){
        System.out.println();
        System.out.println();
        System.out.println("Cuenta seleccionada: "+ Nombre);
        System.out.println();
        System.out.println("Seleccione la operación a realizar:");
        System.out.println();        
        System.out.println("Introduzca '1': Consulta de saldo");
        System.out.println("Introduzca '2': Consulta de interes");     
        System.out.println("Introduzca '3': Retiro");     
        System.out.println("Introduzca '4': Deposito");     
        System.out.println("Introduzca '5': Abono de interes a cuenta");
        System.out.println("Introduzca '6': Menu Anterior");
        Menu = Lectura.nextLine();
            while((Menu.equals(1))||(Menu.equals(2))||(Menu.equals(3))||(Menu.equals(4))||(Menu.equals(5))||(Menu.equals(6))){

        System.out.println("valor Invalido: ");  
        System.out.println("Seleccione la operación a realizar:");
        System.out.println("Introduzca '1': Consulta de saldo");
        System.out.println("Introduzca '2': Consulta de interes");     
        System.out.println("Introduzca '3': Retiro");     
        System.out.println("Introduzca '4': Deposito");     
        System.out.println("Introduzca '5': Abono de interes a cuenta");
        System.out.println("Introduzca '6': Menu Anterior");
        Menu = Lectura.nextLine();
    }
        switch (Menu) {
        case "1":
        obtener_saldo();
        break;
        case "2":
        obtener_interes();
        break;
        case "3":
        retiro();
        break;
        case "4":
        deposito();
        break;
        case "5":
        intereses();
        break;
       }
      System.out.println("Presione enter para continuar");
      Lectura.nextLine();
     }
    }
}  
          
            
