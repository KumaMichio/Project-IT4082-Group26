package controller.hokhau;

import java.sql.SQLException;
// import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


import models.ChuHoModel;
import models.HoKhauModel;
import models.NhanKhauModel;
import services.ChuHoService;
import services.HoKhauService;
import services.NhanKhauService;

public class UpdateHoKhau {
//	@FXML
//	private TextField tfSoThanhVien;
//	@FXML
//	private TextField tfSDT;
//	@FXML
//	private TextField tfTenChuHo;
//	@FXML
//	private TextField tfDiaChi;
//	@FXML
//	private TextField tfMaHo;
//
//	private HoKhauModel hoKhauModel;
//
//	public void setHoKhauModel(HoKhauModel hoKhauModel) throws ClassNotFoundException, SQLException {
//		this.hoKhauModel = hoKhauModel;
//
//		Map<Integer, Integer> mapMahoToID = new TreeMap<Integer, Integer>();
//		List<ChuHoModel> listChuHo = new ChuHoService().getListChuHo();
//		listChuHo.stream().forEach(chuho -> {
//			mapMahoToID.put(chuho.getMaHo(), chuho.getIdChuHo());
//		});
//
//		Map<Integer, String> mapIDToTenNhanKhau = new TreeMap<>();
//		Map<Integer, String> mapIDToSDT = new TreeMap<>();
//		List<NhanKhauModel> listNhanKhau = new NhanKhauService().getListNhanKhau();
//		listNhanKhau.stream().forEach(nhankhau -> {
//			mapIDToTenNhanKhau.put(nhankhau.getId(), nhankhau.getTen());
//			mapIDToSDT.put(nhankhau.getId(), nhankhau.getSdt());
//		});
//
//		tfDiaChi.setText(hoKhauModel.getDiaChi());
//		tfMaHo.setText(Integer.toString(hoKhauModel.getMaHo()));
//		tfSoThanhVien.setText(Integer.toString(hoKhauModel.getSoThanhvien()));
//		tfTenChuHo.setText(mapIDToTenNhanKhau.get(mapMahoToID.get(hoKhauModel.getMaHo())));
//		tfSDT.setText(mapIDToSDT.get(mapMahoToID.get(hoKhauModel.getMaHo())));
//	}
//
//	public void updateHoKhau(ActionEvent event) throws ClassNotFoundException, SQLException {
//		// kiem tra dia chi nhap vao
//		// dia chi nhap vao la 1 chuoi t 1 toi 30 ki tu
//		if (tfDiaChi.getText().length() >= 50 || tfDiaChi.getText().length() <= 1) {
//			Alert alert = new Alert(AlertType.WARNING, "Hãy nhập vào 1 địa chỉ hợp lệ!", ButtonType.OK);
//			alert.setHeaderText(null);
//			alert.showAndWait();
//			return;
//		}
//
//		String diaChiString = tfDiaChi.getText();
//		new HoKhauService().update(hoKhauModel.getMaHo(), diaChiString);
//		Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
//        stage.close();
//	}

	@FXML private TextField tfSoThanhVien;
	@FXML private TextField tfSDT;
	@FXML private TextField tfTenChuHo;
	@FXML private TextField tfDiaChi;
	@FXML private TextField tfMaHo;

	private HoKhauModel hoKhauModel;

	public void setHoKhauModel(HoKhauModel hoKhauModel) throws ClassNotFoundException, SQLException {
		this.hoKhauModel = hoKhauModel;

		// Map mã hộ → ID chủ hộ
		Map<Integer, Integer> maHoToIdMap = new TreeMap<>();
		for (ChuHoModel chuHo : new ChuHoService().getListChuHo()) {
			maHoToIdMap.put(chuHo.getMaHo(), chuHo.getIdChuHo());
		}

		// Map ID → tên và SDT
		Map<Integer, String> idToTenMap = new TreeMap<>();
		Map<Integer, String> idToSdtMap = new TreeMap<>();
		for (NhanKhauModel nhanKhau : new NhanKhauService().getListNhanKhau()) {
			idToTenMap.put(nhanKhau.getId(), nhanKhau.getTen());
			idToSdtMap.put(nhanKhau.getId(), nhanKhau.getSdt());
		}

		int maHo = hoKhauModel.getMaHo();
		int idChuHo = maHoToIdMap.getOrDefault(maHo, -1);

		tfMaHo.setText(String.valueOf(maHo));
		tfDiaChi.setText(hoKhauModel.getDiaChi());
		tfSoThanhVien.setText(String.valueOf(hoKhauModel.getSoThanhvien()));
		tfTenChuHo.setText(idToTenMap.getOrDefault(idChuHo, ""));
		tfSDT.setText(idToSdtMap.getOrDefault(idChuHo, ""));
	}

	public void updateHoKhau(ActionEvent event) throws ClassNotFoundException, SQLException {
		String diaChi = tfDiaChi.getText().trim();

		if (diaChi.length() < 2 || diaChi.length() > 50) {
			showAlert("Hãy nhập vào 1 địa chỉ hợp lệ!");
			return;
		}

		new HoKhauService().update(hoKhauModel.getMaHo(), diaChi);
		closeStage(event);
	}

	private void showAlert(String message) {
		Alert alert = new Alert(AlertType.WARNING, message, ButtonType.OK);
		alert.setHeaderText(null);
		alert.showAndWait();
	}

	private void closeStage(ActionEvent event) {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();
	}
}
