package interfaces;

import tuvan.Excute;
import tuvan.ModulSuyDien;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import timkiem.KetQuaTuVan;
import timkiem.TB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 
 */
public class MainProgram extends javax.swing.JFrame {

	private ArrayList<String> list = new ArrayList();

	/**
	 * Creates new form Giaodien
	 *
	 */
	TB ttdb;
	DefaultTableModel model;
	DefaultTableModel model1;

	public MainProgram() {
		initComponents();
		setLocationRelativeTo(null);
		model = (DefaultTableModel) jTable1.getModel();
		model1 = (DefaultTableModel) jTable2.getModel();
		ttdb = new TB();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel4 = new javax.swing.JPanel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel3 = new javax.swing.JLabel();
		TKkhoi = new javax.swing.JComboBox<>();
		jLabel4 = new javax.swing.JLabel();
		TKnganh = new javax.swing.JComboBox<>();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();
		TKdiem = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jLabel8 = new javax.swing.JLabel();
		SoThich = new javax.swing.JComboBox<>();
		jLabel9 = new javax.swing.JLabel();
		Khanangtricha = new javax.swing.JComboBox<>();
		jLabel10 = new javax.swing.JLabel();
		cohoihocbong = new javax.swing.JComboBox<>();
		jButton2 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		Luat3 = new javax.swing.JTextArea();
		jLabel19 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocation(new java.awt.Point(400, 200));
		setResizable(false);



		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 51, 102));
		jLabel1.setText("Project 2");
		jLabel1.setHorizontalAlignment(JLabel.CENTER);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Trường", "Học Phí", "Hoc bổng", "Ngành", "Khối", "Điểm" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, true, true, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(0, 102, 0));
		jLabel3.setText("Khối");

		TKkhoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "A1", "D", "Tất cả các khối" }));

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(0, 102, 0));
		jLabel4.setText("Điểm");

		TKnganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT", "Quản trị kinh doanh",
				"Kỹ thuật điện tử", "Tự đông hoá", "Cơ khí", "Cơ điện tử", "Ngoại ngữ", "Tất cả các ngành" }));
		TKnganh.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TKnganhActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(51, 102, 0));

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(0, 51, 204));
		jLabel6.setText("Chức năng tìm kiếm");
		jLabel6.setHorizontalAlignment(JLabel.CENTER);

		jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton1.setForeground(new java.awt.Color(0, 102, 0));
		jButton1.setText("Tìm kiếm");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(0, 102, 0));
		jLabel11.setText("Ngành");

		TKdiem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TKdiemActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(65, 65, 65).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout
								.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(407, 407, 407)
												.addComponent(jLabel5))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(79, 79, 79)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addGap(474, 474, 474).addComponent(jButton1))
														.addComponent(TKdiem, javax.swing.GroupLayout.PREFERRED_SIZE,
																190, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(TKnganh, javax.swing.GroupLayout.PREFERRED_SIZE,
																203, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(378, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(89, 89, 89)
								.addComponent(TKkhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(113, 113, 113))))
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(451, 451, 451).addComponent(jLabel6,
								javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(416, 416, 416).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(22, 22, 22).addComponent(jLabel6).addGap(26, 26, 26)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
						.addComponent(jLabel5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(TKkhoi, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(TKdiem, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(TKnganh, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(64, 64, 64))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
										.createSequentialGroup().addComponent(jButton1).addGap(45, 45, 45)))));

		jTabbedPane1.addTab("Chức năng tìm kiếm ", jPanel1);

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 51, 102));
		jLabel2.setText("Project 2");
		jLabel2.setHorizontalAlignment(JLabel.CENTER);

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(0, 51, 204));
		jLabel7.setText("Chức năng tư vấn");

		jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Trường", "Học phí", "Học bổng", "Ngành", "Khối", "Điểm" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane2.setViewportView(jTable2);

		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(0, 102, 0));
		jLabel8.setText("Sở thích");

		SoThich.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Khoa học kỹ thuật công nghệ", "Kỹ thuật cơ khí", "Kinh doanh" }));

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(51, 102, 0));
		jLabel9.setText("Khả năng chi trả học phí");

		Khanangtricha.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Chi trả tốt", "Trung bình", "Khó Khăn" }));
		Khanangtricha.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				KhanangtrichaActionPerformed(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(0, 102, 0));
		jLabel10.setText("Cơ hội học bổng");

		cohoihocbong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dễ", "Trung bình", "Khó" }));

		jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton2.setForeground(new java.awt.Color(0, 102, 0));
		jButton2.setText("Tư vấn");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton4.setForeground(new java.awt.Color(0, 102, 0));
		jButton4.setText("Giải thích");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(444, 444, 444).addComponent(jLabel2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(486, 486, 486).addComponent(jLabel7,
								javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(41, 41, 41).addComponent(jScrollPane2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 1107, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(16, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(41, 41, 41)
										.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(45, 45, 45))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel10)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(SoThich, 0, 201, Short.MAX_VALUE)
								.addComponent(cohoihocbong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 216,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(47, 47, 47)
						.addComponent(Khanangtricha, javax.swing.GroupLayout.PREFERRED_SIZE, 128,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(145, 145, 145))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(80, 80, 80).addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(278, 278, 278)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(51, 51, 51)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(26, 26, 26)
						.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(SoThich, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9)
								.addComponent(Khanangtricha, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(38, 38, 38)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cohoihocbong, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel10))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(53, 53, 53)));

		jTabbedPane1.addTab("Chức năng tư vấn", jPanel2);

		Luat3.setColumns(20);
		Luat3.setLineWrap(true);
		Luat3.setRows(5);
		Luat3.setWrapStyleWord(true);
		Luat3.addContainerListener(new java.awt.event.ContainerAdapter() {
			public void componentAdded(java.awt.event.ContainerEvent evt) {
				Luat3ComponentAdded(evt);
			}
		});
		Luat3.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				Luat3FocusLost(evt);
			}
		});
		jScrollPane3.setViewportView(Luat3);

		jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel19.setForeground(new java.awt.Color(0, 102, 51));
		jLabel19.setText("Luật để xây dựng chương trình");

		jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton3.setForeground(new java.awt.Color(0, 102, 0));
		jButton3.setText("Show");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel20.setText("Các giả thiết R1A&R2A : R1A,R2A");

		jLabel21.setText("Các luật suy diễn R1A&R2A=>R3A : R1A,R2A R3A");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup().addContainerGap(231, Short.MAX_VALUE)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel20).addComponent(jLabel21))
														.addGap(269, 269, 269))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
												.createSequentialGroup()
												.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 699,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(234, 234, 234))))
				.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(538, 538, 538).addComponent(jButton3))
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(338, 338, 338).addComponent(jLabel19,
								javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(0, 0, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup().addGap(20, 20, 20)
								.addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
								.addComponent(jLabel20)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel21).addGap(9, 9, 9)
								.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 341,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32).addComponent(jButton3).addGap(29, 29, 29)));

		jTabbedPane1.addTab("Tập luật xây dựng", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1));

		pack();
	}// </editor-fold>//GEN-END:initComponents
	
	
	//task tư vấn dưa theo luật suy diễn tiến
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		for (int i = model1.getRowCount(); i > 0; i--) {
			model1.removeRow(i - 1);
		}

		try {
			String line = null;
			// line = JOptionPane.showInputDialog(null, "nhap gia thiet ban dau", "Input",
			// JOptionPane.QUESTION_MESSAGE);
			if (SoThich.getSelectedItem().equals("Khoa học kỹ thuật công nghệ")) {
				if (Khanangtricha.getSelectedItem().equals("Chi trả tốt")) {
					if (cohoihocbong.getSelectedItem().equals("Dễ")) {
						line = "Q1A,Q2A,R5A";
					} else if (cohoihocbong.getSelectedItem().equals("Trung bình")) {
						line = "Q1A,Q2A,R5B";
					} else {
						line = "Q1A,Q2A,R5C";
					}
				} else if (Khanangtricha.getSelectedItem().equals("Trung bình")) {
					if (cohoihocbong.getSelectedItem().equals("Dễ")) {
						line = "Q1A,Q2B,R5A";
					} else if (cohoihocbong.getSelectedItem().equals("Trung bình")) {
						line = "Q1A,Q2B,R5B";
					} else {
						line = "Q1A,Q2C,R5C";
					}
				} else {
					if (cohoihocbong.getSelectedItem().equals("Dễ")) {
						line = "Q1A,Q2C,R5A";
					} else if (cohoihocbong.getSelectedItem().equals("Trung bình")) {
						line = "Q1A,Q2C,R5B";
					} else {
						line = "Q1A,Q2C,R5C";
					}
				}
			} else if (SoThich.getSelectedItem().equals("Kỹ thuật cơ khí")) {
				if (Khanangtricha.getSelectedItem().equals("Chi trả tốt")) {
					if (cohoihocbong.getSelectedItem().equals("Dễ")) {
						line = "Q1B,Q2A,R5A";
					} else if (cohoihocbong.getSelectedItem().equals("Trung bình")) {
						line = "Q1B,Q2A,R5B";
					} else {
						line = "Q1B,Q2A,R5C";
					}
				} else if (Khanangtricha.getSelectedItem().equals("Trung bình")) {
					if (cohoihocbong.getSelectedItem().equals("Dễ")) {
						line = "Q1B,Q2B,R5A";
					} else if (cohoihocbong.getSelectedItem().equals("Trung bình")) {
						line = "Q1B,Q2B,R5B";
					} else {
						line = "Q1B,Q2B,R5C";
					}
				} else {
					if (cohoihocbong.getSelectedItem().equals("Dễ")) {
						line = "Q1B,Q2C,R5A";
					} else if (cohoihocbong.getSelectedItem().equals("Trung bình")) {
						line = "Q1B,Q2C,R5B";
					} else {
						line = "Q1B,Q2C,R5C";
					}
				}
			} else {
				if (Khanangtricha.getSelectedItem().equals("Chi trả tốt")) {
					if (cohoihocbong.getSelectedItem().equals("Dễ")) {
						line = "Q1C,Q2A,R5A";
					} else if (cohoihocbong.getSelectedItem().equals("Trung bình")) {
						line = "Q1C,Q2A,R5B";
					} else {
						line = "Q1C,Q2A,R5C";
					}
				} else if (Khanangtricha.getSelectedItem().equals("Trung bình")) {
					if (cohoihocbong.getSelectedItem().equals("Dễ")) {
						line = "Q1C,Q2B,R5A";
					} else if (cohoihocbong.getSelectedItem().equals("Trung bình")) {
						line = "Q1C,Q2B,R5B";
					} else {
						line = "Q1C,Q2B,R5C";
					}
				} else {
					if (cohoihocbong.getSelectedItem().equals("Dễ")) {
						line = "Q1C,Q2C,R5A";
					} else if (cohoihocbong.getSelectedItem().equals("Trung bình")) {
						line = "Q1C,Q2C,R5B";
					} else {
						line = "Q1C,Q2C,R5C";
					}
				}
			}
			ModulSuyDien.napGiaThiet("rule.txt", line);
			ModulSuyDien obj1 = new ModulSuyDien();

			Excute subObj1 = new Excute();
			subObj1.initTapDich();
			ArrayList<String> listKQ = subObj1.excuteBackTract(0);
			if (listKQ != null) {
				ArrayList<KetQuaTuVan> listKetQuaTuVan = new ArrayList<>();
				for (int i = 0; i < listKQ.size(); i++) {
					listKetQuaTuVan.add(ttdb.htKetQua(listKQ.get(i)));
				
				}
				for (KetQuaTuVan kqtv : listKetQuaTuVan) {
					model1.addRow(new Object[] { kqtv.getTenTruong(), kqtv.getMuchp(), kqtv.getMuchb(),
							kqtv.getTenNganh(), kqtv.getKhoi(), kqtv.getDiemChuan() });
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			String temp = "                                        ";
			ModulSuyDien.napGiaThiet("rule.txt", temp);
		}
		int r = jTable2.getRowCount();
		System.out.println(r);
	}// GEN-LAST:event_jButton2ActionPerformed

	private void TKdiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TKdiemActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_TKdiemActionPerformed

	private void TKnganhActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TKnganhActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_TKnganhActionPerformed

	private void Luat3FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_Luat3FocusLost
		// TODO add your handling code here:

	}// GEN-LAST:event_Luat3FocusLost

	private void Luat3ComponentAdded(java.awt.event.ContainerEvent evt) {// GEN-FIRST:event_Luat3ComponentAdded
		// TODO add your handling code here:
	}// GEN-LAST:event_Luat3ComponentAdded

	// Task show luật
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:

		File file = new File("rule.txt");

		// doc file
		try {
			Scanner sc = new Scanner(file);
			String str;
			str = sc.nextLine();
			str = sc.nextLine();
			while (sc.hasNext()) {
				str = sc.nextLine();
				Luat3.append(str + "\n");

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}// GEN-LAST:event_jButton3ActionPerformed

	// task tìm kiếm
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		if (TKdiem.getText().length() != 0) {
			for (int i = model.getRowCount(); i > 0; i--) {
				model.removeRow(i - 1);
			}

			ArrayList<KetQuaTuVan> listKetQuaTuVan = ttdb.timKiem(Float.parseFloat(TKdiem.getText()),
					TKkhoi.getSelectedItem().toString(), TKnganh.getSelectedItem().toString());
			if (listKetQuaTuVan.size() == 0) {
				JOptionPane.showMessageDialog(rootPane, "Không tìm được trường phù hợp");
			} else {
				for (KetQuaTuVan kqtv : listKetQuaTuVan) {
					model.addRow(new Object[] { kqtv.getTenTruong(), kqtv.getMuchp(), kqtv.getMuchb(),
							kqtv.getTenNganh(), kqtv.getKhoi(), kqtv.getDiemChuan() });
				}
			}

		} else {
			JOptionPane.showMessageDialog(rootPane, " Nhập vào điểm của bạn");
		}

	}// GEN-LAST:event_jButton1ActionPerformed

	private void KhanangtrichaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_KhanangtrichaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_KhanangtrichaActionPerformed
