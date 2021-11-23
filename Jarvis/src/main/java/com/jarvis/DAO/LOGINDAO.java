package com.jarvis.DAO;

import java.util.List;

import com.jarvis.entity.*;

public interface LOGINDAO {
	
	List<LOGIN> buscarPorEmail(String email, String senha);
	
}

