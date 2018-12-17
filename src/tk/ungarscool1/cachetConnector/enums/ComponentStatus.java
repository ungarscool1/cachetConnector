package tk.ungarscool1.cachetConnector.enums;

public enum ComponentStatus {
	OPERATIONAL(1), PERFORMANCE_ISSUES(2), PARTIAL_OUTAGE(3), MAJOR_OUTAGE(4);
	
	private int statusCode;
	
	public int getCode() {
		return this.statusCode;
	}
	
	private ComponentStatus(int statusCode) {
		this.statusCode = statusCode;
	}
}
