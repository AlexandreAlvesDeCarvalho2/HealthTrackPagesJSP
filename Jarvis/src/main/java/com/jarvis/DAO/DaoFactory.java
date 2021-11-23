package com.jarvis.DAO;


	
	public abstract class DaoFactory {
		public static EXERCICIODAO getEXERCICIODAO(){
		return new EXERCICIODAOImpl();
		}
		
		public static LOGINDAO getLOGINDAO(){
		return new LOGINDAOImpl();
		}	
		
}
