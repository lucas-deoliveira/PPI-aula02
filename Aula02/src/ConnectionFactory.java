import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Connection conectar() throws SQLException {
	    String servidor = "localhost";
		String porta = "3306";
		String database = "aula00";
		String usuario = "alunos";
		String senha = "alunos@123";
		return DriverManager.getConnection("jdbc:mysql://"+servidor+":"+porta+"/"+database+"?useSSL=true&useTimezone=true&serverTimezone=UTC", usuario, senha);
	
	}
	
	public static void desconectar(Connection conexao) throws SQLException {
		conexao.close();
	}
}
