package br.com.kennycode.shoumen.dao;

public interface BaseDAO<T> {

	public T save(T objectToSave);
	public T update(T objectToUpdate);
	public T remove(T objectToDelete);
	public T findByUuid(T objectToFind);
	public boolean isExist(T objectToFind);

}