package ejbs;

import dtos.StudentDTO;
import entities.Student;
import exceptions.EntityAlreadyExistsException;
import exceptions.EntityDoesNotExistsException;
import exceptions.MyConstraintViolationException;
import exceptions.StudentEnrolledException;
import exceptions.SubjectNotInCourseException;
import exceptions.Utils;
import exceptions.StudentNotEnrolledException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolationException;

@Stateless
public class StudentBean {

    @PersistenceContext
    private EntityManager em;

    public void create(String username, String password, String name, String email, int courseCode)
         throws EntityAlreadyExistsException, EntityDoesNotExistsException, MyConstraintViolationException {

    }
    

    public List<StudentDTO> getAll() {
        try {
            //converter a lista de estudantes
            List<Student> students = (List<Student>) em.createNamedQuery("getAllStudents").getResultList();
            List<StudentDTO> dtos = new LinkedList<>();
            
            return studentsToDTOs(students);
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
    }

    public Student getStudent(String username) {
        try {
            Student student = em.find(Student.class, username);
            return student;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
    }

    public void update(String username, String password, String name, String email) 
        throws EntityDoesNotExistsException, MyConstraintViolationException{
        
    }

    public void remove(String username) throws EntityDoesNotExistsException {
        
    }

    public void enrollStudent(String username, int subjectCode) 
            throws EntityDoesNotExistsException, SubjectNotInCourseException, StudentEnrolledException{

    }
    
    public void unrollStudent(String username, int subjectCode) 
            throws EntityDoesNotExistsException, StudentNotEnrolledException {
        
    }
    
    public List<StudentDTO> getEnrolledStudents(int subjectCode) throws EntityDoesNotExistsException{

        return null;
    }

    public List<StudentDTO> getUnrolledStudents(int subjectCode) throws EntityDoesNotExistsException{
       return null;
    }

    StudentDTO studentToDTO(Student student) {
        return null;
    }

    List<StudentDTO> studentsToDTOs(List<Student> students) {
        return null;
}
}
