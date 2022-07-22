package com.springboot.customers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerEntity {
		
		@Id
		public int id;
		public String name;
		public int age;
		public String gender;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public CustomerEntity(int id, String name, int age, String gender) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		public CustomerEntity() {
			super();}
		
		
	}

