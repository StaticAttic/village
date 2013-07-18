package org.noip.staticattic.GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.noip.staticattic.GUI.Events.ShowMenuScreen;
import org.noip.staticattic.GUI.Events.ShowTitleScreen;

public class MainWindow extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	public Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(3);
	private UIHandler handler = new UIHandler();
	public JPanel mainpanel;
	
	public MainWindow() {
		
		this.setTitle("Village");
		this.setUndecorated(true);
		this.setResizable(false);
        this.setBounds(0,0,screensize.width, screensize.height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		ImageIcon icon = new ImageIcon();
		
		try {
			
			icon = new ImageIcon(ImageIO.read(getClass().getResource("/resources/img/icon.png")));
			
		} catch (Exception e) {
			
			try {
				
				icon = new ImageIcon(ImageIO.read(new File("C:/Users/Ollie/Pictures/icon.png")));
				
			} catch (IOException e1) {

				e1.printStackTrace();
				
			}
			
		}
		
		this.setIconImage(icon.getImage());
		
		mainpanel = new JPanel();
		mainpanel.setVisible(true);
		mainpanel.setLayout(null);
		
		this.add(mainpanel);
		this.setVisible(true);

		executor.scheduleAtFixedRate(handler, 0L, 20L, TimeUnit.MILLISECONDS);
		
		handler.addToQueue(new ShowTitleScreen(this, 0));
		handler.addToQueue(new ShowMenuScreen(this, 4000));
		
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		
		if (a.getActionCommand().equals("exit")) {
			
			ExitApplication();
			
		}
		
	}
	
	public void ExitApplication() {
		
		executor.shutdownNow();
		System.exit(0);
		
	}
	
}
