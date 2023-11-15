/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import connectDB.ConnectDB;
import dao.KhachHang_DAO;
import entity.DichVu;
import entity.KhachHang;
import entity.LoaiPhong;
import entity.PhongHat;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;
import javax.swing.plaf.ColorChooserUI;

/**
 *
 * @author ADMIN
 */
public class JPanel_DanhMucKhachHang extends javax.swing.JPanel {
	   private KhachHang_DAO khachHang_dao;
		private ArrayList<KhachHang> listKhachHang;
		private DefaultTableModel model_KhachHang;

    /**
     * Creates new form quanlyKH
     */
    public JPanel_DanhMucKhachHang() {
    	try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		khachHang_dao = new KhachHang_DAO();
        initComponents();
        // tooltip các nút chức năng của quan lý dịch vụ
        btnThem.setToolTipText("Atl + A");		
        btnCapNhat.setToolTipText("Atl + U");
        btnLamMoi.setToolTipText("Atl + C");

        // sử dụng phím tắt
        btnThem.setMnemonic(KeyEvent.VK_A);
        btnCapNhat.setMnemonic(KeyEvent.VK_U);
        btnLamMoi.setMnemonic(KeyEvent.VK_C);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlThongTinKhachHang = new javax.swing.JPanel();
        lblMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        lblTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblSoDienThoai = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        lblCCCD = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        pnlDSKhachHang = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSKhachHang = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1250, 750));

        pnlThongTinKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khách hàng"));
        pnlThongTinKhachHang.setToolTipText("Thông tin khách hàng");
        pnlThongTinKhachHang.setName(""); // NOI18N

        lblMaKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaKH.setText("Mã Khách Hàng");
        lblMaKH.setToolTipText("");
        lblMaKH.setAutoscrolls(true);
        lblMaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtMaKH.setEditable(false);
        txtMaKH.setToolTipText("Mã Khách Hàng");
        txtMaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        lblTenKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenKH.setText("Tên Khách Hàng");

        txtTenKH.setToolTipText("Tên Khách Hàng");
        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi.setText("Địa Chỉ ");

        txtDiaChi.setToolTipText("Địa Chỉ");
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        lblSoDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoDienThoai.setText("Số Điện Thoại");

        txtSoDienThoai.setToolTipText("Số Điện Thoại");

        lblCCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCCCD.setText("Căn Cước Công Dân");

        txtCCCD.setToolTipText("Căn Cước Công Dân");
        txtCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCCDActionPerformed(evt);
            }
        });

        lblGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGioiTinh.setText("Giới Tính");

        buttonGroup1.add(radNam);
        radNam.setSelected(true);
        radNam.setText("Nam");
        radNam.setToolTipText("Nam");
        radNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(radNu);
        radNu.setText("Nữ");
        radNu.setToolTipText("Nữ");
        radNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNuActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon("item/add25.png")); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setToolTipText("Thêm");
        btnThem.setBorder(null);
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnew_KhachHang();
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon("item/update25.png")); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.setToolTipText("Cập Nhật");
        btnCapNhat.setBorder(null);
        btnCapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//            	edit_KhachHang();
            	updateKhachHang();
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon("item/refresh25.png")); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.setToolTipText("Làm Mới");
        btnLamMoi.setBorder(null);
        btnLamMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	clear_KhachHang();
            }
        });
        

        javax.swing.GroupLayout pnlThongTinKhachHangLayout = new javax.swing.GroupLayout(pnlThongTinKhachHang);
        pnlThongTinKhachHangLayout.setHorizontalGroup(
        	pnlThongTinKhachHangLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
        			.addGap(61)
        			.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblMaKH)
        				.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.LEADING)
        					.addComponent(lblDiaChi)
        					.addComponent(lblTenKH)))
        			.addGap(18)
        			.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
        					.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(txtDiaChi)
        						.addComponent(txtTenKH, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        						.addComponent(txtMaKH, Alignment.TRAILING))
        					.addGap(106)
        					.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
        							.addComponent(lblGioiTinh)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(radNam)
        							.addGap(93)
        							.addComponent(radNu)
        							.addGap(117))
        						.addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
        							.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblSoDienThoai)
        								.addComponent(lblCCCD))
        							.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
        							.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(txtCCCD, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtSoDienThoai, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)))))
        				.addGroup(Alignment.TRAILING, pnlThongTinKhachHangLayout.createSequentialGroup()
        					.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
        					.addGap(82)
        					.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
        					.addGap(73)
        					.addComponent(btnLamMoi, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(64, Short.MAX_VALUE))
        );
        pnlThongTinKhachHangLayout.setVerticalGroup(
        	pnlThongTinKhachHangLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
        			.addGap(18)
        			.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblMaKH)
        				.addComponent(txtMaKH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblSoDienThoai)
        				.addComponent(txtSoDienThoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblTenKH)
        				.addComponent(txtTenKH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblCCCD)
        				.addComponent(txtCCCD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblGioiTinh)
        				.addComponent(radNam)
        				.addComponent(radNu)
        				.addComponent(lblDiaChi)
        				.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(35)
        			.addGroup(pnlThongTinKhachHangLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnLamMoi, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        				.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        			.addContainerGap())
        );
        pnlThongTinKhachHang.setLayout(pnlThongTinKhachHangLayout);

        pnlDSKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Khách Hàng"));
        pnlDSKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblDSKhachHang.setAutoCreateRowSorter(true);
        tblDSKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblDSKhachHang.setModel(model_KhachHang = new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Mã Khách Hàng", "Tên Khách Hàng", "Số Điện Thoại", "Căn Cước Công Dân", "Giới Tính", "Địa Chỉ"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		String.class, String.class, String.class, String.class, Integer.class, String.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        	
        	@Override
			public boolean isCellEditable(int row, int column) {
				return false; // Không cho phép chỉnh sửa bất kỳ ô nào trên bảng
			}
        });
        tblDSKhachHang.setToolTipText("danh sách khách hàng");
        tblDSKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDSKhachHang.setFillsViewportHeight(true);
        tblDSKhachHang.setFocusable(false);
        tblDSKhachHang.setShowGrid(true);
        jScrollPane2.setViewportView(tblDSKhachHang);
        
        JTableHeader header_font = tblDSKhachHang.getTableHeader();
		Font f = new Font("Arial", Font.BOLD, 13);
		header_font.setFont(f);
        
        loadKhachHang();
        
        tblDSKhachHang.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int pos = tblDSKhachHang.getSelectedRow();
				txtMaKH.setText(model_KhachHang.getValueAt(pos, 0).toString());
				txtMaKH.setEnabled(false);
				txtTenKH.setText(model_KhachHang.getValueAt(pos, 1).toString());
				txtSoDienThoai.setText(model_KhachHang.getValueAt(pos, 2).toString());
				txtCCCD.setText(model_KhachHang.getValueAt(pos, 3).toString());
				String genderValue =  (String) model_KhachHang.getValueAt(pos, 4);
				if (genderValue == "Nam") {
				    buttonGroup1.setSelected(radNam.getModel(), true); 
				} else if (genderValue == "Nữ") {
				    buttonGroup1.setSelected(radNu.getModel(), true); 
				}
				txtDiaChi.setText(model_KhachHang.getValueAt(pos, 5).toString());
				
				txtTenKH.requestFocus();
			}

		});
        
        

        javax.swing.GroupLayout pnlDSKhachHangLayout = new javax.swing.GroupLayout(pnlDSKhachHang);
        pnlDSKhachHang.setLayout(pnlDSKhachHangLayout);
        pnlDSKhachHangLayout.setHorizontalGroup(
            pnlDSKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSKhachHangLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2)
                .addGap(21, 21, 21))
        );
        pnlDSKhachHangLayout.setVerticalGroup(
            pnlDSKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(16)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(pnlDSKhachHang, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
        				.addComponent(pnlThongTinKhachHang, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1194, GroupLayout.PREFERRED_SIZE))
        			.addGap(40))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(14)
        			.addComponent(pnlThongTinKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(pnlDSKhachHang, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(75, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void radNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radNamActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void txtCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCCDActionPerformed

    private void radNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radNuActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    // load khách hàng lên bảng
    public void loadKhachHang() {
    	String gioitinh = "";
    	model_KhachHang.setRowCount(0);
		listKhachHang = khachHang_dao.getAllKhachHang();
		for (KhachHang kh : listKhachHang) {
			if(kh.getGioiTinh() == 1) {
				gioitinh = "Nam";
			}else if(kh.getGioiTinh() == 0){
				gioitinh = "Nữ";
			}
			model_KhachHang.addRow(new Object[] { 
					kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getSoDienThoai(), kh.getCCCD(),
					gioitinh, kh.getDiaChi()});
		}
	}
    
  
    // thêm khách hàng
 	private void addnew_KhachHang() {
 		if(ValidData()) {
 			KhachHang kh = revertKhachHang();
 			khachHang_dao.addKhachHang(kh);
 			JOptionPane.showMessageDialog(this, "Thêm thành công!");
 			model_KhachHang.setRowCount(0);
 			loadKhachHang();
 			clear_KhachHang();
 		}
 	}
 	
 	 // tạo 1 phòng
 	public KhachHang revertKhachHang() {
 			// TODO Auto-generated method stub
 			String ma = generateCode();
 			int count = khachHang_dao.kiemTraMa(ma);
 			do {
 				ma = generateCode();
 			}while(count > 0);
 			
 			String tenKH = txtTenKH.getText().trim();
 			String cccd = txtCCCD.getText().trim();
 			String soDienThoai = txtSoDienThoai.getText().trim();
 			int gioiTinh = radNam.isSelected() ? 1 : 0;
// 			int soLanSuDung = 0;
 			String diaChi = txtDiaChi.getText().trim();
 			
 			return new KhachHang(ma, tenKH, soDienThoai, cccd, gioiTinh, diaChi);
 		}
    
    // làm mới data nhập khách hàng
    public void clear_KhachHang() {
		txtMaKH.setText("");
		txtTenKH.setText("");
		txtSoDienThoai.setText("");
		txtDiaChi.setText("");
		txtCCCD.setText("");
		buttonGroup1.setSelected(radNam.getModel(), true);
		
		loadKhachHang();
		txtTenKH.requestFocus();
	}
    
	// cập nhật khách hàng
	public void updateKhachHang() {
	    try {
	    	if(ValidData()) {
	    		 // Lấy thông tin từ trường nhập liệu và nút radio
		        String maKhachHang = txtMaKH.getText().trim();
		        String tenKhachHang = txtTenKH.getText().trim();
		        String soDienThoai = txtSoDienThoai.getText().trim();
		        String cccd = txtCCCD.getText().trim();
		        
		        radNam.setActionCommand("1");
        		radNu.setActionCommand("0");
		        int gioiTinh = 1; // Mặc định giới tính là 1 - Nam nếu không có nút radio được chọn.
		        ButtonModel selectedButton = buttonGroup1.getSelection();
		        if (selectedButton != null) {
		        	String gioiTinhString = selectedButton.getActionCommand();
		        	if (gioiTinhString != null && !gioiTinhString.isEmpty()) {
		        	    gioiTinh = Integer.parseInt(gioiTinhString);
		        	}
		        }
		        
		        String diaChi = txtDiaChi.getText().trim();
		        
		        KhachHang khachHang = new KhachHang(maKhachHang, tenKhachHang, soDienThoai, cccd, gioiTinh, diaChi);
		        
		        khachHang_dao.capNhat_KhachHang(khachHang);
		        // Cập nhật lại dữ liệu hiển thị
		        loadKhachHang();
		        clear_KhachHang(); // Đặt lại trường nhập liệu

		        JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thành công!");
	    	}
	    } catch (Exception e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật khách hàng: " + e.getMessage());
	    }
	}
    
	 // border - thông báo lỗi nhập liệu
	    Border bdFalse = BorderFactory.createLineBorder(Color.red);
		Border bdTrue = BorderFactory.createLineBorder(Color.green);
	 	public boolean ValidData() {
	 		String tenKH = txtTenKH.getText().trim();
	 		String sdt = txtSoDienThoai.getText().trim();
	 		String cccd = txtCCCD.getText().trim();
	 		String diaChi = txtDiaChi.getText().trim();
	 		
	 		// Check tên khách hàng
	 		if(tenKH.length() > 0 || !tenKH.equals("")) {
	 			if(!tenKH.matches("^[\\p{L}]+( [\\p{L}]+)*$")) {
	    			JOptionPane.showMessageDialog(this, "Error: Tên Khách hàng không hợp lệ ! Vui lòng nhập lại");
					txtTenKH.requestFocus(true);
					txtTenKH.setBorder(bdFalse);
					return false;
	    		}else {
	    			txtTenKH.setBorder(bdTrue);
	    		}
	 		}else {
	 			JOptionPane.showMessageDialog(this, "Error: Chưa nhập tên khách hàng !");
				txtTenKH.requestFocus(true);
				txtTenKH.setBorder(bdFalse);
				return false;
	 		}
	 		
	 	// Check địa chỉ
	 		if(diaChi.length() > 0 || !diaChi.equals("")) {
	 			if(!diaChi.matches("^[\\p{L}]+( [\\p{L}]+)*$")) {
	    			JOptionPane.showMessageDialog(this, "Error: Địa Chỉ không hợp lệ ! Vui lòng nhập lại");
					txtDiaChi.requestFocus(true);
					txtDiaChi.setBorder(bdFalse);
					return false;
	    		}else {
	    			txtDiaChi.setBorder(bdTrue);
	    		}
	 		}else {
	 			JOptionPane.showMessageDialog(this, "Error: Chưa nhập địa chỉ !");
				txtDiaChi.requestFocus(true);
				txtDiaChi.setBorder(bdFalse);
				return false;
	 		}
	 		
	 		
	 		// check số điện thoại
	 		if((sdt.length() >= 10 && sdt.length() < 12) || !sdt.equals("")) {
	 			if(!sdt.matches("^0\\d{9,10}$")) {
	    			JOptionPane.showMessageDialog(this, "Error: Số Điện Thoại của bạn không hợp lệ ! Vui lòng nhập lại");
					txtSoDienThoai.requestFocus(true);
					txtSoDienThoai.setBorder(bdFalse);
					return false;
	    		}else {
	    			txtSoDienThoai.setBorder(bdTrue);
	    		}
	 		}else {
	 			JOptionPane.showMessageDialog(this, "Error: Chưa nhập số điện thoại !");
				txtSoDienThoai.requestFocus(true);
				txtSoDienThoai.setBorder(bdFalse);
				return false;
	 		}
	 		
	 	// check căn cước công dân
	 		if(cccd.length() == 12 || !cccd.equals("")) {
	 			if(!cccd.matches("^0\\d{11}$")) {
	    			JOptionPane.showMessageDialog(this, "Error: Căn cước công dân của bạn không hợp lệ ! Vui lòng nhập lại");
					txtCCCD.requestFocus(true);
					txtCCCD.setBorder(bdFalse);
					return false;
	    		}else {
	    			txtCCCD.setBorder(bdTrue);
	    		}
	 		}else {
	 			JOptionPane.showMessageDialog(this, "Error: Chưa nhập căn cước công dân !");
				txtCCCD.requestFocus(true);
				txtCCCD.setBorder(bdFalse);
				return false;
	 		}
	 		
	 		return true;
	 		
	 	}
    
    // phát sinh mã khách hàng
	public String generateCode() {
        // Khởi tạo một biến để lưu trữ mã
        String maKhachHang = "";
        String prefix = "KH";
        // Tạo một biến ngẫu nhiên
        Random random = new Random();
        // Tạo một chuỗi gồm 3 số ngẫu nhiên
        for (int i = 0; i < 4; i++) {
        	maKhachHang += random.nextInt(10);
        }
        return prefix + maKhachHang;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JPanel pnlDSKhachHang;
    private javax.swing.JPanel pnlThongTinKhachHang;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTable tblDSKhachHang;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}