import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MenuUI extends JFrame {
	public MenuUI(){
		setTitle("Sistema Restaurante");
		setSize(800,600);
		setBackground(Color.black);
		Container container = getContentPane();
		container.add(new TxtPanel());
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("Our Dream.png");
		setIconImage(img);
		this.addWindowListener(new WindowListener() {
			public void windowActivated(WindowEvent evWindow) {}
			public void windowClosed(WindowEvent evWindow) {}
			public void windowClosing(WindowEvent evWindow) {
				closeWindow();
			}
			public void windowDeactivated(WindowEvent evWindow) {}
			public void windowDeiconified(WindowEvent evWindow) {}
			public void windowIconified(WindowEvent evWindow) {}
			public void windowOpened(WindowEvent evWindow) {}
		});
		this.setVisible(true);
	}
	public void closeWindow() {
		System.exit(0);
	}

class TxtPanel extends JPanel {
	public void paintComponent(Graphics graph) {
		setForeground(Color.white);
		Font fonte = new Font("Courier New", Font.PLAIN, 14);
		graph.setFont(fonte);
		graph.drawString("Bem vindo ao sistema do Restaurante\n", 20, 50);
		graph.drawString("O que deseja fazer?", 20, 70);
	}
}
	
	public static void main(String[] args) {
		JFrame window = new MenuUI();
		window.setVisible(true);

	}

}
