package entity;

import java.sql.Date;
import java.sql.Time;
//import java.time.LocalTime;
import java.util.Objects;

public class HoaDonThuePhong {
	private String maHoaDon;
	private Date ngayTaoHoaDon;
	private Time gioVao;
	private Time gioRa;
	private double tienNhan;
	private KhachHang khachHang;
	private NhanVien nhanVien;
	private PhongHat phongHat;
	// constructor
	public HoaDonThuePhong(String maHoaDon, Date ngayTaoHoaDon, Time gioVao, Time gioRa, double tienNhan,
			KhachHang khachHang, NhanVien nhanVien, PhongHat phongHat) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayTaoHoaDon = ngayTaoHoaDon;
		this.gioVao = gioVao;
		this.gioRa = gioRa;
		this.tienNhan = tienNhan;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.phongHat = phongHat;
	}
	public HoaDonThuePhong(String maHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
	}
	public HoaDonThuePhong() {
		super();
	}
	public HoaDonThuePhong(String maHoaDon, Date ngayTaoHoaDon, Time gioVao, Time gioRa, KhachHang khachHang,
			NhanVien nhanVien, PhongHat phongHat) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayTaoHoaDon = ngayTaoHoaDon;
		this.gioVao = gioVao;
		this.gioRa = gioRa;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.phongHat = phongHat;
	}
	// get and set
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public Date getNgayTaoHoaDon() {
		return ngayTaoHoaDon;
	}
	public void setNgayTaoHoaDon(Date ngayTaoHoaDon) {
		this.ngayTaoHoaDon = ngayTaoHoaDon;
	}
	public Time getGioVao() {
		return gioVao;
	}
	public void setGioVao(Time gioVao) {
		this.gioVao = gioVao;
	}
	public Time getGioRa() {
		return gioRa;
	}
	public void setGioRa(Time gioRa) {
		this.gioRa = gioRa;
	}
	public double getTienNhan() {
		return tienNhan;
	}
	public void setTienNhan(double tienNhan) {
		this.tienNhan = tienNhan;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public PhongHat getPhongHat() {
		return phongHat;
	}
	public void setPhongHat(PhongHat phongHat) {
		this.phongHat = phongHat;
	}
//	hash code
	@Override
	public int hashCode() {
		return Objects.hash(maHoaDon);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDonThuePhong other = (HoaDonThuePhong) obj;
		return Objects.equals(maHoaDon, other.maHoaDon);
	}
	// toString
	@Override
	public String toString() {
		return "HoaDonThuePhong [maHoaDon=" + maHoaDon + ", ngayTaoHoaDon=" + ngayTaoHoaDon + ", gioVao=" + gioVao
				+ ", gioRa=" + gioRa + ", tienNhan=" + tienNhan + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien
				+ ", phongHat=" + phongHat + "]";
	}

	
}
