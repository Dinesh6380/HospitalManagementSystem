package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorRepository;
@Service
@Transactional
public class Doctorservice {
	@Autowired
	private DoctorRepository repo;
	
	public List<Doctor> listall()
	{
		return repo.findAll();
	}
	public void save(Doctor doctor)
	{
		repo.save(doctor);
		
	}
	public Doctor get(int id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}
	public void delete(int id)
	{
		repo.deleteById(id);
	}
}
