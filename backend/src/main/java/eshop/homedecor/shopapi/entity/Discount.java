package eshop.homedecor.shopapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "discount")
@Entity
public class Discount {
	/**
	 * 
	 */
	@Id
	@Column(name="id")
	private String id;
	@Column(name="status")
	private Long status;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public Discount(){
		
	}

}
