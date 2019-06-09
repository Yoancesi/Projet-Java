package model;

import java.io.IOException;

import java.util.Observable;

import contract.IModel;

public final class Model extends Observable implements IModel {

private char map[][];

protected Launcher table;

public Model(int level) throws IOException {
	super();
	table = new Launcher(level);
	table.launcher();
	
	this.setMap(table.getTable());
	}
	@Override
	public char[][] getMap() {
		return map;
	}
	
	public void setMap(char map[][]) {
	this.map = map;
	this.setChanged();
	this.notifyObservers();
	}

	@Override
	public Observable getObservable() {
		return this;
	}
}
