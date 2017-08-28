import java.util.Scanner;
public class Main
    { 
    
    private String Cuenta="0";
    Scanner lectura = new Scanner(System.in);    

    public Main()
    {
        CuentaDeAhorros ahorro1 = new CuentaDeAhorros("Cuenta # 1",200000, 4);
        CuentaDeAhorros ahorro2 = new CuentaDeAhorros("Cuenta # 2",300000, 5);   
        System.out.println("----------------------------------------");
        System.out.println("Bienvenido al sistema de administración de cuenta de ahorros");
        System.out.println();        
        System.out.println("Puede realizar retiros, depositos, abonar intereses y consultar informacion de la cuenta, por favor seleccione la cuenta que desea operar:");        
        while(!Cuenta.equals("3")){
            System.out.println();        
            System.out.println("Introduzca '1': Cuenta de ahorros # 1 - Saldo: $ "+ ahorro1.Saldo +" - Interes anual "+ ahorro1.Interes + "%");
            System.out.println("Introduzca '2': Cuenta de ahorros # 2 - Saldo: $ "+ ahorro2.Saldo +" - Interes anual "+ ahorro2.Interes + "%");
            System.out.println("Introduzca '3': Salir");
            Cuenta = lectura.nextLine();
            while((Cuenta.equals(1))||(Cuenta.equals(2))||(Cuenta.equals(3))){
                System.out.println("valor Invalido: "+Cuenta);
                System.out.println("Introduzca '1': Cuenta de ahorros # 1 - Saldo: $ 200.000 - Interes anual 4%");
                System.out.println("Introduzca '2': Cuenta de ahorros # 2 - Saldo: $ 300.000 - Interes anual 5%");
                System.out.println("Introduzca '3': Salir");                
                Cuenta = lectura.nextLine();
            }
            if(Cuenta.equals("1"))
            ahorro1.menu();
            if(Cuenta.equals("2"))
            ahorro2.menu();            
        }
        System.out.println("Gracias por usar nuestros servicios");
    }
}


