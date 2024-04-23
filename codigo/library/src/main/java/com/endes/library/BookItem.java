package com.endes.library;

public class BookItem {
	private String barcode;
	private String rfid;
	private boolean isReferenceOnly;
	
	public BookItem(String barcode, String rfid, boolean isReferenceOnly) {

		this.barcode = barcode;
		this.rfid = rfid;
		this.isReferenceOnly = isReferenceOnly;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public boolean isReferenceOnly() {
		return isReferenceOnly;
	}
	public void setReferenceOnly(boolean isReferenceOnly) {
		this.isReferenceOnly = isReferenceOnly;
	}
	
}
