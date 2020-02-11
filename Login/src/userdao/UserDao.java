package userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbutil.DBUtil;

public class UserDao {

	private DBUtil db;
	
	public boolean findUser(String userName,String userPassword) {
		Connection connection = db.getConnection();
		String sql = "select * from db_user where userName=? and userPassword=?";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, userName);
			prepareStatement.setString(2, userPassword);
			ResultSet resultSet = prepareStatement.executeQuery();
			while(resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return false;		
	}
}
