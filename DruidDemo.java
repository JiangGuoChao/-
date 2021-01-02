//import com.dtk.www.utils.DButils;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class DruidDemo {
//
//    public static void main(String[] args) throws SQLException {
//        /*
//         * 完成添加操作：给account表添加一条记录
//         */
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        try {
//            //1.获取连接
//            //conn = DButils.getConnection();
//            conn= DButils.getDataSource().getConnection();
//            //2.定义sql
//            String sql = "insert into place_cam values(?,?)";
//            //3.获取pstmt对象
//            pstmt = conn.prepareStatement(sql);
//            //4.给？赋值
//            pstmt.setString(1,"peng");
//            pstmt.setLong(2,30);
//            //5.执行sql
//            int count = pstmt.executeUpdate();
//            System.out.println(count);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            //6. 释放资源
//            //DButils.closeAll(count,pstmt,conn);
//            pstmt.close();
//            conn.close();
//        }
//    }
//
//}