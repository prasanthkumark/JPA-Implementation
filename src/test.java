import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class test {

    public static void main(String args[]){
        EntityManager em = Persistence.createEntityManagerFactory("NewPersistenceUnit").createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        List employeeList = em.createQuery("select e from Employee e").getResultList();

    }
}
