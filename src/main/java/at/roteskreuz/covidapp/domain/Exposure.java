package at.roteskreuz.covidapp.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author zolika
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exposure implements Serializable {
	
	@Id
	private String exposureKey;

	private Integer transmissionRisk;
	
	private String appPackageName;
	
	//@Convert(converter = StringToListConverter.class)
	private String regions;
	
	private Integer intervalNumber;
	
	private Integer intervalCount;
	
	private LocalDateTime createdAt;
	
	private Boolean localProvenance;
	
	@Column(name = "sync_id")
	private Long federationSyncID;
	
	private String diagnosisType;

	public Exposure(String exposureKey, Integer transmissionRisk, String regions, Integer intervalNumber, Integer intervalCount) {
		this.exposureKey = exposureKey;
		this.transmissionRisk = transmissionRisk;
		this.regions = regions;
		this.intervalNumber = intervalNumber;
		this.intervalCount = intervalCount;
	}
	
	

}
