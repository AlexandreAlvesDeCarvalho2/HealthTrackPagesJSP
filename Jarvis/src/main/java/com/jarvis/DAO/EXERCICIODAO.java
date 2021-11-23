package com.jarvis.DAO;

import java.util.List;

import com.jarvis.entity.*;

public interface EXERCICIODAO {
	
	void gravar(EXERCICIO exercicio);
	List<EXERCICIO> buscarPorID(int id);
	void atualizar (EXERCICIO exercicio);
	void remover (int id);
	
}

