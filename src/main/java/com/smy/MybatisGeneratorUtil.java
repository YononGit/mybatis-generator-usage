package com.smy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybatisGeneratorUtil {

	public static void main(String[] args) {
		try {
			deletefile("d:/Yonon/Workspace/mybatis-generator-usage/src/main/java/mapper");
			deletefile("D:/Yonon/workspace/mybatis-generator-usage/src/main/java/com/smy/rms/front/domain");

			System.out.println("start generator ...");
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			File configFile = new File(MybatisGeneratorUtil.class.getResource("../../config_mysql.xml").getFile());
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(new VerboseProgressCallback());
			System.out.println("end generator!");
			System.exit(0);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * * 鍒犻櫎鏌愪釜鏂囦欢澶逛笅鐨勬墍鏈夋枃浠跺す鍜屾枃浠�* @param delpath String * @throws
	 * FileNotFoundException * @throws IOException * @return boolean
	 */
	public static boolean deletefile(String delpath) throws FileNotFoundException, IOException {
		try {
			File file = new File(delpath);
			if (!file.isDirectory()) {
				file.delete();
			} else if (file.isDirectory()) {
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File delfile = new File(delpath + "\\" + filelist[i]);
					if (!delfile.isDirectory()) {
						delfile.delete();
					} else if (delfile.isDirectory()) {
						deletefile(delpath + "\\" + filelist[i]);
					}
				}
				//file.delete();
			}
		} catch (FileNotFoundException e) {
			System.out.println("deletefile() Exception:" + e.getMessage());
		}
		return true;
	}

}
