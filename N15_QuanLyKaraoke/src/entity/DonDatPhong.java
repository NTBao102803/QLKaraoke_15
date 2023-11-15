package entity;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

public class DonDatPhong {
	private String maDonDatPhong;
	private Date ngayDat;
	private Time gioDat;
	private PhongHat phongHat;
	private KhachHang khachHang;
	// constructor
	public DonDatPhong(String maDonDatPhong, Date ngayDat, Time gioDat, PhongHat phongHat, KhachHang khachHang) {
		super();
		this.maDonDatPhong = maDonDatPhong;
		this.ngayDat = ngayDat;
		this.gioDat = gioDat;
		this.phongHat = phongHat;
		this.khachHang = khachHang;
	}
	public DonDatPhong(String maDonDatPhong) {
		super();
		this.maDonDatPhong = maDonDatPhong;
	}
	public DonDatPhong() {
		super();
	}
	// get and set
	public String getMaDonDatPhong() {
		return maDonDatPhong;
	}
	public void setMaDonDatPhong(String maDonDatPhong) {
		this.maDonDatPhong = maDonDatPhong;
	}
	public Date getNgayDat() {
		return ngayDat;
	}
	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}
	public Time getGioDat() {
		return gioDat;
	}
	public void setGioDat(Time gioDat) {
		this.gioDat = gioDat;
	}
	public PhongHat getPhongHat() {
		return phongHat;
	}
	public void setPhongHat(PhongHat phongHat) {
		this.phongHat = phongHat;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maDonDatPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonDatPhong other = (DonDatPhong) obj;
		return Objects.equals(maDonDatPhong, other.maDonDatPhong);
	}
	// toString
	@Override
	public String toString() {
		return "DonDatPhong [maDonDatPhong=" + maDonDatPhong + ", ngayDat=" + ngayDat + ", gioDat=" + gioDat
				+ ", phongHat=" + phongHat + ", khachHang=" + khachHang + "]";
	}
}
