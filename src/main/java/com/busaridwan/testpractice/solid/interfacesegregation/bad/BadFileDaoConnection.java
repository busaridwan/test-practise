package com.busaridwan.testpractice.solid.interfacesegregation.bad;

public class BadFileDaoConnection implements BadDAOInterface{
    @Override
    public void openConnection() {
        throw new UnsupportedOperationException("Open DB Connection not supported");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
