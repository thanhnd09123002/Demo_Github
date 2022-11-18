/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dungna89
 */
public class Student extends Person {

  private String msv;
  private int nganhHoc;

    public Student() {
    }

    public Student(int id, String ten, String sdt, String msv, int nganhHoc, int gioitinh) {
        super(id, ten, sdt, gioitinh);
        this.msv = msv;
        this.nganhHoc = nganhHoc;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public int getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(int nganhHoc) {
        this.nganhHoc = nganhHoc;
    }



}
