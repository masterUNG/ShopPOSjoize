package masterung.androidthai.in.th.demotestprint;

public class MyConstant {

    //    Explicit
    private String urlGetUserWhereName = "http://www.brainwakecafe.com/android/getUserWhereName.php";

    private String nameShopString = "Name Shop";

    private String[] titleTabStrings = new String[]{"Bill", "Desk", "Food", "Noti"};

    private String[] billTitleStrings = new String[]{"ยังไม่ชำระ", "สำเร็จ", "ยกเลิก", "สั่งซื้อแบบออนไลด์"};

    private int[] iconBillTitleInts = new int[]{R.drawable.ic_action_bill, R.drawable.ic_action_desk,
            R.drawable.ic_action_food, R.drawable.ic_action_noti};

    private String urlTestReadAllData = "https://jsonplaceholder.typicode.com/users";

    private String urlBillWhereOrder = "http://www.brainwakecafe.com/android/getAllOrder.php";

    private String urlBillDetailWhereOID = "http://www.brainwakecafe.com/android/getAllOrderDetail.php";


    public String getUrlBillDetailWhereOID() {
        return urlBillDetailWhereOID;
    }

    public String getUrlBillWhereOrder() {
        return urlBillWhereOrder;
    }

    public String getUrlTestReadAllData() {
        return urlTestReadAllData;
    }

    public int[] getIconBillTitleInts() {
        return iconBillTitleInts;
    }

    public String[] getBillTitleStrings() {
        return billTitleStrings;
    }

    public String[] getTitleTabStrings() {
        return titleTabStrings;
    }

    public String getNameShopString() {
        return nameShopString;
    }

    public String getUrlGetUserWhereName() {
        return urlGetUserWhereName;
    }
}
