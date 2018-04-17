package com.example.yeizz.datapuzzle_cop;

/**
 * Created by yeizz on 4/10/2018.
 */

public class FileFragment {

    public static final String TABLE_NAME = "FileFragments";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_FileFragments_Origin = "Origin_File";
    public static final String COLUMN_FileFragments_First = "File_Fragment_1";
    public static final String COLUMN_FileFragments_Second = "File_Fragment_2";
    public static final String COLUMN_FileFragments_Third = "File_Fragment_3";

    private int id;
    private String FileOriginName;
    private String FileFragmentNameOne;
    private String FileFragmentNameTwo;
    private String FileFragmentNameThree;



    // Create table SQL query
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_FileFragments_Origin + " TEXT,"
                    + COLUMN_FileFragments_First + " TEXT,"
                    + COLUMN_FileFragments_Second + " TEXT,"
                    + COLUMN_FileFragments_Third + " TEXT"
                    + ")";


    public FileFragment() {
    }

    public FileFragment(int id, String fileFragments_Origin, String fileFragments_First, String fileFragments_Second, String fileFragments_Third) {
        this.id = id;
        this.FileOriginName = fileFragments_Origin;
        this.FileFragmentNameOne = fileFragments_First;
        this.FileFragmentNameTwo = fileFragments_Second;
        this.FileFragmentNameThree = fileFragments_Third;
    }

    public int getId() {
        return id;
    }

    public String FileOriginName() {
        return FileOriginName;
    }

    public void setFileOriginName(String fileOriginName){
        this.FileOriginName = fileOriginName;
    }

    public void setFileFragmentNameOne(String fileFragmentNameOne){
        this.FileFragmentNameOne = fileFragmentNameOne;
    }

    public void setFileFragmentNameTwo(String fileFragmentNameTwo){
        this.FileFragmentNameTwo = fileFragmentNameTwo;
    }

    public void setFileFragmentNameThree(String fileFragmentNameThree){
        this.FileFragmentNameThree = fileFragmentNameThree;
    }



}
