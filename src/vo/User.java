package vo;

public class User {
private int userId;
private int customerId;
private int accountId;
private String mobileNumber;
private String roamingStatus;
private String comLevel;
public User(int userId,int customerId,int accountId,String mobileNumber,String roamingStatus,String comLevel){
this.setAccountId(accountId);
this.setComLevel(comLevel);
this.setCustomerId(customerId);
this.setMobileNumber(mobileNumber);
this.setRoamingStatus(roamingStatus);
this.setUserId(userId);
	
	
}
public User(){}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getRoamingStatus() {
	return roamingStatus;
}
public void setRoamingStatus(String roamingStatus) {
	this.roamingStatus = roamingStatus;
}
public String getComLevel() {
	return comLevel;
}
public void setComLevel(String comLevel) {
	this.comLevel = comLevel;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", customerId=" + customerId + ", accountId=" + accountId + ", mobileNumber="
			+ mobileNumber + ", roamingStatus=" + roamingStatus + ", comLevel=" + comLevel + "]";
}

}
