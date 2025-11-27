/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040100.Modul06.newpackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author metac
 */
public class KonverterSuhu {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Konverter Suhu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JLabel labelC = new JLabel("Celcius:");
        JTextField inputC = new JTextField(10);
        JButton btnKonversi = new JButton("Konversi");
        JLabel labelF = new JLabel("Fahrenheit:");
        JLabel hasil = new JLabel("");

        frame.add(labelC);
        frame.add(inputC);
        frame.add(btnKonversi);
        frame.add(labelF);
        frame.add(hasil);

        // Event handling untuk tombol konversi
        btnKonversi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double c = Double.parseDouble(inputC.getText());
                    double f = (c * 9 / 5) + 32;
                    hasil.setText(String.format("%.2f °F", f));
                } catch (NumberFormatException ex) {
                    hasil.setText("Input tidak valid!");
                }
            }
        });

        frame.setVisible(true);
    }
}