package services;

public class PatologiaService {
	
	public PatologiaDTO buscarPatologiaPorID(int idn) throws Throwable
	{
		PatologiaDTO pdto = null;
		PatologiaDAO pdao = new PatologiaDAO();
		pdto = pdao.getPatologiaPorID(idn);
		
		/**
		 * a�adir generar estadistica (actualizar)
		 */
		
		return pdto;
	}

	public PatologiaDTO buscarPatologiaPorNombre(String nombre)
	{
		return null;
	}
}
