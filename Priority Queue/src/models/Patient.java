package models;

public class Patient {

	String name;
	String sympton;
	String emergencyCode;
	int emergencyCodeInt;
	
	public Patient(String name, String sympton, String emergencyCode) {
		
		this.name = name;
		this.sympton = sympton;
		this.emergencyCode = emergencyCode;
		
		switch (emergencyCode) {
		
		case " A":
			this.emergencyCodeInt = 1;
			break;
			
		case " B":
			this.emergencyCodeInt = 2;
			break;
			
		case " C":
			this.emergencyCodeInt = 3;
			break;
			
		case " D":
			this.emergencyCodeInt = 4;
			break;
			
		case " E":
			this.emergencyCodeInt = 5;
			break;
			
		default:
			this.emergencyCodeInt = 0;
			break;
		
		}
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
	 * @return the sympton
	 */
	public String getSympton() {
		return sympton;
	}
	/**
	 * @param sympton the sympton to set
	 */
	public void setSympton(String sympton) {
		this.sympton = sympton;
	}
	/**
	 * @return the emergencyCode
	 */
	public String getEmergencyCode() {
		return emergencyCode;
	}
	/**
	 * @param emergencyCode the emergencyCode to set
	 */
	public void setEmergencyCode(String emergencyCode) {
		this.emergencyCode = emergencyCode;
	}
	/**
	 * @return the emergencyCodeInt
	 */
	public int getEmergencyCodeInt() {
		return emergencyCodeInt;
	}
	/**
	 * @param emergencyCodeInt the emergencyCodeInt to set
	 */
	public void setEmergencyCodeInt(int emergencyCodeInt) {
		this.emergencyCodeInt = emergencyCodeInt;
	}
	
}
