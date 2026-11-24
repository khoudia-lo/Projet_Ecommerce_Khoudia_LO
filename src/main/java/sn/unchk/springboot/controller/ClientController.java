package sn.unchk.springboot.controller;

import sn.unchk.springboot.entity.Client;
import sn.unchk.springboot.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    // POST : Pour ajouter un client
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    // GET : Pour voir tous les clients
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.listClients();
    }
}