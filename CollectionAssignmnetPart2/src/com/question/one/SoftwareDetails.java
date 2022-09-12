package com.question.one;

public class SoftwareDetails {
	
	private String serverName;
	private String softwareType;
	private String softwareName;
	private String version;
	
	
	
//	public SoftwareDetails(String serverName, String softwareType, String softwareName, float version) {
//		super();
//		this.serverName = serverName;
//		this.softwareType = softwareType;
//		this.softwareName = softwareName;
//		this.version = version;
//	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getSoftwareType() {
		return softwareType;
	}
	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Software [serverName=" + serverName + ", softwareType=" + softwareType + ", softwareName="
				+ softwareName + ", version=" + version + "]";
	}
	
	

}
