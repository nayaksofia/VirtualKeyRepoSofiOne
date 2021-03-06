package com.sofi.lo;

import java.io.IOException;
import java.util.List;

import com.sofi.exception.FileNameNotFoundException;
import com.sofi.model.FileDetail;


public interface FileManagerLO {
	public FileDetail createFile(String name) throws IOException;
	public boolean deteteFile(String name) throws FileNameNotFoundException;
	public List<FileDetail> getAllFiles();
	public boolean searchFile(String name);
	boolean deleteFile(String name) throws FileNameNotFoundException;

}
