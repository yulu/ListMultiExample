package com.example.listmuttiexample;

public class ReceiptModel {
	/**
	 * The receipt ID
	 */
	private String receiptId;
	
	/**
	 * The receipt attributes for list display
	 */
	private String amount;
	private String logoUrl;
	private String retailName;
	private String date;
	private String category;
	
	/**
	 * The original receipt as an txt file
	 */
	private String txtUrl;
	
	/**
	 * Flags
	 */
	private boolean selected; 
	private boolean visible;
	
	public ReceiptModel(String amount, String logoUrl, String retailName, String date, String category, String txtUrl){
		this.amount = amount;
		this.logoUrl = logoUrl;
		this.retailName = retailName;
		this.date = date;
		this.category = category;
		this.txtUrl = txtUrl;
		
		selected = false;
		visible = true;
	}
	/**
	 * receiptId: setter and getter
	 */
	public String getReceiptId(){
		return receiptId;
	}
	public void setReceiptId(String receiptId){
		this.receiptId = receiptId;
	}
	
	/**
	 * Amount: setter and getter
	 */
	public String getAmount(){
		return amount;
	}
	public void setAmount(String amount){
		this.amount = amount;
	}
	
	/**
	 * logoUrl: setter and getter
	 */
	public String getLogoUrl(){
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl){
		this.logoUrl = logoUrl;
	}
	
	/**
	 * retailName: setter and getter
	 */
	public String getRetailName(){
		return retailName;
	}
	public void setRetailName(String retailName){
		this.retailName = retailName;
	}
	
	/**
	 * date: setter and getter
	 */
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date = date;
	}
	
	/**
	 * category: setter and getter
	 */
	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category = category;
	}
	
	/**
	 * txtUrl: setter and getter
	 */
	public String getTxtUrl(){
		return txtUrl;
	}
	public void setTxtUrl(String txtUrl){
		this.txtUrl = txtUrl;
	}
	
	/**
	 * selected: setter and getter
	 */
	public boolean isSelected(){
		return selected;
	}
	public void setSelected(boolean selected){
		this.selected = selected;
	}
	
	/**
	 *visible: setter and getter 
	 */
	public boolean isVisible(){
		return visible;
	}
	public void setVisible(boolean visible){
		this.visible = visible;
	}
}