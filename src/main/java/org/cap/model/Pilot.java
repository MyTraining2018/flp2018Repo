package org.cap.model;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Pilot {
	
	@Id
	private int pilotId;
	@NotEmpty(message="Please enter firstName")
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Date dateOfJoin;
	private Boolean isCertified;
	private double salary;
	
	public Pilot() {
		
	}
	

	public Pilot(int pilotId, String firstName, String lastName, Date dateOfBirth, Date dateOfJoin, Boolean isCertified,
			double salary) {
		super();
		this.pilotId = pilotId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoin = dateOfJoin;
		this.isCertified = isCertified;
		this.salary = salary;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public int getPilotId() {
		return pilotId;
	}
	public void setPilotId(int pilotId) {
		this.pilotId = pilotId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getDateOfJoin() {
		return dateOfJoin;
	}


	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}


	public Boolean getIsCertified() {
		return isCertified;
	}

	public void setIsCertified(Boolean isCertified) {
		this.isCertified = isCertified;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Pilot [pilotId=" + pilotId + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", dateOfJoin=" + dateOfJoin + ", isCertified=" + isCertified + ", salary=" + salary
				+ "]";
	}
	
	
	

}
