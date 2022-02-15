package in.nareshit.raghu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AppointmentId;
	private String AppointmentDate;
	private String AppointmentDetails;
	private Integer AppointmentSlots;
	
	
	
	
}
