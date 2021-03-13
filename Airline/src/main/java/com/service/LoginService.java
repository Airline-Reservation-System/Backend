package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;

	public List<Login> getAllUserData() {
		List<Login> a = loginRepository.findAll();

		//Login w = a.stream().filter(i -> username.equals(i.getUsername()) && password.equals(i.getPassword())
				//&& typeofuser.equals(i.getTypeofuser())).findAny().orElse(null);
		//System.out.println(w);
		return a;
	}

	public String addUserData(Login l) {
		Optional<Login> op = loginRepository.findById(l.getId());
		if (op.isPresent()) {
			return "Record already present";
		} else {
			Login log = loginRepository.save(l); // save the records
			if (log != null) {
				return "Record stored successfully";
			} else {
				return "Record didn't store";
			}
		}
	}

	public String updatePasswordData(Login l) {
		Optional<Login> obj = loginRepository.findById(l.getId());
		if (obj.isPresent()) {
			Login log = obj.get();
			log.setPassword(l.getPassword());
			loginRepository.saveAndFlush(log);
			return "Record updated successfully";
		} else {
			return "Record not present";
		}
	}

	public String deleteUserData(int id) {
		if (loginRepository.existsById(id)) {
			loginRepository.deleteById(id);
			return "Record deleted successfully";
		} else {
			return "Record not present";
		}
	}
}
