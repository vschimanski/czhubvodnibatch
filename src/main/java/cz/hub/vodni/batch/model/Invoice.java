package cz.hub.vodni.batch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "invoice_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String number;
	@Getter
	@Setter
	private Double amount;
	@Getter
	@Setter
	private Double discount;
	@Getter
	@Setter
	private Double finalAmount;
	@Getter
	@Setter
	private String location;
}
