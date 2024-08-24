import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector { //javaとデータベースをつなぐために自分たちで作るファイル。

	private static String driverName="com.mysql.jdbc.Driver"; //JDBCのドライバー名を変数に代入

	private static String url=
			"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false"; //？以降はオプション。

	private static String user="root";
    private static String password ="";

    public Connection getConnection(){  //接続状態にする
    	Connection con=null;  //初期化

    	try{
    		Class.forName(driverName);
    		con=DriverManager.getConnection(url,user,password);
    	}catch(ClassNotFoundException e){  //クラスが見つからない場合
    		e.printStackTrace();
    	}catch(SQLException e){  //データベース処理に関する例外
    		e.printStackTrace();
    	}
    	return con;
    }
//↑javaの例外処理。ドライバーがロードされ使えるようにしている。暗記。
}
