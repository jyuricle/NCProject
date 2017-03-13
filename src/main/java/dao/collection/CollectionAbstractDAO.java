package dao.collection;

import java.util.Map;

/**
 * @author Yurii Krat
 * @version 1.0
 * @since 06.03.17.
 */
public interface CollectionAbstractDAO<T, K>{

    /**
     * Inserts object into database
     * @param obj object to insert
     */
    void insert(T obj);

    /**
     * Gets all objects of concrete entity from database
     * @return all objects from database
     */
    Map<K, T> findAll();

    /**
     * Updates object in database
     * @param obj object to update
     */
    void update(T obj);

    /**
     * Finds object in database by primary key
     * @param key primary key
     * @return found object
     */
    T get(K key);

    /**
     * Removes object from database
     * @param obj object to remove
     */
    T delete(T obj);

}
