
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class FrameGame extends JFrame {
	
	PanelGame panel;
	
	FrameGame() {
		panel = new PanelGame();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
