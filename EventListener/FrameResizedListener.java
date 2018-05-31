 package EventListener;

import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import GUI.MindmapArea;

public class FrameResizedListener implements ComponentListener  {
	JPanel mindmapArea;
	public FrameResizedListener(JPanel mindmapArea) {
		this.mindmapArea = mindmapArea;
	}
	
  public void componentHidden(ComponentEvent ce) {};
  public void componentShown(ComponentEvent ce) {};
  public void componentMoved(ComponentEvent ce) { };
 
  public void componentResized(ComponentEvent ce) {
	  	  mindmapArea.removeAll();	  
	  mindmapArea.revalidate();
	  mindmapArea.repaint();
		System.out.println("repainted");
  };


}

 
//public class JFrameResizing extends JFrame implements ComponentListener {
// 
//  JLabel label;
// 
//  JFrameResizing(){
//    label = new JLabel();
//    getContentPane().add(label);
//    getContentPane().addComponentListener(this);
//  }
// 
//  public void componentHidden(ComponentEvent ce) {};
//  public void componentShown(ComponentEvent ce) {};
//  public void componentMoved(ComponentEvent ce) { };
// 
//  public void componentResized(ComponentEvent ce) {
//    int height = this.getHeight();
//    int width = this.getWidth();
//    label.setText("Size: " + height + "x" + width);
//  };
// 
//  public static void main(String[] arguments) {
// 
//    JFrame.setDefaultLookAndFeelDecorated(true);
//    JFrameResizing frame = new JFrameResizing();
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setTitle("JFrame Resizing Example");
//    frame.setSize(300,150);
//    frame.setVisible(true);
// 
//  }
//}
 
