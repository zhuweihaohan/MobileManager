package vo;

import java.util.Date;

public class customer {
private int customerId;
private String idType;
private String idNumber;
private String CustomerName;
private Date CustomerBirthday;
private String CustomerSex;
private String CustomerAddress;
public customer(){}
public customer( String idType,String idNumber,String CustomerName,Date CustomerBirthday,String CustomerSex,String CustomerAddress){
this.setCustomerAddress(CustomerAddress);
this.setCustomerBirthday(CustomerBirthday);

this.setCustomerName(CustomerName);
this.setCustomerSex(CustomerSex);
this.setIdNumber(idNumber);
this.setIdType(idType);
}
public customer(int customerId,String idType,String idNumber,String CustomerName,Date CustomerBirthday,String CustomerSex,String CustomerAddress){
this.setCustomerAddress(CustomerAddress);
this.setCustomerBirthday(CustomerBirthday);
this.setCustomerId(customerId);
this.setCustomerName(CustomerName);
this.setCustomerSex(CustomerSex);
this.setIdNumber(idNumber);
this.setIdType(idType);
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getIdType() {
	return idType;
}
public void setIdType(String idType) {
	this.idType = idType;
}
public String getIdNumber() {
	return idNumber;
}
public void setIdNumber(String idNumber) {
	this.idNumber = idNumber;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}

public Date getCustomerBirthday() {
	return CustomerBirthday;
}
public void setCustomerBirthday(Date customerBirthday) {
	CustomerBirthday = customerBirthday;
}
public String getCustomerSex() {
	return CustomerSex;
}
public void setCustomerSex(String customerSex) {
	CustomerSex = customerSex;
}
public String getCustomerAddress() {
	return CustomerAddress;
}
public void setCustomerAddress(String customerAddress) {
	CustomerAddress = customerAddress;
}
@Override
public String toString() {
	return "customer [customerId=" + customerId + ", idType=" + idType + ", idNumber=" + idNumber + ", CustomerName="
			+ CustomerName + ", CustomerBirthday=" + CustomerBirthday + ", CustomerSex=" + CustomerSex
			+ ", CustomerAddress=" + CustomerAddress + "]";
}

}
