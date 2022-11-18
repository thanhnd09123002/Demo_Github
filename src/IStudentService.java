
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dungna89
 */
public interface IStudentService {
  /*
    1. Trong interface phương thức không có body code
    2. Trong interface không bao giờ có private và sẽ luôn là public kể cả khi các bạn để phươn thức ở dạng mặc định
  */
  public String add(Student st);//Thêm sv
  public String edit(Student st);//Sửa sv
  public String delete(String msv);//Xóa sv
  public List<Student> find(String txt);//Tìm Kiếm sv //Tìm gần đúng nên trả ra LIST 
  public List<Student> getlstStudents();//Lấy danh sách sinh viên
  public int getIndexByID(int id);
  public int getMaxID() ;
  public void fake5Data();
}
