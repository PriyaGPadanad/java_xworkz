package com.xworkz.airlines.service;

import com.xworkz.airlines.dto.AirlinesDTO;

public class AirlinesServiceImp implements AirlinesService{
    @Override
    public String validate(AirlinesDTO airlinesDTO) {
        return "false";
    }
}
