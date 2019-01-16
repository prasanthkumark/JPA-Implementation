import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class test {

    public static void main(String args[]){
        EntityManager em = Persistence.createEntityManagerFactory("NewPersistenceUnit").createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        //em.createQuery("select * from ");

    }
}
