package co.istad.chhaya.elearning.features.category;

import co.istad.chhaya.elearning.features.category.dto.CategoryRequest;
import co.istad.chhaya.elearning.features.category.dto.CategoryResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category categoryRequestToCategory(CategoryRequest categoryRequest);

    CategoryResponse categoryToCategoryResponse(Category category);

}
