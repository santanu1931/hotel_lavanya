
 


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Add_data {

	public static int insert(Userbean eb) throws SQLException
	{
		Connection con=DbConnection.getCon();
		String insert="insert into h_login values(?,?,?,?,?,?)";
		PreparedStatement ps1=con.prepareStatement(insert);
		ps1.setString(1, eb.getFname());
		ps1.setString(2, eb.getLname());
		ps1.setString(3, eb.getAddr());
		ps1.setString(4, eb.getMailid());
		ps1.setString(5, eb.getPwd());
		ps1.setLong(6, eb.getPhno());
		
	return ps1.executeUpdate();
	}
}
