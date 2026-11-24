package sn.unchk.springboot.services;

import sn.unchk.springboot.entity.Client;
import sn.unchk.springboot.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> listClients() {
        return clientRepository.findAll();
    }
}