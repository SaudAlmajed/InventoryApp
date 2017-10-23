package com.example.saudalmajed.inventoryapp.data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;



public class ProductContract {
    public static final String CONTENT_AUTHORITY = "com.example.saudalmajed.inventoryapp";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_INVENTORY = "inventory";

    public ProductContract() {
    }

    public static final class InventoryEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_INVENTORY);
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORY;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORY;

        public final static String TABLE_NAME = "product";

        public final static String _ID = BaseColumns._ID;
        public final static String COL_NAME = "name";
        public final static String COL_QUANTITY = "quantity";
        public final static String COL_PRICE = "price";
        public final static String COL_DESCRIPTION = "description";
        public final static String COL_ITEMS_SOLD = "sales";
        public final static String COL_SUPPLIER = "supplier";
        public final static String COL_PICTURE = "picture";

        public static Uri buildInventoryURI(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }
}
