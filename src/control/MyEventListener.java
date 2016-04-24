package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GUI;
import view.GUI2;

public class MyEventListener implements ActionListener {
	
	GUI gui;
	
	public MyEventListener(GUI gui) {
		this.gui = gui;
	}
	

	public MyEventListener(GUI2 gui2) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void actionPerformed(ActionEvent e) {
//		String text = gui.lb.getText();
//		gui.label.setText(text);
//		gui.tf.setText("");
		
	}

}
