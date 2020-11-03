package ParkingApp.Model.Space;

import ParkingApp.Hibernate.HibernateUtil;

import java.util.List;
import java.util.Optional;

public class SpaceRepository {
    public Optional<List<Space>> findEmptySpaces(String query){
            try {
                var session = HibernateUtil.getSessionFactory().openSession();
                var transaction = session.beginTransaction();

                var result = session.createQuery(query, Space.class).list();

                transaction.commit();
                session.close();
                return Optional.ofNullable(result);
            } catch (NullPointerException exception){
                throw new NullPointerException("query is a null object!");
        }
    }
    public Optional<Space> findById(int id){
        {
            var session = HibernateUtil.getSessionFactory().openSession();
            var transaction = session.beginTransaction();

            var result = session.get(Space.class, id);
            transaction.commit();
            session.close();
            return Optional.ofNullable(result);
        }
    }
    public void updateSpace(Space space){
        {
            var session = HibernateUtil.getSessionFactory().openSession();
            var transaction = session.beginTransaction();

            session.saveOrUpdate(space);

            transaction.commit();
            session.close();
        }
    }
}
