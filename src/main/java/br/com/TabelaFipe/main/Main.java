package br.com.TabelaFipe.main;

import br.com.TabelaFipe.services.APIConsumption;

import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    private APIConsumption apiConsumption = new APIConsumption();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void displayMenu() {
        var menu =
                """
                *** OPÇÕES ***
                 - Carro
                 - Moto
                 - Caminão             
                Digite uma das opções acima: 
                 """;
        System.out.println(menu);
        var option = input.nextLine();
        String address = "";

        if (option.toLowerCase().contains("carr")) {
            address = URL_BASE + "carros/marcas";
        } else if (option.toLowerCase().contains("mot")) {
            address = URL_BASE + "motos/marcas";
        }else if(option.toLowerCase().contains("cami")){
            address = URL_BASE + "caminhoes/marcas";
        }else{
            System.out.println("[ERRO] Nenhuma da opções foi selecionada! Por favor tente novamente.");
        }

        var json = apiConsumption.getData(address);
        System.out.println(json);
    }

}
