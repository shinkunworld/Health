package model;

public class HealthCheckLogic {
public void execute(Health health) {
	//BMI���
	double weight=health.getWeight();
	double height=health.getHeight();
	double bmi=weight/(height/100.0*height/100.0);
	health.setBmi(bmi);
	
//	BMI�������� ü���� �Ǵ��ؼ� ����
	String bodyType;
	if(bmi<18.5) {
		bodyType="under weight";
	}else if (bmi<25) {
		bodyType="standard weight";
	}else {
		bodyType="obesity";
	}
health.setBodytype(bodyType);}
}
