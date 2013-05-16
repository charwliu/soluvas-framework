package org.soluvas.data.person;

import org.soluvas.commons.Person;
import org.soluvas.data.repository.PagingAndSortingRepository;

/**
 * {@link Person} repository that supports paging and sorting.
 * @author ceefour
 */
public interface PersonRepository extends
		PagingAndSortingRepository<Person, String> {

	boolean existsBySlug(String slug);

	Person findOneBySlug(String slug);

}