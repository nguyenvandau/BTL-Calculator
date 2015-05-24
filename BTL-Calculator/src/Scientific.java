import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;


public class Scientific extends javax.swing.JFrame {

    XuLy xuLy = new XuLy();
    double ans=0;
    double m=0;
    
    
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
	private JButton am;
    private ButtonGroup buttonGroup1;   
    private JButton cos; 
    private JRadioButton degrees;
    private JButton dongNgoac;
    private JButton e;
    private JButton giaiThua;
    private JTextArea hienThi;
    private JButton jButton1;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;  
    private JButton ln;
    private JButton log;
    private JButton luyThua;
    private JButton moNgoac;  
    private JButton pi;
    private JRadioButton radian;
    private JButton sin;
    private JButton sqrt;
    private JMenuItem standard;
    private JButton tan;  
    private JButton xoaTungSo;  
    
    public Scientific() {
    	  initComponents();
    }

    private void initComponents() {
     
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
		xoa = new JButton();  
		hienThi = new JTextArea();	
        buttonGroup1 = new ButtonGroup();
        jButton1 = new JButton();
        ketQua = new JButton();
        luyThua = new JButton();
        sqrt = new JButton();
        jPanel1 = new JPanel();
        xoaTungSo = new JButton();
        dongNgoac = new JButton();
        sin = new JButton();
        ln = new JButton();
        cos = new JButton();
        log = new JButton();
        e = new JButton();
        tan = new JButton();
        pi = new JButton();
        moNgoac = new JButton();
        giaiThua = new JButton();
        Ans = new JButton();
        am = new JButton();
        jPanel2 = new JPanel();
        degrees = new JRadioButton();
        radian = new JRadioButton();
        jScrollPane1 = new JScrollPane();
        hienThi = new JTextArea();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        standard = new JMenuItem();
        jMenuItem1 = new JMenuItem();
        jButton1.setText("jButton1");
        


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
		
		am.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        	am.setText("(-)");
        	am.addActionListener(new java.awt.event.ActionListener() {
            		public void actionPerformed(java.awt.event.ActionEvent evt) {
                		amActionPerformed(evt);
        		}
        	});
		xoa.setFont(new java.awt.Font("Arial", 1, 12)); 
		xoa.setText("C");
		xoa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xoaActionPerformed(evt);
			}
		});
		
		luyThua.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        luyThua.setText("^");
        luyThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luyThuaActionPerformed(evt);
            }
        });

        sqrt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sqrt.setText("sqrt");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        xoaTungSo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        xoaTungSo.setText("EC");
        xoaTungSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaTungSoActionPerformed(evt);
            }
        });

        dongNgoac.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dongNgoac.setText(")");
        dongNgoac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dongNgoacActionPerformed(evt);
            }
        });
        moNgoac.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        moNgoac.setText("(");
        moNgoac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moNgoacActionPerformed(evt);
            }
        });
        sin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        ln.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ln.setText("ln");
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        e.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        e.setText("e");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        pi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pi.setText("pi");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        giaiThua.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        giaiThua.setText("!");
        giaiThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaiThuaActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(degrees);
        degrees.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        degrees.setSelected(true);
        degrees.setText("degrees");
        degrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesActionPerformed(evt);
            }
        });

        buttonGroup1.add(radian);
        radian.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radian.setText("radians");
        radian.setAutoscrolls(true);
        radian.setBorderPainted(true);
        radian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radianActionPerformed(evt);
            }
        });
        
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(radian, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                    .addComponent(degrees, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(degrees, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radian, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        
        jMenu1.setText("View");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        standard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        standard.setText("Standard");
        standard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardActionPerformed(evt);
            }
        });
        jMenu1.add(standard);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Scientific");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);
        hienThi.setEditable(false);
        hienThi.setColumns(20);
        hienThi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        hienThi.setRows(2);
        hienThi.setTabSize(2);
        jScrollPane1.setViewportView(hienThi);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tan, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(log, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cong, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pi, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number0, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dauPhay, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ans, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ketQua, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                    .addComponent(luyThua, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cos, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ln, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number4, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number5, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number6, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tru, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sin, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(giaiThua, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number7, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number8, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number9, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nhan, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(moNgoac, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dongNgoac, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(mc, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mr, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ms, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mCong, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(am, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chia, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(xoa, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoaTungSo, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                            .addComponent(mTru, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                            .addComponent(sqrt, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(mCong, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ms, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                            .addComponent(mr, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                            .addComponent(mc, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                            .addComponent(mTru, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(dongNgoac, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoa, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(chia, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(moNgoac, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(am, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(sin, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(number7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(number8, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(number9, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(giaiThua, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhan, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaTungSo, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(number6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(number5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(number4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ln, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tru, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(sqrt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(number3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(number2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(number1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tan, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cong, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(luyThua, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(dauPhay, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(number0, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(e, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(pi, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(Ans, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(ketQua, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        
    }

    private void ketQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketQuaActionPerformed
        try {        
            xuLy.hauTo();        
            double kq=xuLy.tinh();
            //ans=kq;
            xuLy.setAns(kq);
            hienThi.setText(hienThi.getText() + "\n" + String.valueOf(kq));
            xuLy.xoaTatCa();
            
            } catch (Exception ex) {
            hienThi.setText(hienThi.getText()+"\nError!");
        }
        
    }

    private void luyThuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luyThuaActionPerformed
        xuLy.them(luyThua.getText(), xuLy.UU_TIEN_2);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        xuLy.them(sqrt.getText(), xuLy.UU_TIEN_1);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCongActionPerformed
        m++;
        xuLy.setM(m);
    }

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaActionPerformed
        xuLy.them(chia.getText(), xuLy.UU_TIEN_3);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanActionPerformed
        xuLy.them(nhan.getText(), xuLy.UU_TIEN_3);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truActionPerformed
        xuLy.them(tru.getText(), xuLy.UU_TIEN_4);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congActionPerformed
        xuLy.them(cong.getText(), xuLy.UU_TIEN_4);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
        try {        
            xuLy.hauTo();        
            double kq=xuLy.tinh();
            hienThi.setText(hienThi.getText() + "=> M\n" + String.valueOf(kq));
            xuLy.xoaTatCa();
            //ans=kq;
            xuLy.setAns(kq);
            //m=kq;
            xuLy.setM(kq);
            } catch (Exception ex) {
            hienThi.setText(hienThi.getText()+"\nError!");
        }
    }

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        xuLy.xoaTatCa();
        hienThi.setText("");
    }

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        xuLy.them(number9.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        xuLy.them(number6.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        xuLy.them(number3.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void dauPhayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dauPhayActionPerformed
        xuLy.them(dauPhay.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrActionPerformed
        xuLy.them("M", xuLy.HANG_SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        xuLy.them(number8.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        xuLy.them(number5.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        xuLy.them(number2.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
        m=0;
        xuLy.setM(m);
    }

    private void xoaTungSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaTungSoActionPerformed
        try {
            xuLy.xoa();
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            hienThi.setText("");
        }
    }

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        xuLy.them(number7.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        xuLy.them(number4.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        xuLy.them(number1.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        xuLy.them(number0.getText(), xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void dongNgoacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dongNgoacActionPerformed
        xuLy.them(dongNgoac.getText(), xuLy.DONG_NGOAC);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        xuLy.them(sin.getText(), xuLy.UU_TIEN_1);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        xuLy.them(ln.getText(), xuLy.UU_TIEN_1);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        xuLy.them(cos.getText(), xuLy.UU_TIEN_1);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        xuLy.them(log.getText(), xuLy.UU_TIEN_1);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        xuLy.them(e.getText(), xuLy.HANG_SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        xuLy.them(tan.getText(), xuLy.UU_TIEN_1);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        xuLy.them(pi.getText(), xuLy.HANG_SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void moNgoacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moNgoacActionPerformed
        xuLy.them(moNgoac.getText(), xuLy.MO_NGOAC);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void amActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amActionPerformed
        xuLy.them("-", xuLy.SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void giaiThuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaiThuaActionPerformed
        xuLy.them(giaiThua.getText(), xuLy.GIAI_THUA);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    }

    private void radianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radianActionPerformed
        xuLy.chon(true);
    }

    private void degreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesActionPerformed
        xuLy.chon(false);
    }

    private void AnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnsActionPerformed
        xuLy.them(Ans.getText(), xuLy.HANG_SO);
        try {
            hienThi.setText(xuLy.hienThi());
        } catch (Exception ex) {
            Logger.getLogger(Scientific.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTruActionPerformed
        m--;
        xuLy.setM(m);
    }
    private void standardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardActionPerformed
        Standard standard = new Standard();
        setVisible(false);
        standard.setVisible(true);
    }
    
    
    public static void main(String args[]) {
        // Set the Nimbus look and feel
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Scientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scientific().setVisible(true);
            }
        });
    }
   
    }
