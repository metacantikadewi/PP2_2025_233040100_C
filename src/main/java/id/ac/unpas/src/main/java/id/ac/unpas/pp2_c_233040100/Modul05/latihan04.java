package id.ac.unpas.pp2_c_233040100.Modul05;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class latihan04 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout - 5 Komponen");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Label utama untuk menampilkan pesan 
                JLabel label = new JLabel("Label ada di Atas (NORTH)", JLabel.CENTER);

                // Membuat tombol-tombol
                // buttonNorth tidak diperlukan karena label sudah di NORTH
                JButton buttonSouth = new JButton("SOUTH");
                JButton buttonWest = new JButton("WEST");
                JButton buttonEast = new JButton("EAST");
                JButton buttonCenter = new JButton("CENTER");

                // Aksi untuk masing-masing tombol (mereka semua mengubah 'label')
                buttonSouth.addActionListener(e -> label.setText("Tombol SOUTH diklik!"));
                buttonWest.addActionListener(e -> label.setText("Tombol WEST diklik!"));
                buttonEast.addActionListener(e -> label.setText("Tombol EAST diklik!"));
                buttonCenter.addActionListener(e -> label.setText("Tombol CENTER diklik!"));

                // Menambahkan komponen ke frame
                frame.add(label, BorderLayout.NORTH);
                frame.add(buttonSouth, BorderLayout.SOUTH);
                frame.add(buttonWest, BorderLayout.WEST);
                frame.add(buttonEast, BorderLayout.EAST);
                frame.add(buttonCenter, BorderLayout.CENTER);

                frame.setVisible(true);
            }
        });
    }
}