package config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
    private static final HikariDataSource ds;
    static {
        HikariConfig cfg = new HikariConfig();
        cfg.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/capstone?useSSL=false&serverTimezone=UTC");
        cfg.setUsername("root");    // ganti sesuai MySQL-mu
        cfg.setPassword("");        // ganti jika pakai password

        // ❌ HAPUS baris ini:
        // cfg.setDriverClassName("com.mysql.cj.jdbc.Driver");

        // (opsional) tuning
        cfg.setMaximumPoolSize(10);
        cfg.setMinimumIdle(2);
        cfg.addDataSourceProperty("cachePrepStmts", "true");
        cfg.addDataSourceProperty("prepStmtCacheSize", "250");
        cfg.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        ds = new HikariDataSource(cfg);
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}

