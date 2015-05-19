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
		if (bieuThuc.empty()) {
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
					double tt1 = tinhToan.tinh(tg.pop().getGiaTri(),
							Double.parseDouble(ketQua.pop().getGiaTri()), ra);
					d1.set(String.valueOf(tt1), 0);
					ketQua.push(d1);
					break;
				case UU_TIEN_2:
				case UU_TIEN_3:
				case UU_TIEN_4:
					DuLieu d2 = new DuLieu();
					double tt2 = tinhToan.tinh(tg.pop().getGiaTri(),
							Double.parseDouble(ketQua.pop().getGiaTri()),
							Double.parseDouble(ketQua.pop().getGiaTri()));
					d2.set(String.valueOf(tt2), SO);
					ketQua.push(d2);
					break;
				default:
					throw new Exception();
				}
			} catch (Exception e) {
				throw new Exception();
			}
		}
		return Double.parseDouble(ketQua.pop().getGiaTri());
	}

	public void hauTo() throws Exception {
		if (nhap.empty()) {
			throw new Exception();
		}

		Stack<DuLieu> tg = new Stack<DuLieu>();

		while (nhap.empty() == false) {
			tg.push(nhap.pop());
		}

		String s = new String("");
		Stack<DuLieu> phepTinh = new Stack<DuLieu>();

		while (tg.empty() == false) {
			switch (tg.peek().getDanhDau()) {

			case SO:
				s = s + tg.pop().getGiaTri();
				break;

			case UU_TIEN_1:
				phepTinh.push(tg.pop());
				break;

			case UU_TIEN_2:
				if (s.equals("") == false) {
					DuLieu d1 = new DuLieu();
					d1.set(s, SO);
					bieuThuc.push(d1);
					s = "";
				}
				while (phepTinh.empty() == false) {
					if (phepTinh.peek().getDanhDau() < tg.peek().getDanhDau()) {
						bieuThuc.push(phepTinh.pop());
					} else
						break;
				}
				phepTinh.push(tg.pop());
				break;

			case UU_TIEN_3:

			case UU_TIEN_4:
				if (s.equals("") == false) {
					DuLieu d4 = new DuLieu();
					d4.set(s, SO);
					bieuThuc.push(d4);
					s = "";
				}
				while (phepTinh.empty() == false) {
					if (phepTinh.peek().getDanhDau() <= tg.peek().getDanhDau()) {
						bieuThuc.push(phepTinh.pop());
					} else
						break;
				}
				phepTinh.push(tg.pop());
				break;

			case MO_NGOAC:
				if (s.equals("") == false) {
					DuLieu d2 = new DuLieu();
					d2.set(s, SO);
					bieuThuc.push(d2);
					s = "";
				}
				phepTinh.push(tg.pop());
				break;

			case DONG_NGOAC:
				if (s.equals("") == false) {
					DuLieu d4 = new DuLieu();
					d4.set(s, SO);
					bieuThuc.push(d4);
					s = "";
				}
				while (phepTinh.empty() == false) {
					if (phepTinh.peek().getDanhDau() != MO_NGOAC) {
						bieuThuc.push(phepTinh.pop());
					} else {
						phepTinh.pop();
						break;
					}
				}
				tg.pop();
				break;

			case GIAI_THUA:
				if (s.equals("") == false) {
					DuLieu d4 = new DuLieu();
					d4.set(s, SO);
					bieuThuc.push(d4);
					s = "";
				}
				bieuThuc.push(tg.pop());
				break;

			case HANG_SO:
				if (s.equals("") == false) {
					DuLieu d3 = new DuLieu();
					d3.set(s, SO);
					bieuThuc.push(d3);
					s = "";
				}
				if (tg.peek().getGiaTri().equals("pi")) {
					s = String.valueOf(Math.PI);
					DuLieu d4 = new DuLieu();
					d4.set(s, SO);
					bieuThuc.push(d4);
					s = "";
				}
				if (tg.peek().getGiaTri().equals("e")) {
					s = String.valueOf(Math.E);
					DuLieu d4 = new DuLieu();
					d4.set(s, SO);
					bieuThuc.push(d4);
					s = "";
				}
				if (tg.peek().getGiaTri().equals("Ans")) {
					s = String.valueOf(this.ans);
					DuLieu d4 = new DuLieu();
					d4.set(s, SO);
					bieuThuc.push(d4);
					s = "";
				}
				if (tg.peek().getGiaTri().equals("M")) {
					s = String.valueOf(this.m);
					DuLieu d4 = new DuLieu();
					d4.set(s, SO);
					bieuThuc.push(d4);
					s = "";
				}
				tg.pop();
			}
		}
		if (s.equals("") == false) {
			DuLieu d4 = new DuLieu();
			d4.set(s, SO);
			bieuThuc.push(d4);
			s = "";
		}
		while (phepTinh.empty() == false) {
			bieuThuc.push(phepTinh.pop());
		}
	}
}
