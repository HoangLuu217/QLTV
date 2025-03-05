import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {

    // Lấy tất cả các bản ghi từ bảng
    List<T> getAll() throws SQLException;

    // Tìm một bản ghi theo ID
    T getById(String id) throws SQLException;

    // Thêm một bản ghi mới
    void insert(T entity) throws SQLException;

    // Cập nhật một bản ghi
    void update(T entity) throws SQLException;

    // Xóa một bản ghi theo ID
    void delete(String id) throws SQLException;
}