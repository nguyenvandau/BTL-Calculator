import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Calf extends Frame implements WindowListener, ActionListener, KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Calf(String title) {
		super(title);
		addWindowListener(this);
		addKeyListener(this);
		
		setBackground(Color.BLUE);
		setLayout(new GridLayout(1, 1));
		MenuBar menuBar1 = new MenuBar();
		Menu menu1 = new Menu("Edit");
		
		MenuItem menuItem1 = new MenuItem("&Copy");
		menu1.add(menuItem1);
		menuItem1.addActionListener(this);
		
		MenuItem menuItem2 = new MenuItem("&Paste");
		menu1.add(menuItem2);
		menuItem2.addActionListener(this);
		
		MenuItem menuItem3 = new MenuItem("&Exit");
		menu1.add(menuItem3);
		menuItem3.addActionListener(this);
		
		menuBar1.add(menu1);
		setMenuBar(menuBar1);
		
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints contraints = new GridBagConstraints();
		setLayout(gridBag);
		contraints.weightx = 1;
		contraints.weighty = 1;
		
		Font bigFont = new Font("Courier", Font.BOLD, 14);
		TextField entryText = new TextField(20);
		contraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBag.setConstraints(entryText, contraints);
		add(entryText);
		entryText.setFont(bigFont);
		entryText.setEditable(false);
		entryText.setForeground(Color.BLACK);
		entryText.setBackground(Color.WHITE);
		entryText.addKeyListener(this);
		entryText.requestFocus();
		
		contraints.weightx = 1;
		contraints.weighty = 1;
		
		Panel companel = new Panel();
		
		contraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBag.setConstraints(companel, contraints);
		
		companel.setLayout(new GridLayout(1, 3, 5, 5));
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
