package com.tantian.model;

import java.util.List;
import java.util.Vector;

public class FileList {
	private Vector<String> fileList ;
	
	public FileList(Vector fileList){
		this.fileList = fileList;
	}
	
	public boolean setFileList(Vector fileList){
		this.fileList = fileList;
		return true;
	}
	
	public Vector<String> getFileList(){
		return this.fileList;
	}
}
