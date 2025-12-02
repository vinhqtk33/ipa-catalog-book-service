package com.ipa.catelogbook.service.mapper;

import com.ipa.catelogbook.domain.Book;
import com.ipa.catelogbook.service.dto.BookDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Book} and its DTO {@link BookDTO}.
 */
@Mapper(componentModel = "spring")
public interface BookMapper extends EntityMapper<BookDTO, Book> {}
