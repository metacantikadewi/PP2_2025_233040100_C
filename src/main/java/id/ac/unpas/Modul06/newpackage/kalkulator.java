/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040100.Modul06.newpackage;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author metac
 */
public class kalkulator {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Latihan 1 - Kalkulator Sederhana");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(5, 5));

        // Komponen layar atas
        JTextField layar = new JTextField();
        layar.setEditable(false);
        layar.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(layar, BorderLayout.NORTH);

        // Panel tombol (GridLayout)
        JPanel panelTombol = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] tombol = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        for (String teks : tombol) {
            panelTombol.add(new JButton(teks));
        }

        frame.add(panelTombol, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}