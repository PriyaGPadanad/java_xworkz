package com.xworkz.airlines.servlet;

import com.xworkz.airlines.dto.AirlinesDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/airlines",loadOnStartup = 1)
public class AirlinesServlet extends HttpServlet {

  public  AirlinesServlet(){
      System.out.println("no-arg constructor");
  }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      int id=Integer.parseInt(req.getParameter("id"));
      String airlinesName= req.getParameter("name");
      String source= req.getParameter("source");
      String destination= req.getParameter("destination");
      String flightCode= req.getParameter("flightCode");
      String classType= req.getParameter("classType");
      String mealType= req.getParameter("mealType");
      String international= req.getParameter("international");
      Boolean international1 = Boolean.parseBoolean("internatinal");

      AirlinesDTO airlinesDTO=new AirlinesDTO(id,airlinesName,source,destination,flightCode,classType,mealType,international);
        System.out.println("id="+id+"Name="+airlinesName+"source="+source+"destination="+destination+"flightCode="+flightCode+"classType="+classType+"mealType="+mealType+"international="+international1);

        req.setAttribute("dto",airlinesDTO);

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("airlinesResult.jsp");
        requestDispatcher.forward(req,resp);
    }
}
