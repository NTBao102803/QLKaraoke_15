package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectDB.ConnectDB;
import entity.DonDatPhong;
import entity.HoaDonThuePhong;

public class HoaDonThuePhong_DAO {
	// thêm hóa đơn thuê phòng
	public  void addHoaDon(HoaDonThuePhong hd) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		try {
				statement = con.prepareStatement("insert into View_tbl_HoaDonThuePhong values(?,?,?,?,?,?,?)");
				statement.setString(1, hd.getMaHoaDon());
				statement.setDate(2, hd.getNgayTaoHoaDon());
				statement.setTime(3, hd.getGioVao());
				statement.setTime(4, hd.getGioRa());
				statement.setString(5, hd.getKhachHang().getMaKhachHang());
				statement.setString(6, hd.getNhanVien().getMaNhanVien());
				statement.setString(7, hd.getPhongHat().getMaPhongHat());

				statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
