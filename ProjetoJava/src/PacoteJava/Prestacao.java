package PacoteJava;

import javax.swing.JOptionPane;

public class Prestacao {

    public static void main(String[] args) {
        double salario = 0;
        double parcelas = 0;
        double calcular = 0;
        String aux;

        aux = JOptionPane.showInputDialog(null, "Insira seu salario bruto: ");
        aux = aux.replace(',', '.');
        salario = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o valor de cada parcela: ");
        parcelas = Double.parseDouble(aux);
        parcelas = (salario * 30 / 100);
        if (parcelas < salario) {
            JOptionPane.showMessageDialog(null, "emprestimo concedido");
        }
        else
            JOptionPane.showMessageDialog(null, "Emprestimo negado");
        }

        JOptionPane.showMessageDialog(null, calcular + aux);

    }

}
