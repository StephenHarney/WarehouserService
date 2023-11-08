package ie.atu.hello;

import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
    private WarehouseService warehouseService;

    public void getWarehouseById(Warehouse warehouse){
        warehouseService.getWarehouseById(warehouse);


}
