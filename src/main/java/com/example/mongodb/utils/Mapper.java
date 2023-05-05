package com.example.mongodb.utils;

import java.util.List;

public interface Mapper<M, D> {

    List<D> toDtoList(List<M> model);

    D toDto(M model);
}
