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
//         * �����Ӳ�������account�����һ����¼
//         */
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        try {
//            //1.��ȡ����
//            //conn = DButils.getConnection();
//            conn= DButils.getDataSource().getConnection();
//            //2.����sql
//            String sql = "insert into place_cam values(?,?)";
//            //3.��ȡpstmt����
//            pstmt = conn.prepareStatement(sql);
//            //4.������ֵ
//            pstmt.setString(1,"peng");
//            pstmt.setLong(2,30);
//            //5.ִ��sql
//            int count = pstmt.executeUpdate();
//            System.out.println(count);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            //6. �ͷ���Դ
//            //DButils.closeAll(count,pstmt,conn);
//            pstmt.close();
//            conn.close();
//        }
//    }
//
//}