package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import control.MyEventListener;
import pack1.OferteSejur;

public class GUI2 extends JFrame {

	public JTextArea ta;

	public GUI2() {

		// implementam o noua interfata swing care ar trebui sa afiseze ofertele
		// corespunzatoare fiecarui buton ( functioneaza doar primul buton )

		String pachet1 = "Pachet 1";
		String pachet2 = "Pachet 2";
		String pachet3 = "Pachet 3";

		// parcurgem stringul din fisier si il impartim in substriguri pentru a
		// afisa fiecare oferta

		StringBuilder sb1 = OferteSejur.citesteFisierul("OferteDubai.txt");
		String str1 = sb1.toString();
		int index1 = str1.indexOf("Pachet");
		int index2 = str1.indexOf("Pachet", index1 + 1);
		int index3 = str1.indexOf("Pachet", index2 + 1);

		String oferta1 = str1.substring(index1, index2);
		String oferta2 = str1.substring(index2, index3);
		String oferta3 = str1.substring(index3);

		String[] randuriOferta1 = oferta1.split("@");
		String[] randuriOferta2 = oferta2.split("@");
		String[] randuriOferta3 = oferta3.split("@");

		ta = new JTextArea(" ");
		ta.setBackground(Color.green);
		

		this.setVisible(false);
		this.setBackground(Color.CYAN);
		this.setSize(500, 400);

		// cream un buton care ar trebui sa salveze oferta aleasa de utilizator
		JButton butonFinal = new JButton("Salveaza");
		butonFinal.setBackground(Color.GRAY);
		butonFinal.setForeground(Color.BLUE);
		this.add(butonFinal, BorderLayout.SOUTH);
		MyEventListener listener = new MyEventListener(this);
		butonFinal.addActionListener(listener);

		// construim butoanele corespunzatoare fiecare oferte
		JRadioButton oferta1Button = new JRadioButton(pachet1);
		oferta1Button.addActionListener(new ActionListener() {

			// afisam oferta pentru fiecare buton
			@Override
			public void actionPerformed(ActionEvent e) {

				ta.setText(randuriOferta1[1] + (char) 10 + randuriOferta1[2] + (char) '\n' + randuriOferta1[3]
						+ (char) '\n' + randuriOferta1[4]);
			}
		});
		JRadioButton oferta2Button = new JRadioButton(pachet2);
		oferta2Button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(randuriOferta2[1] + (char) 10 + randuriOferta2[2] + (char) '\n' + randuriOferta2[3]
						+ (char) '\n' + randuriOferta2[4]);

			}
		});

		JRadioButton oferta3Button = new JRadioButton(pachet3);
		oferta3Button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(randuriOferta3[1] + (char) 10 + randuriOferta3[2] + (char) '\n' + randuriOferta3[3]
						+ (char) '\n' + randuriOferta3[4]);

			}
		});

		// definim butoanele
		ButtonGroup grup = new ButtonGroup();
		grup.add(oferta1Button);
		grup.add(oferta2Button);
		grup.add(oferta3Button);

		MyEventListener listener2 = new MyEventListener(this);
		// adaugam listeneri fiecarui buton
		oferta1Button.addActionListener(listener2);
		oferta2Button.addActionListener(listener2);
		oferta3Button.addActionListener(listener2);

		// aranjam butoane in coloana
		JPanel radioPanel = new JPanel(new GridLayout(3, 1));
		radioPanel.add(oferta1Button);
		radioPanel.add(oferta2Button);
		radioPanel.add(oferta3Button);

		radioPanel.add(oferta1Button);
		radioPanel.add(oferta2Button);
		radioPanel.add(oferta3Button);

		this.add(radioPanel, BorderLayout.WEST);
		this.add(ta, BorderLayout.CENTER);

	}

}
