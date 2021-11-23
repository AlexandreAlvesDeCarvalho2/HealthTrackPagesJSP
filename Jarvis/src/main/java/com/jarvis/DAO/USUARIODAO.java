package com.jarvis.DAO;

import java.util.List;
import com.jarvis.entity.USUARIO;

public interface USUARIODAO {
	
	void gravar(USUARIO usuario);
	List<USUARIO> buscarPorID(int id);
	void atualizar (USUARIO usuario);
	void remover (int id);
	
	
}
