package services;

public class PatologiaService {
	
	public PatologiaDTO buscarPatologiaPorID(int idn) throws Throwable
	{
		PatologiaDTO pdto = null;
		PatologiaDAO pdao = new PatologiaDAO();
		pdto = pdao.getPatologiaPorID(idn);
		
		/**
		 * añadir generar estadistica (actualizar)
		 */
		
		return pdto;
	}

	public PatologiaDTO buscarPatologiaPorNombre(String nombre)
	{
		return null;
	}
}
