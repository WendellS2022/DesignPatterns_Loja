package service;

import model.Produto;

public class DescontoServicePadrao extends DescontoService {

    @Override
    public double calcularTaxaDesconto(Produto produto) {
        return (produto.getQuantidade() > 10) ? 0.1
             : (produto.getQuantidade() > 5) ? 0.05
             : 0;
    }

 
}
    

