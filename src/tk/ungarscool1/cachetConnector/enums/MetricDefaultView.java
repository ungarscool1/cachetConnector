package tk.ungarscool1.cachetConnector.enums;

public enum MetricDefaultView {
	LAST_HOUR(0), LAST_12_HOURS(1), WEEK(2), MONTH(3);
	
	private int defaultView;
	
	public int getDefaultView() {
		return this.defaultView;
	}
	
	private MetricDefaultView(int defaultView) {
		this.defaultView = defaultView;
	}
	
}
