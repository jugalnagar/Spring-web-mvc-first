package com.nagar.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagar.Model.InterestModel;
import com.nagar.Service.InterestService;

@Controller
public class InputController {

	@RequestMapping("input")
	public static String showInputPage() {
		return "input.jsp";
	}
	
	@RequestMapping("computinterest")
	public void computeInterest(@RequestParam("t1") int amount,@RequestParam("t2")int time,HttpServletResponse response) {
		InterestService service = new InterestService();
		
		InterestModel model = service.compute(amount, time);
		
		try {
			PrintWriter out = response.getWriter();
			out.print("Amount    :"+model.getAmount());
			out.print("Time      :"+model.getTime());
			out.print("Interest  :"+model.getInterest());
			out.print("Net       :"+model.getNet());
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
