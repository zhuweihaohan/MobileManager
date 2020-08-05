package vo;

public class Mobile {
private String mobileNumber;
private String mobileType;
private String cardNumber;
private String idAvailable;
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getMobileType() {
	return mobileType;
}
public void setMobileType(String mobileType) {
	this.mobileType = mobileType;
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
public String getIdAvailable() {
	return idAvailable;
}
public void setIdAvailable(String idAvailable) {
	this.idAvailable = idAvailable;
}
@Override
public String toString() {
	return "Mobile [mobileNumber=" + mobileNumber + ", mobileType=" + mobileType + ", cardNumber=" + cardNumber
			+ ", idAvailable=" + idAvailable + "]";
}

}
