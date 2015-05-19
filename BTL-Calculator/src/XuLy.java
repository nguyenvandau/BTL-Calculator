import java.util.Stack;

public class XuLy {

	private Stack<DuLieu> nhap = new Stack<DuLieu>();
	private Stack<DuLieu> bieuThuc = new Stack<DuLieu>();
	private Stack<DuLieu> ketQua = new Stack<DuLieu>();
	private boolean ra = false;
	private double ans = 0;
	private double m = 0;

	public final int SO = 0; // So, dau phay
	public final int UU_TIEN_1 = 1; // sin, cos
	public final int UU_TIEN_2 = 2; // luy thua
	public final int UU_TIEN_3 = 3; // nhan chia
	public final int UU_TIEN_4 = 4; // cong tru
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

	public void xoaTatCa() {
		nhap.clear();
		bieuThuc.clear();
		ketQua.clear();
	}

	public void them(String s, int i) {
		DuLieu data = new DuLieu();
		data.set(s, i);
		nhap.push(data);
	}

	public void xoa() throws Exception {
		if (nhap.empty()) {
			throw new Exception();
		} else
			nhap.pop();
	}

	public String hienThi() throws Exception {
		if (nhap.empty()) {
			throw new Exception();
		} else {
			Stack<DuLieu> t = new Stack<DuLieu>();
			String s = "";

			while (nhap.empty() == false) {
				t.push(nhap.pop());
			}

			while (t.empty() == false) {
				s = s + t.peek().getGiaTri();
				nhap.push(t.pop());
			}

			return s;
		}

	}

	public double tinh() throws Exception {
		if (bieuThuc.empty()){
			throw new Exception();
		}
		
		TinhToan tinhToan = new TinhToan();
		Stack<DuLieu> tg = new Stack<DuLieu>();
		
		while (bieuThuc.empty() == false) {
			tg.push(bieuThuc.pop());
		}
		
		while (tg.empty() == false) {
			try {
				switch (tg.peek().getDanhDau()) {
				case SO:
					ketQua.push(tg.pop());
					break;
				case UU_TIEN_1:
				case GIAI_THUA:
					DuLieu d1 = new DuLieu();
					double tt1 = tinhToan.tinh(tg.pop().getGiaTri(), Double.parseDouble(ketQua.pop().getGiaTri()), ra);
					d1.set(String.valueOf(tt1), 0);
					ketQua.push(d1);
					break;
				case UU_TIEN_2:
				case UU_TIEN_3:
				case UU_TIEN_4:
					DuLieu d2 = new DuLieu();
					double tt2 = tinhToan.tinh(tg.pop().getGiaTri(), Double.parseDouble(ketQua.pop().getGiaTri()), Double.parseDouble(ketQua.pop().getGiaTri()));
					d2.set(String.valueOf(tt2), SO);
					ketQua.push(d2);
					break;
				default: throw new Exception();
				}
			} catch (Exception e){
				throw new Exception();
			}
		}
		return Double.parseDouble(ketQua.pop().getGiaTri());
	}
}
