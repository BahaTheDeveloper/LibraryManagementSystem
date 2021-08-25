package project.logic;

import project.model.StudentUser;
import project.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentUserLogic implements CrudI<StudentUser> {
    DbUtil db;
    public StudentUserLogic() {
        try {
            db = new DbUtil();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<StudentUser> search(StudentUser studentUser) {
            List<StudentUser> studentUsers = new ArrayList<>();

        try {
            ResultSet results = db.readData("SELECT * FROM tbl_studentUser where studRegNo = '"+studentUser.getRegNo()+" '");
            while (results.next()){
                studentUser.setRegNo(results.getString("studRegNo"));
                studentUser.setName(results.getString("studName"));
                studentUser.setCourse(results.getString("studCourse"));

                studentUsers.add(studentUser);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return studentUsers;
    }

    @Override
    public boolean delete(StudentUser studentUser) {
        int results=0;
        try {
            results = db.writeData("DELETE FROM tbl_studentUser where studRegNo = '"+studentUser.getRegNo()+ " '");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return results==1;
    }

    @Override
    public boolean add(StudentUser studentUser) {
        int results = 0;
        try {
            results = db.writeData("INSERT INTO tbl_studentUser(studRegNo,studName,studCourse) VALUES ('"+studentUser.getRegNo()+ "', '"+studentUser.getName()+ "', '"+
                    studentUser.getCourse()+ "')");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return results ==1;
    }
}
