package org.noip.staticattic.world;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.noip.staticattic.GUI.MainWindow;
import org.noip.staticattic.entities.Tile;
import org.noip.staticattic.entities.Tile.Type;

public class EnvironmentHandler implements Runnable {

	private MainWindow main;
	
	public EnvironmentHandler(MainWindow main) {
		
		this.main = main;
		
	}
	
	@Override
	public void run() {
	
		Tile[][] array = main.getPlayer().getCurrentEnvironment().getArray();
		
		for (Tile[] row : array) {
			
			for (Tile e : row) {
				
				if (e.getType().equals(Type.GRASS)) {
					
					try {
						
						e.setIcon(new ImageIcon(ImageIO.read(main.getClass().getResource("/resources/img/tiles/grass.fw.png"))));
						
					} catch (Exception e1) {
						
						try {
							
							e.setIcon(new ImageIcon(ImageIO.read(new File(System.getProperty("user.home")+"/village/grass.fw.png"))));
							
						} catch (Exception e2) {
							
							e2.printStackTrace();
							
						}
						
					}
					
				}
				
				JLabel lbl = new JLabel(e.getIcon());
				lbl.setBounds(e.getLocation().getX(), e.getLocation().getY(), 48, 48);
				
				main.mainpanel.add(lbl);
				
			}
			
		}
		
		main.mainpanel.repaint();
		
	}

}
