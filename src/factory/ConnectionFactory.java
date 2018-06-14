package factory; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
* Classe para concexção com o banco de dados
* 
* @author Jacques G. Silva leandro Reis
*  
*/
public class ConnectionFactory {
     public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost/projetojava","root","116340");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
}