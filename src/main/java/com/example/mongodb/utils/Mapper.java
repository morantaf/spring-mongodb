package com.example.mongodb.utils;

import java.util.List;

public interface Mapper<M, D> {

    List<D> toDtoList(List<M> modelList);

    D toDto(M model);
}
