package service;

import model.Produto;

public abstract class DescontoService {   

    public abstract double calcularTaxaDesconto(Produto produto);
}