
package PacoteJava;
import javax.swing.JOptionPane;
public class Aumento {
    public static void main(String[] args) {
        double salario = 0;
        double percentual = 0;
        double num1 = 0;
        double calcular = 0;
       double recebido =0;
        String aux;
      
        aux = JOptionPane.showInputDialog(null, "Insira o salario: ", "Salario", -1);
        aux = aux.replace(',', '.');
        salario = Double.parseDouble(aux);
       
        aux = JOptionPane.showInputDialog(null, "Insira o porcentual: ", "percentual", -1); 
         percentual = Double.parseDouble(aux);
        percentual= salario+(salario*(percentual/100));  
        
        calcular =  (percentual- salario);
        JOptionPane.showMessageDialog(null, "Salario: R$ " + salario + "\n porcentagem: " +percentual+ "\n Valor do aumento " + calcular , "calculo", -1);
        
        /*
        
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
*/

    }

}

    
