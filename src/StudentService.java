/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class StudentService implements IStudentService {

    Scanner _sc;
    String _input;
    List<Student> _lstStudents;
    Student _student;
    Utilities _Utilities;

    public StudentService() {
        _sc = new Scanner(System.in);
        _lstStudents = new ArrayList<Student>();
        _Utilities = new Utilities();

    }

  public void fake5Data() {
      _lstStudents.add(new Student(1,"Nguyễn Viết Dũng","0334139158","DungNVPH1",1,1));      
      _lstStudents.add(new Student(2,"Vũ Tiến Long","0385760138","LongVTPH2",1,1));
      _lstStudents.add(new Student(3,"Nguyễn Phương Nam","0393459356","NamNPPH3",1,1));
      _lstStudents.add(new Student(4,"Vũ Phương Thảo","0986888999","ThaoVPPH4",2,2));
      _lstStudents.add(new Student(5,"Trần Đức Bo","0986111222","BoTDPH5",3,3));

  }
    //LOADING Danh sách sinh viên
    @Override
   public List<Student> getlstStudents(){
       return _lstStudents;
   }
    
    //Chức năng : Thêm
    @Override
    public String add(Student st) {

        if (st == null) {
            return "Thêm thất bại";
        }
        _lstStudents.add(st);

        return "Thêm thành công";
    }
    //Chức năng : Sửa
    @Override
    public String edit(Student st) {
        int index = getIndexByID(st.getId());
        if (index == -1) {
            return "Không tìm thấy";
        }
        _lstStudents.get(index).setTen(st.getTen());
        _lstStudents.get(index).setMsv(_Utilities.msvFpoly(st.getTen(), getMaxID(), 0));
        _lstStudents.get(index).setSdt(st.getSdt());
        _lstStudents.get(index).setNganhHoc(st.getNganhHoc());
        return "Đã sửa thành công";
    }
    //Chức năng : Xóa
    @Override
    public String delete(String msv) {
        int index = getIndexByID(Integer.parseInt(msv));
        if (index == -1) {
            return "Không tìm thấy";
        }
        _lstStudents.remove(index);
        return "Đã xóa thành công";
    }
    //Chức năng : Tìm kiếm
    @Override
    public List<Student> find (String txt) {
        var lstFindST = new ArrayList<Student>();
        for (Student x : _lstStudents) {
              if (x.getTen().toLowerCase().contains(txt.toLowerCase())|| _Utilities.boDau(x.getTen()).toLowerCase().contains(txt.toLowerCase()) || x.getMsv().toLowerCase().contains(txt.toLowerCase())){
                  lstFindST.add(x);
              }
        }
        return lstFindST;
    }

    //Code các chức năng CRUD của đối tượng 
    @Override
    public int getMaxID() {
        if (_lstStudents.isEmpty()) {
            return 1;
        }
        int max = _lstStudents.get(0).getId();
        for (Student x : _lstStudents) {
            if (max < x.getId()) {
                max = x.getId();
            }
        }
        return max+1;
    }
    @Override
    public int getIndexByID(int id) {
        for (int i = 0; i < _lstStudents.size(); i++) {
            if (_lstStudents.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }





}
