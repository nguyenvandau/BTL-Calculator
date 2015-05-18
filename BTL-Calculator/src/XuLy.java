import java.util.Stack;


public class XuLy {

	private Stack<DuLieu> nhap = new Stack<DuLieu>();
	private Stack<DuLieu> bieuThuc = new Stack<DuLieu>();
	private Stack<DuLieu> ketQua = new Stack<DuLieu>();
	private boolean ra = false;
	private double ans = 0;
	private double m = 0;
	
	public final int SO = 0; // So, dau phay
	public final int UU_TIEN_1 = 1; 	//sin, cos
	public final int UU_TIEN_2 = 2; 	// luy thua
	public final int UU_TIEN_3 = 3;		// nhan chia
	public final int UU_TIEN_4 = 4;		// cong tru
	public final int MO_NGOAC = 5;
	public final int DONG_NGOAC = 6;
	public final int HANG_SO = -2;
	public final int GIAI_THUA = -1;
	
	public void chon(boolean ra) {
		this.ra = ra;
	}
	
	public void setAns(double ans) {
		this.ans = ans;
	}
	
	public void setM(double m) {
		this.m = m;
	}
	
	public void xoaTatCa(){
		nhap.clear();
		bieuThuc.clear();
		ketQua.clear();
	}
	
	public void them(String s, int i){
		DuLieu data = new DuLieu();
		data.set(s, i);
		nhap.push(data);
	}
}
