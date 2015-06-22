package com.hsp.domain;

import java.util.Set;

public class Department {

		private Integer id;
		private String name;
		private Set<Employee> emps;
		
		public Department(){
			
		}
		
		
		public Department(String name) {
			
			this.name = name;
		}


		/**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the emps
		 */
		public Set<Employee> getEmps() {
			return emps;
		}
		/**
		 * @param emps the emps to set
		 */
		public void setEmps(Set<Employee> emps) {
			this.emps = emps;
		}
		
}
