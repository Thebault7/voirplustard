package fr.voirplustard.dal.site;

import java.sql.SQLException;

import fr.voirplustard.BusinessException;
import fr.voirplustard.bo.Site;

public interface SiteDAO {

	public Site selectionnerParNom(String nomSite)  throws SQLException, BusinessException;
}