package Components;

import Behaviours.Warranty;
import Behaviours.WarrantyDetail;

public class Radio extends Component implements Warranty {

    private WarrantyDetail warranty;

    public Radio(String model, String brand, WarrantyDetail warranty) {
        super(model, brand);
        this.warranty = warranty;
    }

    public WarrantyDetail getWarrantyDetail() {
        return warranty;
    }

}
