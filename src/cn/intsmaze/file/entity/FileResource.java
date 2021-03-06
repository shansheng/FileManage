package cn.intsmaze.file.entity;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;

import cn.intsmaze.user.entity.User;

public class FileResource implements Serializable{
	
	private String fileResourceid;//文件id
	private String name;//名称
	private String filesrc;//文件链接地址
	private String size;
	
	private String swfsrc;//文件预览地址
	
	
	
	public String getSwfsrc() {
		return swfsrc;
	}

	public void setSwfsrc(String swfsrc) {
		this.swfsrc = swfsrc;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFileResourceid() {
		return fileResourceid;
	}

	public void setFileResourceid(String fileResourceid) {
		this.fileResourceid = fileResourceid;
	}

	public String getFilesrc() {
		return filesrc;
	}

	public void setFilesrc(String filesrc) {
		this.filesrc = filesrc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FileResource [fileResourceid=" + fileResourceid + ", name="
				+ name + ", filesrc=" + filesrc + ", size=" + size + "]";
	}

	
}
