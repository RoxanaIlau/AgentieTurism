package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class GUI {

	private JFrame frame;

	public GUI2 gui2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		gui2 = new GUI2();
		// frame.getContentPane().setBackground(Color.PINK);
		try {
			frame.setContentPane(new JLabel(
					new ImageIcon(ImageIO.read(new File("palm.jpg")).getScaledInstance(800, 600, Image.SCALE_SMOOTH))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// frame.pack();
		frame.setSize(800, 600);
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 17));
		// frame.setBounds(400, 400, 354, 256);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblAgentiaVisImplinit = new JLabel("Your Perfect Tour");
		lblAgentiaVisImplinit.setForeground(Color.GREEN);
		lblAgentiaVisImplinit.setHorizontalAlignment(SwingConstants.LEFT);
		lblAgentiaVisImplinit.setFont(new Font("Calibri", Font.PLAIN, 25));

		JLabel label = new JLabel("");

		JLabel lblVaInvitaSa = new JLabel("Bucurati-va de cele mai bune oferte ale sezonului");
		lblVaInvitaSa.setForeground(Color.YELLOW);
		lblVaInvitaSa.setHorizontalAlignment(SwingConstants.LEFT);

		JLabel lblDestinatii = new JLabel("Destinatii:");
		lblDestinatii.setHorizontalAlignment(SwingConstants.LEFT);
		lblDestinatii.setForeground(Color.YELLOW);
		lblDestinatii.setFont(new Font("Calibri", Font.PLAIN, 30));

		JLabel lblExotice = new JLabel("Exotice");
		lblExotice.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lblExotice.setForeground(Color.GREEN);
		lblExotice.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSki = new JLabel("Ski");
		lblSki.setHorizontalAlignment(SwingConstants.CENTER);
		lblSki.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lblSki.setForeground(Color.BLUE);

		JLabel lblNewLabel = new JLabel("City Break");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setForeground(Color.RED);

		JButton btnDubai = new JButton("Dubai");
		btnDubai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui2.setVisible(true);

			}
		});

		JButton btnMexic = new JButton("Mexic");
		btnMexic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui2.setVisible(true);

			}
		});

		JButton btnTailanda = new JButton("Tailanda");
		btnTailanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui2.setVisible(true);
			}
		});

		JButton btnAustria = new JButton("Austria");
		btnAustria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui2.setVisible(true);

			}
		});

		JButton btnFranta = new JButton("Franta");
		btnFranta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui2.setVisible(true);

			}
		});

		JButton btnRomania = new JButton("Romania");
		btnRomania.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui2.setVisible(true);

			}
		});

		JButton btnRoma = new JButton("Roma");
		btnRoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui2.setVisible(true);

			}
		});

		JButton btnBarcelona = new JButton("Barcelona");
		btnBarcelona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui2.setVisible(true);

			}
		});

		JButton btnParis = new JButton("Paris");
		btnParis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui2.setVisible(true);

			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout
				.setHorizontalGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(50).addComponent(label))
								.addGroup(groupLayout.createSequentialGroup().addContainerGap()
										.addComponent(lblAgentiaVisImplinit, GroupLayout.DEFAULT_SIZE, 774,
												Short.MAX_VALUE)
										.addContainerGap())
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(261, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblExotice, GroupLayout.PREFERRED_SIZE, 103,
														GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 103,
												GroupLayout.PREFERRED_SIZE))
										.addGap(18))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblSki, GroupLayout.PREFERRED_SIZE, 103,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(btnRoma, GroupLayout.PREFERRED_SIZE, 100,
														GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(btnAustria, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnDubai, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 98,
														Short.MAX_VALUE)))
								.addGap(30)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnBarcelona, GroupLayout.PREFERRED_SIZE, 100,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnFranta, GroupLayout.PREFERRED_SIZE, 100,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnMexic, GroupLayout.PREFERRED_SIZE, 100,
												GroupLayout.PREFERRED_SIZE))
								.addGap(26)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnParis, GroupLayout.PREFERRED_SIZE, 100,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTailanda, GroupLayout.PREFERRED_SIZE, 100,
												GroupLayout.PREFERRED_SIZE)))
								.addComponent(btnRomania, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGap(56))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblVaInvitaSa).addGap(368))
				.addGroup(groupLayout.createSequentialGroup().addGap(252).addComponent(lblDestinatii)
						.addContainerGap(418, Short.MAX_VALUE)));
		groupLayout
				.setVerticalGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(6)
										.addComponent(lblAgentiaVisImplinit, GroupLayout.PREFERRED_SIZE, 36,
												GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(label)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblVaInvitaSa).addGap(13)
								.addComponent(lblDestinatii).addGap(28)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnMexic, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnDubai).addComponent(lblExotice).addComponent(btnTailanda))
				.addGap(81)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnRomania)
						.addComponent(btnAustria).addComponent(lblSki).addComponent(btnFranta))
				.addGap(73)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnRoma)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBarcelona).addComponent(btnParis)).addGap(209)));
		frame.getContentPane().setLayout(groupLayout);
	}

}
