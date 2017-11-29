package ejbs;

import dtos.TeacherDTO;
import entities.Teacher;
import entities.User;
import exceptions.EntityAlreadyExistsException;
import exceptions.EntityDoesNotExistsException;
import exceptions.MyConstraintViolationException;
import exceptions.Utils;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolationException;

@Stateless
public class TeacherBean {

    @PersistenceContext
    private EntityManager em;

    public void create(String username, String password, String name, String email, String office)
            throws EntityAlreadyExistsException {
        
    }

    public void update(String username, String name, String email, String office)
            throws EntityDoesNotExistsException, MyConstraintViolationException {
        
    }

    public List<TeacherDTO> getAllTeachers() {
        return null;
    }

    public List<TeacherDTO> getSujectTeachers(int subjectCode)
            throws EntityDoesNotExistsException {
       return null;
    }

    public List<TeacherDTO> getTeachersNotInSubject(int subjectCode)
            throws EntityDoesNotExistsException {
        return null;
    }

    public void addSubjectTeacher(int subjectCode, String username)
            throws EntityDoesNotExistsException {
        
    }

    public void removeSubjectTeacher(int subjectCode, String username)
            throws EntityDoesNotExistsException {
        
    }

    TeacherDTO teacherToDTO(Teacher teacher) {
        return null;
    }

    List<TeacherDTO> teachersToDTOs(List<Teacher> teachers) {
        return null;
    }
    
}
