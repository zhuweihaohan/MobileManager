package vo;

public class toperator {
private String operatorId;
private String operatorName;
private String operatorPwd;
private String idAdmin;
public String getOperatorId() {
	return operatorId;
}
public void setOperatorId(String operatorId) {
	this.operatorId = operatorId;
}
public String getOperatorName() {
	return operatorName;
}
public void setOperatorName(String operatorName) {
	this.operatorName = operatorName;
}
public String getOperatorPwd() {
	return operatorPwd;
}
public void setOperatorPwd(String operatorPwd) {
	this.operatorPwd = operatorPwd;
}
public String getIdAdmin() {
	return idAdmin;
}
public void setIdAdmin(String idAdmin) {
	this.idAdmin = idAdmin;
}
@Override
public String toString() {
	return "toperator [operatorId=" + operatorId + ", operatorName=" + operatorName + ", operatorPwd=" + operatorPwd
			+ ", idAdmin=" + idAdmin + "]";
}

}
