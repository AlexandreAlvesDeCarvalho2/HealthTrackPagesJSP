package com.jarvis.test;

import java.util.List;

import com.jarvis.DAO.DaoFactory;
import com.jarvis.DAO.EXERCICIODAO;
import com.jarvis.DAO.LOGINDAO;
import com.jarvis.DAO.USUARIODAO;
import com.jarvis.entity.USUARIO;
import com.jarvis.entity.EXERCICIO;
import com.jarvis.entity.LOGIN;






public class Executable {
	
	public static void main(String[] args) {
		
		try {
			
			
//----------------------------------------CRUD-EXERCICIO -----------------------------------------------		

			EXERCICIO exercicio = new EXERCICIO();
			EXERCICIODAO dao = DaoFactory.getEXERCICIODAO();
			
			LOGIN login = new LOGIN();
			LOGINDAO dao2 = DaoFactory.getLOGINDAO();
			
			//=-=-=-=-=-=-=-=- Gravar EXERCICIO -=-=-=-=-=-=-=-=-=-=-			
			
			exercicio.setDT_REGISTRO("18/11/21");
			exercicio.setNM_HORA("21:00");
			exercicio.setINTENSIDADE("média");
			exercicio.setDURACAO(45);
			exercicio.setCALORIAS(200);
			exercicio.setOBSERVACAO("Futbol com a turma da faculdade" );
			exercicio.setCD_USUARIO(3);
			exercicio.setCD_TIPO_USUARIO(3);
			
			//dao.gravar(EXERCICIO);  // 		
			
			//=-=-=-=-=-=-=-=- atualizar EXERCICIO -=-=-=-=-=-=-=-=-=-=-			
			
			exercicio.setCD_REGISTRO(26);
			exercicio.setDT_REGISTRO("19/11/21");
			exercicio.setNM_HORA("20:00");
			exercicio.setINTENSIDADE("média");
			exercicio.setDURACAO(30);
			exercicio.setCALORIAS(155);
			exercicio.setOBSERVACAO("Futbol com a turma do trabalho " );
			exercicio.setCD_USUARIO(3);
			exercicio.setCD_TIPO_USUARIO(3);
			
			//dao.atualizar(EXERCICIO);
			
			//=-=-=-=-=-=-=-=- BuscarPorID EXERCICIO -=-=-=-=-=-=-=-=-=-=-	
			
			
			List<EXERCICIO> exercicios = dao.buscarPorID(3);
			for(EXERCICIO c: exercicios) {
				System.out.println(c.toString());
			}
			
			
			//=-=-=-=-=-=-=-=- Remover EXERCICIO -=-=-=-=-=-=-=-=-=-=-		
			
			//dao.remover(26);
				
			
			
			//=-=-=-=-=-=-=-=- Buscar Login & Senha EXERCICIO -=-=-=-=-=-=-=-=-=-=-		
			
			List<LOGIN> logins = dao2.buscarPorEmail("aline.santos@email.com","senha1234");
			for(LOGIN c: logins) {
				System.out.println(c.toString());
			}
		
			
			
			
			} catch (Exception e) {
				System.err.println("Erro ao enviar os arquivos");
				e.printStackTrace();

				
			
	}

		
}
}
