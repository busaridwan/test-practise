package com.busaridwan.testpractice.solid.interfacesegregation.bad;

public class BadDBDaoConnection implements BadDAOInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
        throw new UnsupportedOperationException("Open File not supported");
    }

    @Override
    public void deleteRecord() {

    }
}
