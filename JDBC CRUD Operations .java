import java.sql.*;

class JDBCExample {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "password");

        Statement st = con.createStatement();

        st.executeUpdate("insert into student values(1,'Ram')");
        ResultSet rs = st.executeQuery("select * from student");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        st.executeUpdate("update student set name='Sam' where id=1");
        st.executeUpdate("delete from student where id=1");

        con.close();
    }
}
