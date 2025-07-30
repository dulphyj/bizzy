package com.gomzaloencinas.bizzy.infrastructure.mapper;
import com.gomzaloencinas.bizzy.domain.model.CategoryProduct;
import com.gomzaloencinas.bizzy.infrastructure.entity.CategoryProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryProductMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name")
    })
    CategoryProduct toCategoryProduct(CategoryProductEntity categoryProductEntity);
    Iterable<CategoryProduct> toCategoryProducts(Iterable<CategoryProductEntity> categoryProductEntities);

    @InheritInverseConfiguration
    CategoryProductEntity toCategoryProductEntity(CategoryProduct categoryProduct);
}
