package tk.ungarscool1.cachetConnector.entities;

import java.security.Timestamp;

import tk.ungarscool1.cachetConnector.enums.MetricCalculation;
import tk.ungarscool1.cachetConnector.enums.MetricDefaultView;

public class Metric {
	
	private int id;
	private String name;
	private String suffix;
	private String description;
	private float default_value;
	private MetricCalculation calc_type;
	private boolean display_chart;
	private Timestamp created_at;
	private Timestamp updated_at;
	private MetricDefaultView defaultView;
	
	public Metric(int id, String name, String suffix, String description, float default_value, MetricCalculation calc_type, boolean display_chart, Timestamp created_at, Timestamp updated_at, MetricDefaultView defaultView) {
		this.id = id;
		this.name = name;
		this.suffix = suffix;
		this.description = description;
		this.default_value = default_value;
		this.calc_type = calc_type;
		this.display_chart = display_chart;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.defaultView = defaultView;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSuffix() {
		return this.suffix;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public float getDefaultValue() {
		return this.default_value;
	}
	
	public MetricCalculation getCalcType() {
		return this.calc_type;
	}
	
	public boolean getDisplayChart() {
		return this.display_chart;
	}
	
	public Timestamp getCreatedAt() {
		return this.created_at;
	}
	
	public Timestamp getUpdatedAt() {
		return this.updated_at;
	}

	public MetricDefaultView getDefaultView() {
		return this.defaultView;
	}
}