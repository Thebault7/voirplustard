package fr.voirplustard.bll;

import java.sql.SQLException;

import fr.voirplustard.BusinessException;
import fr.voirplustard.bo.Proprietaire;
import fr.voirplustard.dal.DAOFactory;
import fr.voirplustard.dal.proprietaire.ProprietaireDAO;

public class ProprietaireManager {

	private ProprietaireDAO proprietaireDAO;
	private static ProprietaireManager instanceProprietaireManager = null;
	
	private ProprietaireManager() {
		this.proprietaireDAO = DAOFactory.getProprietaireDAO();
	}
	
	public static ProprietaireManager getInstance() {
		if (instanceProprietaireManager == null) {
			instanceProprietaireManager = new ProprietaireManager();
		}
		return instanceProprietaireManager;
	}
	
	public Proprietaire selectionnerParNom(String nom) throws SQLException, BusinessException, Exception {
		return this.proprietaireDAO.selectionnerParNom(nom);
	}
	
	public int chercherMaxId() throws SQLException, BusinessException, Exception {
		return this.proprietaireDAO.chercherMaxId();
	}
	
	public int ajouter(Proprietaire proprietaire) throws SQLException, BusinessException, Exception {
		return this.proprietaireDAO.ajouterProprietaire(proprietaire);
	}
	
	public Proprietaire selectionnerParId(int id) throws SQLException, BusinessException, Exception {
		return this.proprietaireDAO.selectionnerParId(id);
	}
}
