import javax.xml.crypto.Data;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        Connection conn = DatabaseConfig.getConnection();

        PreparedStatement pstmt = conn.prepareStatement(
                "UPDATE tasks SET title = ?, description = ? where id = ?"
        );

        pstmt.setString(1, "Updated JDBC Task");
        pstmt.setString(2, "This description is updated suing JDBC");
        pstmt.setInt(3, 1);

        int rows = pstmt.executeUpdate();

        if (rows > 0)
            System.out.println("Task updated successfully");
        else
            System.out.println("No record found for update");

        pstmt.close();
        conn.close();
    }

    }
