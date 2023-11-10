package br.com.tabelafipe.service;

import java.util.List;

public interface IConvertData {

    <T> T getData(String json, Class<T> classe);

    <T> List<T> getList(String json, Class<T> classe);
}
