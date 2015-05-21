import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;



public class Standard extends javax.swing.JFrame {

	private XuLy xuLy = new XuLy();
	private double ans = 0;
	private double m = 0;

	private JButton nhan;
	private JButton chia;
	private JButton tru;
	private JButton cong;
	private JButton number0;
	private JButton number1;
	private JButton number2;
	private JButton number3;
	private JButton number4;
	private JButton number5;
	private JButton number6;
	private JButton number7;
	private JButton number8;
	private JButton number9;
	private JButton dauPhay;
	private JButton ketQua;
	private JButton mc;
	private JButton mCong;
	private JButton mTru;
	private JButton mr;
	private JButton ms;
	private JButton Ans;
	private JButton xoa;
	private JButton CE;
	private JTextArea hienThi;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JMenu view;
	private javax.swing.JMenuItem scientific;
	public Standard() {

		chia = new JButton();
		nhan = new JButton();
		tru = new JButton();
		cong = new JButton();	
		number0 = new JButton();
		number1 = new JButton();
		number2 = new JButton();
		number3 = new JButton();
		number4 = new JButton();
		number5 = new JButton();
		number6 = new JButton();
		number7 = new JButton();
		number9 = new JButton();
		number8 = new JButton();
		dauPhay = new JButton();
		ketQua = new JButton();
		mc = new JButton();
		mr = new JButton();
		ms = new JButton();
		mCong = new JButton();
		mTru = new JButton();
		Ans = new JButton();
		CE = new JButton();
		xoa = new JButton();  
		hienThi = new JTextArea();
		jMenuBar1 = new javax.swing.JMenuBar();
		view = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		scientific = new javax.swing.JMenuItem();


		chia.setFont(new java.awt.Font("Arial", 1, 12)); 
		chia.setText("/");
		chia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				chiaActionPerformed(evt);
			}
		});
		nhan.setFont(new java.awt.Font("Arial", 1, 12)); 
		nhan.setText("x");
		nhan.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nhanActionPerformed(evt);
			}

		});
		tru.setFont(new java.awt.Font("Arial", 1, 12)); 
		tru.setText("-");
		tru.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				truActionPerformed(evt);
			}
		});
		cong.setFont(new java.awt.Font("Arial", 1, 12)); 
		cong.setText("+");
		cong.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				congActionPerformed(evt);
			}
		});
		number0.setFont(new java.awt.Font("Arial", 1, 12)); 
		number0.setText("0");
		number0.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number0ActionPerformed(evt);
			}
		});
		number1.setFont(new java.awt.Font("Arial", 1, 12)); 
		number1.setText("1");
		number1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number1ActionPerformed(evt);
			}
		});
		number2.setFont(new java.awt.Font("Arial", 1, 12)); 
		number2.setText("2");
		number2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number2ActionPerformed(evt);
			}
		});


		number3.setFont(new java.awt.Font("Arial", 1, 12)); 
		number3.setText("3");
		number3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number3ActionPerformed(evt);
			}
		});

		number4.setFont(new java.awt.Font("Arial", 1, 12)); 
		number4.setText("4");
		number4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number4ActionPerformed(evt);
			}
		});
		number5.setFont(new java.awt.Font("Arial", 1, 12)); 
		number5.setText("5");
		number5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number5ActionPerformed(evt);
			}
		});

		number6.setFont(new java.awt.Font("Arial", 1, 12)); 
		number6.setText("6");
		number6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number6ActionPerformed(evt);
			}
		});

		number7.setFont(new java.awt.Font("Arial", 1, 12)); 
		number7.setText("7");
		number7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number7ActionPerformed(evt);
			}
		});
		number8.setFont(new java.awt.Font("Arial", 1, 12)); 
		number8.setText("8");
		number8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number8ActionPerformed(evt);
			}
		});
		number9.setFont(new java.awt.Font("Arial", 1, 12)); 
		number9.setText("9");
		number9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				number9ActionPerformed(evt);
			}
		});


		dauPhay.setFont(new java.awt.Font("Arial", 1, 12)); 
		dauPhay.setText(".");
		dauPhay.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dauPhayActionPerformed(evt);
			}
		});
		ketQua.setFont(new java.awt.Font("Arial", 1, 12)); 
		ketQua.setText("=");
		ketQua.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ketQuaActionPerformed(evt);
			}
		});


		mc.setFont(new java.awt.Font("Arial", 1, 12)); 
		mc.setText("MC");
		mc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mcActionPerformed(evt);
			}
		});

		mCong.setFont(new java.awt.Font("Arial", 1, 12)); 
		mCong.setText("M+");
		mCong.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mCongActionPerformed(evt);
			}
		});

		mTru.setFont(new java.awt.Font("Arial", 1, 12)); 
		mTru.setText("M-");
		mTru.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mTruActionPerformed(evt);
			}
		});
		mr.setFont(new java.awt.Font("Arial", 1, 12)); 
		mr.setText("MR");
		mr.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mrActionPerformed(evt);
			}
		});

		ms.setFont(new java.awt.Font("Arial", 1, 12)); 
		ms.setText("MS");
		ms.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				msActionPerformed(evt);
			}
		});
		Ans.setFont(new java.awt.Font("Arial", 1, 12)); 
		Ans.setText("Ans");
		Ans.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AnsActionPerformed(evt);
			}
		});
		xoa.setFont(new java.awt.Font("Arial", 1, 12)); 
		xoa.setText("C");
		xoa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xoaActionPerformed(evt);
			}
		});
		CE.setFont(new java.awt.Font("Arial", 1, 12)); 
		CE.setText("CE");
		CE.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CEActionPerformed(evt);
			}
		});
		view.setBackground(new java.awt.Color(0, 0, 0));
		view.setText("View");
		view.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				viewActionPerformed(evt);
			}
		});

		jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem2.setBackground(new java.awt.Color(0, 0, 0));
		jMenuItem2.setText("Standard");
		jMenuItem2.setSelected(true);
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		view.add(jMenuItem2);

		scientific.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
		scientific.setBackground(new java.awt.Color(0, 0, 0));
		scientific.setText("Scientific");
		scientific.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				scientificActionPerformed(evt);
			}
		});
		view.add(scientific);

		jMenuBar1.add(view);

		setJMenuBar(jMenuBar1);
		hienThi.setEditable(false);
		hienThi.setColumns(20);
		hienThi.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
		hienThi.setRows(2);
		jScrollPane1.setViewportView(hienThi);
	}


	private void nhanActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(nhan.getText(), xuLy.UU_TIEN_3);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void chiaActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(chia.getText(), xuLy.UU_TIEN_3);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void truActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(tru.getText(), xuLy.UU_TIEN_4);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void congActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(cong.getText(), xuLy.UU_TIEN_4);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void number0ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number0.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void number1ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number1.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void number2ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number2.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void number3ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number3.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void number4ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number4.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void number5ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number5.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void number6ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number6.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void number7ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number7.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void number8ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number8.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void number9ActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(number9.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private void ketQuaActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			xuLy.hauTo();
			double kq = xuLy.tinh();
			ans = kq;
			xuLy.setAns(ans);
			hienThi.setText(hienThi.getText() + "\n" + String.valueOf(kq));
			xuLy.xoaTatCa();

		} catch (Exception ex) {
			hienThi.setText(hienThi.getText() + "\nError!");
		}
	}
	private void dauPhayActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(dauPhay.getText(), xuLy.SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


	private void mcActionPerformed(java.awt.event.ActionEvent evt) {
		m = 0;
		xuLy.setM(m);
	}

	private void mCongActionPerformed(java.awt.event.ActionEvent evt) {
		m++;
		xuLy.setM(m);
	}

	private void mTruActionPerformed(java.awt.event.ActionEvent evt) {
		m--;
		xuLy.setM(m);
	}
	private void mrActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them("M", xuLy.HANG_SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void msActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			xuLy.hauTo();
			double kq = xuLy.tinh();
			hienThi.setText(hienThi.getText() + "=> M\n" + String.valueOf(kq));
			xuLy.xoaTatCa();
			ans = kq;
			xuLy.setAns(ans);
			m = kq;
			xuLy.setM(m);
		} catch (Exception ex) {
			hienThi.setText(hienThi.getText() + "\nError!");
		}
	}
	private void AnsActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.them(Ans.getText(), xuLy.HANG_SO);
		try {
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void xoaActionPerformed(java.awt.event.ActionEvent evt) {
		xuLy.xoaTatCa();
		hienThi.setText("");
	}

	private void CEActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			xuLy.xoa();
			hienThi.setText(xuLy.hienThi());
		} catch (Exception ex) {
			hienThi.setText("");
		}
	}
	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void viewActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void scientificActionPerformed(java.awt.event.ActionEvent evt) {
		Scientific scientific = new Scientific();
		setVisible(false);
		scientific.setVisible(true);
	}
	
public static void main(String [] args) throws Exception {
    	
    	try {
    		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
    			if ("Nimbus".equals(info.getName())){
    				javax.swing.UIManager.setLookAndFeel(info.getClassName());
    				break;
    			}
    		}
    	} catch (ClassNotFoundException ex) {
    		java.util.logging.Logger.getLogger(Standard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    	} catch (InstantiationException ex) {
    		java.util.logging.Logger.getLogger(Standard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    	} catch (IllegalAccessException ex) {
    		java.util.logging.Logger.getLogger(Standard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
    		java.util.logging.Logger.getLogger(Standard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    	}
    	
    	java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Standard().setVisible(true);
			}
		});
    }
}
