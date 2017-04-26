package com.tantian.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.omg.CORBA_2_3.portable.InputStream;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.sun.tools.javac.file.Paths;

public class FileUtils {

	public static int BeginCharLength = 88;

	/***
	 * @author tantian ͨ���ļ�·����ȡ���ļ����������ļ����ļ���
	 */
	public List<String> getAllFileName(String filePath) {
		Vector<String> vector = new Vector<String>();
		File[] files = new File(filePath).listFiles();
		int len = files.length;
		for (int i = 0; i < len; i++) {
			String tmp = files[i].getAbsolutePath();
			if (files[i].isDirectory())
				System.out.println("�����ļ��У�\"" + files[i].getAbsolutePath() + "\"��鿴��");
			else
				vector.add(tmp); // ������ļ�����ֱ������ļ�����ָ�����ļ���
		}
		return vector;
	}

	/***
	 * @author tantian ͨ���ļ�·����ȡ���ļ��������е��ļ�
	 */
	public Map<String, String> getAllFile(String filePath) {
		Map<String, String> result = new HashMap<String, String>();
		File[] files = new File(filePath).listFiles();
		int len = files.length;
		for (int i = 0; i < len; i++) {
			String tmp = files[i].getAbsolutePath();
			if (files[i].isDirectory())
				System.out.println("�����ļ��У�\"" + files[i].getAbsolutePath() + "\"��鿴��");
			else
				result.put(files[i].getAbsolutePath(), readFile(files[i])); // ������ļ�����ֱ������ļ�����ָ�����ļ���
		}
		return result;

	}

	/***
	 * @author tantian ͨ���ļ�����ȡ�ļ�����
	 */
	public String readFileByName(String fileName) throws IOException {
		FileInputStream in = null;
		try {
			in = new FileInputStream(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String res = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			String data = null;
			int i = 0;
			while ((data = br.readLine()) != null && i++ < 2)
				res += (data + "\n");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return res;
	}

	/***
	 * @author tantian ͨ���ļ���ȡ�ļ�����
	 */
	public String readFile(File file) {
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String res = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String data = null;
			int i = 0;
			try {
				while ((data = br.readLine()) != null && i++ < 2)
					res += (data + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return res;
	}

	/***
	 * @author tantian ͨ���ļ�����ȡ�ļ�����
	 */
	public String readFileBegin(String fileName) throws IOException {
		FileInputStream in = null;
		try {
			in = new FileInputStream(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String res = "";
		int charLength = 0;
		int charBeforeLength = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			String data = null;
			Boolean flag = Boolean.TRUE;
			while ((data = br.readLine()) != null && flag) {
				char line[] = data.toCharArray();
				charLength += line.length;
				if (charLength < BeginCharLength) {
					res += data;
					charBeforeLength += line.length;
				} else if (charLength == BeginCharLength) {
					res += data;
					res += "...";
					return res;
				} else {
					res += getStringToIndex(line, BeginCharLength - charBeforeLength);
					res += "...";
					return res;
				}
			}
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		res += "...";
		return res;
	}

	private String getStringToIndex(char[] data, int index) {
		String string_data = new String(data);
		return string_data.substring(0, index);
	}

	public String getShowName(String fileName) {
		return fileName.substring(fileName.lastIndexOf("\\") + 1, fileName.indexOf("."));
	}

	/**
	 * @author tantian ��ȡ�ļ�ʱ��
	 */
	public String getCreateTime(String fileName) {
		String strTime = "UNKNOW TIME";
		File file = new File(fileName);
		Long time = file.lastModified();
		Calendar cd = Calendar.getInstance();
		cd.setTimeInMillis(time);
		strTime = cd.getTime().toString();
		return strTime;
	}

}
