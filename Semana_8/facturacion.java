import javax.swing.JOptionPane;

/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para
 * gestionar las facturas. En cada factura figura: el codigo del articulo, la cantidad
 * vendida en litros y el precio por litro. Se pide de 5 facturas introducidas:
 * Facturacion total, cantidad en litros vendidos del articulo 1 y cuantas facturas se 
 * emitieron de mas de $600.
 */

public class facturacion {
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1=0,conteoMas600=0;
        float precioLitro, importeFactura, facturacionTotal=0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N" + i + "\n Digite el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N" + i + "\n Digite la cantidad de litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N" + i + "\n Digite el precio por litro: "));

            importeFactura = (float) litros * precioLitro; //Importe por factura
            facturacionTotal += importeFactura; //Suma de las facturas

            if (codigo == 1) {
                litrosArticulo1 += litros;
            }
            if (importeFactura > 600) {
                conteoMas600++;
            }
        }

        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total: " + facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: " + litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: " + conteoMas600);
    }
}
