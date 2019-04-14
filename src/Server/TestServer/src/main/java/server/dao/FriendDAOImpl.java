package server.dao;

import java.util.List;

import server.entity.Friend;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * The type Friend dao.
 */
@Repository
public class FriendDAOImpl implements FriendDAO {

    /**
     * The Session factory.
     */
    @Autowired
    public SessionFactory sessionFactory;


    @Override
    public List<Friend> getFriends(final String user_name_entry) {

        Session currentSession = sessionFactory.getCurrentSession();

        Query query = currentSession.createSQLQuery(
                "select * from friend "
                       + "where user_name_entry=:user_name_entry")
                .addEntity(Friend.class).setParameter(
                        "user_name_entry", user_name_entry);

        List<Friend> friends = query.getResultList();

        return friends;
    }

    @Override
    public List<Friend> getFriends() {

        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createSQLQuery(
                "select * from friend").addEntity(Friend.class);
        List<Friend> friends = query.getResultList();
        return friends;
    }

    @Override
    public Friend saveFriend(final Friend theFriend) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theFriend);
        return theFriend;
    }

    @Override
    public int deleteFriend(final int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createSQLQuery(
                "delete from friend where id=:id").
                addEntity(Friend.class).setParameter(
                        "id", id);
        query.executeUpdate();
        return id;
    }
}











