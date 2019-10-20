package sqlserver;

import java.sql.*;

public class Operate {
	
	public static void Add(String book_id,String book_name,int max_lvl) {
		String sql="INSERT INTO books(book_id,book_name,max_lvl) values(?,?,?)";
		Connection con=null;
		PreparedStatement pst=null;		
		try {
			con = Connectivity.getConnection();
			con.setAutoCommit(false);	//取消自动提交
			pst = con.prepareStatement(sql);
			pst.setString(1,book_id);
			pst.setString(2, book_name);
			pst.setInt(3, max_lvl);
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
	
	public static void Delete(String book_id) {
		String sql="DELETE books where book_id =?";
		Connection con=null;
		PreparedStatement pst=null;		
		try {
			con = Connectivity.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1,book_id);
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
	
	public static void UpDate(String book_id,String book_name) {
		String sql="UPDATE books SET book_name =? where book_id =?";
		Connection con=null;
		PreparedStatement pst=null;		
		try {
			con = Connectivity.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1,book_name);
			pst.setString(2,book_id);
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
				String str1 = re.getString("book_id");
				String str2 = re.getString("book_name");
				int int1 = re.getInt("max_lvl");
				System.out.println(str1+str2+"\t"+int1);
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
