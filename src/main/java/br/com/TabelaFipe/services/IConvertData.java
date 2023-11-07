package br.com.TabelaFipe.services;

public interface IConvertData {
    <T> T getData (String json, Class<T> classe);
}
