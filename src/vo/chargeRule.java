package vo;

public class chargeRule {
private String funcId;
private String chargeCode;
private String funcName;
public String getFuncId() {
	return funcId;
}
public void setFuncId(String funcId) {
	this.funcId = funcId;
}
public String getChargeCode() {
	return chargeCode;
}
public void setChargeCode(String chargeCode) {
	this.chargeCode = chargeCode;
}
public String getFuncName() {
	return funcName;
}
public void setFuncName(String funcName) {
	this.funcName = funcName;
}
@Override
public String toString() {
	return "chargeRule [funcId=" + funcId + ", chargeCode=" + chargeCode + ", funcName=" + funcName + "]";
}

}
