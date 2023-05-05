package com.example.gestionreclamation.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
    @Id
	@NotNull
	@Size(min = 4, max = 100)
	private String username;

	@Size(min = 4, max = 100)
	private String password;

	@NotNull
	private boolean active = false;

	@NotNull
	private String email;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Reclamation> reclamation; 
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "reset_token")
	private String resetToken;

	public String getResetToken() {
		return resetToken;
	}

	

	

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

	/* @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Collection<UsersRoles> roles; */

	public User() {
	}

	public List<Reclamation> getReclamation() {
		return reclamation;
	}

	public void setReclamation(List<Reclamation> reclamation) {
		this.reclamation = reclamation;
	}

	public User(String username, String password, Boolean active) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/* public Collection<UsersRoles> getRoles() {
		return roles;
	} 

	public void setRoles(Collection<UsersRoles> roles) {
		this.roles = roles;
	}
*/
	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return username;
	}

}
