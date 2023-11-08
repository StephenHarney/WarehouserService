package ie.atu.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {
    private WarehouseService warehouseService;

    @Autowired
    public void getWarehouseById(WarehouseService warehouseService){
        this.warehouseService = warehouseService;

    }
    @PostMapping("warehouse")
    public Warehouse Warehouse(Warehouse warehouse){
        warehouse.getWarehouseId();
        return warehouse;

    }
}
