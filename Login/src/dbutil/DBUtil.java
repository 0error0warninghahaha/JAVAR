package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public Connection getConnection() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/db_user?serverTimezone=GMT";
		String userName = "root";
		String userPwd = "123456";
		Connection DbCon = null;
		try {
			Class.forName(driverName);// 初始化驱动
			System.out.println("加载驱动成功！");
			DbCon = DriverManager.getConnection(dbURL, userName, userPwd);// 建立JDBC和数据库之间的Connection连接
			System.out.println("连接数据库成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DbCon;
	}
}
