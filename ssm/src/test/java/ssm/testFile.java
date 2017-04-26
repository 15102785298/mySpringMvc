package ssm;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.tantian.utils.FileUtils;

public class testFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "F:\\myBlog";
		FileUtils a = new FileUtils();
		List<String> name = a.getAllFileName(filePath);
		Map<String, String> data = a.getAllFile(filePath);

		int length = name.size();

		for(int i = 0;i<length ; i++){
			System.out.println(name.get(i)+"::::"+data.get(name.get(i)));
		}
	}

}
