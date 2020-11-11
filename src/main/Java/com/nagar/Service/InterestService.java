package com.nagar.Service;

import com.nagar.Model.InterestModel;

public class InterestService {
	
	
	public InterestModel compute(int amount,int time) {
		InterestModel model = new InterestModel();
		int interest = (amount*time*10)/100;
		int net = interest+amount;
		model.setAmount(amount);
		model.setTime(time);
		model.setInterest(interest);
		model.setNet(net);
		return model;
	}

}
