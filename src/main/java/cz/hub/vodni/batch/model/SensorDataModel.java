package cz.hub.vodni.batch.model;
/*
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sensor_data")

public class SensorDataModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Represented as 'MM-dd-yyyy'
	@Getter @Setter private double min;
	@Getter @Setter private double avg;
	@Getter @Setter private double max;

	// Represented as 'MM-dd-yyyy'
	@Getter @Setter private  String date;
    // List representing measurements in Fahrenheit
	@Getter @Setter private List<Double> measurements;
    
    public SensorDataModel(double max){
		this.min = 0;
		this.avg = 0;
		this.max = max;
		this.date = "";
		this.measurements = null; 	
    }
    
    @Override
	public String toString() {
		return "ID:" + id + "Measurement: " + " min: " + min + "avg: " + avg
				+ " max : " + max + "date: " + date + " values: " + measurements;
	}
    
}

*/
