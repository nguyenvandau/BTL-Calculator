import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;


public class Calculator {

}


public calf(String title) {
	super(title);
	addWindowListener(this);
	addKeyListener(this);

	cp = new CopyPaste();
	setBackground(Color.orange);
	setLayout(new GridLayout(1, 1));
	Menubar1 = new MenuBar();
	Menu1 = new Menu("Edit");
	menuitem1 = new MenuItem("&Copy");
	Menu1.add(menuitem1);
	menuitem1.addActionListener(this);
	menuitem2 = new MenuItem("&Paste");
	Menu1.add(menuitem2);
	menuitem2.addActionListener(this);
	menuitem3 = new MenuItem("&Exit");
	Menu1.add(menuitem3);
	menuitem3.addActionListener(this);
	Menubar1.add(Menu1);
	setMenuBar(Menubar1);

	