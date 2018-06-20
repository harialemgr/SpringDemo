package com.hari;
import com.hari.service.addService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/addd")
	public ModelAndView add(HttpServletResponse res,HttpServletRequest req)
	{
		int i=Integer.parseInt(req.getParameter("t1"));
		int j=Integer.parseInt(req.getParameter("t2"));
		addService s=new addService();
int k=s.add(i, j);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
				
	}

}
