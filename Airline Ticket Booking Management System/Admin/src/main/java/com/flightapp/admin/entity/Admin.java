package com.flightapp.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Admin_details")
public class Admin {
			
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id ;
		public Admin() {
			super();
		}
		@Column(name = "firstName")
			private String firstName;
		@Column(name = "lastName")
			private String lastName;
		@Column(name = "password")
		private String password;
		public Admin(int id, String firstName, String lastName, String password) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}


}
