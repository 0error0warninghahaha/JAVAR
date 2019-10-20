package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sqlserver.Connectivity;

public class Operate {
	
	public static void Add(int id,String name) {
		String sql="INSERT INTO book(id,name) values(?,?)";
		Connection con=null;
		PreparedStatement pst=null;
		try {
			con = Connectivity.getConnection();
			con.setAutoCommit(false);	//取消自动提交
			pst = con.prepareStatement(sql);
			pst.setInt(1,id);
			pst.setString(2, name);
			int e = pst.executeUpdate();
			con.commit();		//提交
			System.out.println("影响行数:"+e+"\n"+"添加成功！");
			pst.close();
			con.close();
		} 
		catch (SQLException e) {
			// TODO 自动生成的 catch 块
			try {
				con.rollback();		//回滚
			} catch (SQLException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			e.printStackTrace();
		}			
	}
	
	public static void Delete(int id) {
		String sql="DELETE book where id =?";
		Connection con=null;
		PreparedStatement pst=null;		
		try {
			con = Connectivity.getConnection();
			pst = con.prepareStatement(sql);
			pst.setInt(1,id);
			int e = pst.executeUpdate();
			System.out.println("影响行数:"+e+"\n"+"删除成功！");
			pst.close();
			con.close();
		} 
		catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}			
	}
	
	public static void UpDate(int id,String name) {
		String sql="UPDATE book SET name =? where id =?";
		Connection con=null;
		PreparedStatement pst=null;		
		try {
			con = Connectivity.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1,name);
			pst.setInt(2,id);
			int e = pst.executeUpdate();
			System.out.println("影响行数:"+e+"\n"+"更新成功！");
			pst.close();
			con.close();
		} 
		catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}			
	}
	
	public static void Select() {
		String sql="SELECT *FROM books";
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet re=null;
		try {
			con = Connectivity.getConnection();
			pst = con.prepareStatement(sql);
			re = pst.executeQuery();
			while(re.next()) {
				int int1 = re.getInt("id");
				String str2 = re.getString("name");
				System.out.println(int1+"\t"+str2);
			}
			re.close();
			pst.close();
			con.close();
		} 
		catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}			
	}

}