//tu vấn cho sinh viên
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
		int r = jTable2.getSelectedRow();
		System.out.println(r);
		String kqsothich = "";
		String kqtritra = "";
		String kqcohoihocbong = "";
		if (SoThich.getSelectedItem().toString().equals("Khoa học kỹ thuật công nghệ")) {
			kqsothich = " bạn nên theo học các ngành CNTT hay kỹ thuật điện tử ";
			System.out.println("co vao day khong");
		} else if (SoThich.getSelectedItem().toString().equals("Kỹ thuật cơ khí")) {
			kqsothich = " bạn nên theo học các ngành Tự động hóa,cơ khí và cơ điện tử ";
		} else if (SoThich.getSelectedItem().toString().equals("Kinh doanh")) {
			kqsothich = " bạn nên theo học các ngành Ngoại ngữ và Quản trị kinh doanh";
		}

		if (Khanangtricha.getSelectedItem().toString().equals("Chi trả tốt")) {
			kqtritra = " bạn có thể học ở tất cả các Trường đại học với mọi mức học phí ";
		} else if (Khanangtricha.getSelectedItem().toString().equals("Trung bình")) {
			kqtritra = " bạn có thể học các Trường đại học với mọi mức học phí <17 triệu/1 năm ";

		} else if (Khanangtricha.getSelectedItem().toString().equals("Khó Khăn")) {
			kqtritra = " bạn có thể học các Trường đại học với mọi mức học phí <15 triệu/1 năm ";
		}
		if (this.cohoihocbong.getSelectedItem().toString().equals("Dễ")) {
			kqcohoihocbong = " bạn có thể theo học tại các Trường đại học Công nghiệp,FPT,kỹ thuật công nghiệp và Mỏ";
		} else if (this.cohoihocbong.getSelectedItem().toString().equals("Trung bình")) {
			kqcohoihocbong = "bạn có thể theo học tại các Trường đại học Xây Dựng và Giao Thông Vận Tải ";
		} else if (this.cohoihocbong.getSelectedItem().toString().equals("Khó")) {
			kqcohoihocbong = "bạn có thể theo học tại các Trường đại học Bách Khoa";
		}

		if (r == 0) {
			System.out.println("co vao 0");
			JOptionPane.showMessageDialog(rootPane,
					" Sở thích của bạn là:" + SoThich.getSelectedItem().toString() + "\nchúng tôi khuyên" + kqsothich
							+ " \n Khả năng tri trả học phí của bạn là:" + Khanangtricha.getSelectedItem().toString()
							+ "\n" + kqtritra + " \n Cơ hội học bổng mà bạn muốn là :"
							+ cohoihocbong.getSelectedItem().toString() + "\n" + kqcohoihocbong + "\n Lựa chọn :"
							+ model1.getValueAt(r, 0).toString() + " ngành: " + model1.getValueAt(r, 3).toString()
							+ ", có điểm :" + model1.getValueAt(r, 5).toString() + " là kết quả tốt nhất");
		} else if (r == 1) {
			System.out.println("co vao 1");
			JOptionPane.showMessageDialog(rootPane,
					" Sở thích của bạn là:" + SoThich.getSelectedItem().toString() + "\nchúng tôi khuyên" + kqsothich
							+ " \n Khả năng tri trả học phí của bạn là:" + Khanangtricha.getSelectedItem().toString()
							+ "\n" + kqtritra + " \n Cơ hội học bổng mà bạn muốn là :"
							+ cohoihocbong.getSelectedItem().toString() + "\n" + kqcohoihocbong + "\n Lựa chọn :"
							+ model1.getValueAt(r, 0).toString() + " ngành: " + model1.getValueAt(r, 3).toString()
							+ ", có điểm :" + model1.getValueAt(r, 5).toString() + " là kết quả phù hợp thứ 2");
		} else if (r == 2) {
			System.out.println("co vao 2");
			JOptionPane.showMessageDialog(rootPane,
					" Sở thích của bạn là:" + SoThich.getSelectedItem().toString() + "\nchúng tôi khuyên" + kqsothich
							+ " \n Khả năng tri trả học phí của bạn là:" + Khanangtricha.getSelectedItem().toString()
							+ "\n" + kqtritra + " \n Cơ hội học bổng mà bạn muốn là :"
							+ cohoihocbong.getSelectedItem().toString() + "\n" + kqcohoihocbong + "\n Lựa chọn :"
							+ model1.getValueAt(r, 0).toString() + " ngành: " + model1.getValueAt(r, 3).toString()
							+ ", có điểm :" + model1.getValueAt(r, 5).toString() + " là kết quả phù hợp thứ 3");
		}

	}// GEN-LAST:event_jButton4ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainProgram().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JComboBox<String> Khanangtricha;
	private javax.swing.JTextArea Luat3;
	private javax.swing.JComboBox<String> SoThich;
	private javax.swing.JTextField TKdiem;
	private javax.swing.JComboBox<String> TKkhoi;
	private javax.swing.JComboBox<String> TKnganh;
	private javax.swing.JComboBox<String> cohoihocbong;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	// End of variables declaration//GEN-END:variables
}
