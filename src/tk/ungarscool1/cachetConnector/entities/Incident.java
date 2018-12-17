package tk.ungarscool1.cachetConnector.entities;

import java.security.Timestamp;

import tk.ungarscool1.cachetConnector.enums.IncidentStatus;

public class Incident {

	private int id;
	private Component component;
	private String name;
	private IncidentStatus status;
	private boolean visible;
	private String message;
	private Timestamp scheduled_at;
	private Timestamp created_at;
	private Timestamp updated_at;
	private Timestamp deleted_at;
	private String humain_status;
	
	public Incident(int id, Component component, String name, IncidentStatus status, boolean visible, String message, Timestamp scheduled_at, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at) {
		this.id = id;
		this.component = component;
		this.name = name;
		this.status = status;
		this.visible = visible;
		this.message = message;
		this.scheduled_at = scheduled_at;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.humain_status = (status.name());
	}

	public String getHumain_status() {
		return humain_status;
	}
	
	public Timestamp getDeletedAt() {
		return this.deleted_at;
	}
	
	public Timestamp getScheduledAt() {
		return this.scheduled_at;
	}
	
	public Timestamp getUpdatedAt() {
		return this.updated_at;
	}
	
	public Timestamp getCreatedAt() {
		return this.created_at;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public boolean getVisible() {
		return this.visible;
	}
	
	public IncidentStatus getStatus() {
		return this.status;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Component getComponent() {
		return this.component;
	}
	
	public int getId() {
		return this.id;
	}
}
