package com.bandiClasses.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author S556186
 *
 */
@Entity
public class Trainer {
	@Id
	private int trainerId;
	private String TrainerName;
	private String trainerAddress;
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return TrainerName;
	}
	public void setTrainerName(String trainerName) {
		TrainerName = trainerName;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", TrainerName=" + TrainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}
	
}
