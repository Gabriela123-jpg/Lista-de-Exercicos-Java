
package PacoteJava;
import javax.swing.JOptionPane;

public class Aliquota {


    public static void main(String[] args) {
        double salario = 0;
        double aliquotainss = 0;
        double valordesconto = 0;
        double valorliquido = 0;
        String aux;
       
        try {
        aux = JOptionPane.showInputDialog(null, "Insira o salario: ", "Salario", -1);
        aux = aux.replace(',', '.');
        salario = Double.parseDouble(aux);
        
            if (salario <= 965.67) {
                aliquotainss = 8;
                valordesconto = (salario * 0.08);
                valorliquido = salario - valordesconto;
            } else if (salario >= 965.68 && salario <= 1609.45) {
                aliquotainss = 9;
                valordesconto = (salario * 0.09);
                valorliquido = salario - valordesconto;
            } else {
                aliquotainss = 11;
                valordesconto = (salario * 0.11);

                if (valordesconto > 354.07) {
                    valordesconto = 354.07;
                }
                valorliquido = salario - valordesconto;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "utilize o ponto para separar as casas decimais");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Salario: R$ " + salario + "\n Aliquotainss: " + aliquotainss + "\n Valor do Desconto: " + valordesconto + "\n Valor Liquido: " + valorliquido, "Resultado Salario", -1);

    }

}
    

