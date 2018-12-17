package tk.ungarscool1.cachetConnector.entities;

import java.security.Timestamp;

public class Subscriber {

	private int id;
	private String email;
	private String verify_code;
	private Timestamp verified_at;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public Subscriber(int id, String email, String verify_code, Timestamp verified_at, Timestamp created_at, Timestamp updated_at) {
		this.id = id;
		this.email = email;
		this.verify_code = verify_code;
		this.verified_at = verified_at;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public int getId() {
		return this.id;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getVerifyCode() {
		return this.verify_code;
	}
	
	public Timestamp getVerifiedAt() {
		return this.verified_at;
	}
	
	public Timestamp getUpdatedAt() {
		return this.updated_at;
	}
	
	public Timestamp getCreatedAt() {
		return this.created_at;
	}
	
}
