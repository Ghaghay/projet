package Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name="EMPLOYEEDETAIL")
public class EmployeDetail {

		
		@Id
		@Column(name="employee_id", unique=true)
		@GeneratedValue(generator="gen")
		@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="employee"))
		private Long employeeId;
		
		@Column(name="street")
		private String street;

		@Column(name="city")
		private String city;

		@Column(name="state")
		private String state;

		@Column(name="country")
		private String country;
		
		@OneToOne
		@PrimaryKeyJoinColumn
		private Employe employee;

	

		public EmployeDetail(String street, String city, String state, String country) {
			this.street = street;
			this.city = city;
			this.state = state;
			this.country = country;
		}

		public Employe getEmployee() {
			return employee;
		}

		public void setEmployee(Employe employee) {
			this.employee = employee;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public Long getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}
	}





