package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private final DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        String sql = "SELECT `breed` FROM `dinosaur` WHERE `actual` > `expected` ORDER BY breed";
        List<String> result = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            getResultset(result, rs);
        } catch (SQLException se) {
            throw new IllegalStateException("Can't select dinosaur", se);
        }
        return result;
    }

    private void getResultset(List<String> result, ResultSet rs) throws SQLException {
        while (rs.next()) {
            String name = rs.getString("breed");
            result.add(name);
        }
    }
}
