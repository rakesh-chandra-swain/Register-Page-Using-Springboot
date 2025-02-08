package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.domain.Register;
import com.nt.repository.RegisterRepository;

@Service
public class ResisterSericeImpl implements ResisterService {
	
	@Autowired
    private RegisterRepository registerRepository;

	@Override
	public Register saveRegister(Register register) {
		 return registerRepository.save(register);
		
	}

}
