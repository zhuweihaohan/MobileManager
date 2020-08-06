package vo;

public class charge {
private String chargeCode;
private String chargeName;
private double charge;
public String getChargeCode() {
	return chargeCode;
}
public void setChargeCode(String chargeCode) {
	this.chargeCode = chargeCode;
}
public String getChargeName() {
	return chargeName;
}
public void setChargeName(String chargeName) {
	this.chargeName = chargeName;
}
public double getCharge() {
	return charge;
}
public void setCharge(double charge) {
	this.charge = charge;
}
@Override
public String toString() {
	return "charge [chargeCode=" + chargeCode + ", chargeName=" + chargeName + ", charge=" + charge + "]";
}

}
