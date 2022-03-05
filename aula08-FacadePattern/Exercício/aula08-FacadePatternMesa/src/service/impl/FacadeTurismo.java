package service.impl;

import model.Viagem;
import service.IFacadeTurismo;

public class FacadeTurismo implements IFacadeTurismo {
    // Armazenam nas variáveis as instâncias
    private VooApi vooAPI;
    private HotelApi hotelAPI;

    // Construtor que cria as instâncias
    public FacadeTurismo() {
        vooAPI = new VooApi();
        hotelAPI = new HotelApi();
    }

    // Simplifica as buscas de voos e hotéis
    public Viagem buscar(Viagem viagem) {
        viagem.setLinhaAerea(vooAPI.buscarVoos(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getOrigem(), viagem.getDestino()));
        viagem.setHotel(hotelAPI.buscarHoteis(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getDestino()));

        return viagem;
    }
}
