package in.nareshit.raghu.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="spec_tab")
public class Specialization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="spec_id_col")
	private Long specId;
	
	
	@Column(name="spec_code_col")
	private String specCode;
	
	@Column(name="spec_name_col")
	private String specName;
	
	@Column(name="spec_note_col")
	private String specNote;
	
	public Long getSpecId() {
		return specId;
	}

	public void setSpecId(Long specId) {
		this.specId = specId;
	}

	public String getSpecCode() {
		return specCode;
	}

	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSpecNote() {
		return specNote;
	}

	public void setSpecNote(String specNote) {
		this.specNote = specNote;
	}

	@Override
	public String toString() {
		return "Specialization [specId=" + specId + ", specCode=" + specCode + ", specName=" + specName + ", specNote="
				+ specNote + "]";
	}

}
