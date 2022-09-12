package com.question.one;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input[] = {
			"Server1, Database, MySQL, 5.5",
			"Server2, Database, MySQL, 5.1",
			"Server3, OS, Ubuntu, 12.04",
			"Server1, OS, Ubuntu, 12.04",
			"Server2, OS, Ubuntu, 18.04",
			"Server3, Language, Python, 2.6.3"
		};
		
		List<SoftwareDetails> softwareList = new ArrayList<SoftwareDetails>();

		for(int i=0; i<input.length; i++) {
			String currentInput = input[i];
			String[] currentInputArray = currentInput.split(",");
			SoftwareDetails softwareDetails = new SoftwareDetails();
			softwareDetails.setServerName(currentInputArray[0]);
			softwareDetails.setSoftwareType(currentInputArray[1]);
			softwareDetails.setSoftwareName(currentInputArray[2]);
			softwareDetails.setVersion(currentInputArray[3]);
			softwareList.add(softwareDetails);
		}
		
		for(SoftwareDetails details : softwareList) {
			System.out.println(details.getServerName() + " " + details.getSoftwareName());
		}
	}

}
