
import java.util.logging.Level;
import java.util.logging.Logger;

public class Scientific extends javax.swing.JFrame {

    XuLy xuLy = new XuLy();
    double ans=0;
    double m=0;
    
    // Variables declaration
    private javax.swing.JButton Ans;
    private javax.swing.JButton am;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chia;
    private javax.swing.JButton cong;
    private javax.swing.JButton cos;
    private javax.swing.JButton dauPhay;
    private javax.swing.JRadioButton degrees;
    private javax.swing.JButton dongNgoac;
    private javax.swing.JButton e;
    private javax.swing.JButton giaiThua;
    private javax.swing.JTextArea hienThi;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ketQua;
    private javax.swing.JButton ln;
    private javax.swing.JButton log;
    private javax.swing.JButton luyThua;
    private javax.swing.JButton mCong;
    private javax.swing.JButton mTru;
    private javax.swing.JButton mc;
    private javax.swing.JButton moNgoac;
    private javax.swing.JButton mr;
    private javax.swing.JButton ms;
    private javax.swing.JButton nhan;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton pi;
    private javax.swing.JRadioButton radian;
    private javax.swing.JButton sin;
    private javax.swing.JButton sqrt;
    private javax.swing.JMenuItem standard;
    private javax.swing.JButton tan;
    private javax.swing.JButton tru;
    private javax.swing.JButton xoa;
    private javax.swing.JButton xoaTungSo;
    
    public Scientific() {
        initComponents();
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        ketQua = new javax.swing.JButton();
        luyThua = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        mCong = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        cong = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        dauPhay = new javax.swing.JButton();
        mr = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        mc = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        xoaTungSo = new javax.swing.JButton();
        dongNgoac = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        ln = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        log = new javax.swing.JButton();
        e = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        moNgoac = new javax.swing.JButton();
        giaiThua = new javax.swing.JButton();
        Ans = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        degrees = new javax.swing.JRadioButton();
        radian = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hienThi = new javax.swing.JTextArea();
        mTru = new javax.swing.JButton();
        am = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        standard = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jButton1.setText("jButton1");
        
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
        
        
        
        }
        }
