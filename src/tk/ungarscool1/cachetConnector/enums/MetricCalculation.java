package tk.ungarscool1.cachetConnector.enums;

public enum MetricCalculation {
	SUM(0), AVERAGE(1);
	
	private int calculation;
	
	public int getCalculation() {
		return this.calculation;
	}
	
	private MetricCalculation(int calculation) {
		this.calculation = calculation;
	}
}
