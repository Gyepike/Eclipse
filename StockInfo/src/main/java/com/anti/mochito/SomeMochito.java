package com.anti.mochito;

public class SomeMochito {
	
	
	private DataService dataService;

	public SomeMochito(DataService dataService) {
		this.dataService = dataService;
	}

	public int findTheGeatestFromAllData() {
		int[] retirveAllData = dataService.retirveAllData();

		int greatest = Integer.MIN_VALUE;

		for (int value : retirveAllData) {

			if (greatest < value) {
				greatest = value;
			}
		}

		System.out.println(greatest);

		return greatest;
	}
}
