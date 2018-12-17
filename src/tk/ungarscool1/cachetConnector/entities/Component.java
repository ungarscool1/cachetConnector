package tk.ungarscool1.cachetConnector.entities;

import java.sql.Timestamp;

import tk.ungarscool1.cachetConnector.enums.ComponentStatus;

public class Component {

	private int id;
	private String name;
	private String description;
	private String link;
	private ComponentStatus status;
	private int order;
	private int group_id;
	private Timestamp created_at;
	private Timestamp updated_at;
	private Timestamp deleted_at;
	private String status_name;
	private String[] tags;
	
	public Component(int id, String name, String description, String link, ComponentStatus status, int order, int group_id, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at, String[] tags) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.order = order;
		this.group_id = group_id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.status_name = status.name();
		this.tags = tags;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLink() {
		return this.link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public ComponentStatus getStatus() {
		return this.status;
	}
	
	public void setStatus(ComponentStatus status) {
		this.status = status;
		this.status_name = status.name();
	}
	
	public int getOrder() {
		return this.order;
	}
	
	public int getGroupId() {
		return this.group_id;
	}
	
	public Timestamp getUpdatedAt() {
		return this.updated_at;
	}
	
	public void setUpdatedAt(String timestamp) {
		this.updated_at = Timestamp.valueOf(timestamp);
	}
	
	public Timestamp getCreatedAt() {
		return this.created_at;
	}
	
	public Timestamp getDeletedAt() {
		return this.deleted_at;
	}
	
	public String getStatusName() {
		return this.status_name;
	}
	
	public String[] getTags() {
		return this.tags;
	}
	
	
}