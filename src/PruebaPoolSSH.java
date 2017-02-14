

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.Pool;


/**
 * Servlet implementation class PruebaPoolSSH
 */
@WebServlet("/PruebaPoolSSH")
public class PruebaPoolSSH extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaPoolSSH() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String select_pat = "Select id_patol from Patologias where nom_patol = 'Queratocono'";
		Pool pool = null;
		pool = Pool.getInstance();
		Connection con = pool.getConnection();
		Statement st = null;
		ResultSet rs = null;
		int id_patol = -5;
		try {
			st = con.createStatement();
			rs = st.executeQuery(select_pat);
			rs.next();
			id_patol = rs.getInt("id_patol");
			response.getWriter().append("ID QUERATOCONO: ").append(""+id_patol);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			pool.liberarRecursos(con, st, rs);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
