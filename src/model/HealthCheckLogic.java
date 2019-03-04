package model;

public class HealthCheckLogic {
	public void execute(Health health) {
		//BMI계산
		double weight = health.getWeight();
		double height = health.getHeight();
		double bmi = weight / (height / 100.0 * height / 100.0);
		health.setBmi(bmi);

		//	BMI지수에서 체형의 판단해서 설정
		String bodyType;
		if (bmi < 18.5) {
			bodyType = "under weight";
		} else if (bmi < 25) {
			bodyType = "standard weight";
		} else {
			bodyType = "obesity";
		}
		health.setBodyType(bodyType);
	}
}
