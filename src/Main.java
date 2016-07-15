import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello World!");

        Scanner sc= new Scanner(System.in);

       String newLine = System.getProperty("line.separator");

        int Codigo,Litros,LitrosProd1=0,Masde600=0;

        double Precio=0,ImporteFactura=0, FacturacionTotal=0;

        int i=0;

        bucle:
        while (i<=4)
        {
            System.out.println(newLine);
            System.out.println("INTRODUCE LOS DATOS DE LA FACTURA " +(i+1) +": ");
            System.out.println(newLine);
            System.out.println("- Codigo del producto en la factura " +(i+1) +": ");
            Codigo=sc.nextInt();
            System.out.println("- Cantidad de litros en la factura " +(i+1) +": ");
            Litros=sc.nextInt();

            switch (Codigo)
            {
                case 1:
                    Precio = 0.6;
                    break;
                case 2:
                    Precio = 3;
                    break;
                case 3:
                    Precio = 1.25;
                    break;
                default:

                    System.out.println("Codigo erroneo");
                    continue bucle;
            }

            i++;

            ImporteFactura=Precio*Litros;
            FacturacionTotal+=ImporteFactura;

            if (Codigo==1)
                LitrosProd1+=Litros;
            if (ImporteFactura>600)
                Masde600++;
        }
        System.out.println(newLine);
        System.out.println("## RESUMEN DE VENTAS ##");
        System.out.println(newLine);
        System.out.println("- Facturación Total: " +FacturacionTotal);
        System.out.println(newLine);
        System.out.println("- Cantidad de litros vendidos de producto 1: " +LitrosProd1);
        System.out.println(newLine);
        System.out.println("- Cantidad de facturas superiores a 600 euros: " +Masde600);

    }
}
