package com.ipa.catelogbook.service;

import com.ipa.catelogbook.service.dto.BookDTO;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.ipa.catelogbook.domain.Book}.
 */
public interface BookService {
    /**
     * Save a book.
     *
     * @param bookDTO the entity to save.
     * @return the persisted entity.
     */
    BookDTO save(BookDTO bookDTO);

    /**
     * Updates a book.
     *
     * @param bookDTO the entity to update.
     * @return the persisted entity.
     */
    BookDTO update(BookDTO bookDTO);

    /**
     * Partially updates a book.
     *
     * @param bookDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<BookDTO> partialUpdate(BookDTO bookDTO);

    /**
     * Get the "id" book.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<BookDTO> findOne(Long id);

    /**
     * Delete the "id" book.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
