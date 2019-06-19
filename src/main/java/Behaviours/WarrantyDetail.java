package Behaviours;

public enum WarrantyDetail {

    DIAMOND(8),
    GOLD(4),
    SILVER(1);

    private final int value;

    WarrantyDetail(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
