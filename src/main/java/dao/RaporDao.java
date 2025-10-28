package dao;
import model.Rapor;
import java.util.List;

public interface RaporDao {
    void insert(Rapor r);
    List<Rapor> findByStudent(int studentId);
}
