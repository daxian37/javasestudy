import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class JavaIOFile {

    public static void main(String[] args) throws IOException {
        testJavaIOFileCreate();
        testJavaIOFileDelete();
        testJavaIOFileMulDir();
        testJavaIOFileOutputAllFile();
        testJavaIOFileOutputAllFilesDetail();
        testJavaIOFileOutputSpecificFilesDetail1();
        testJavaIOFileOutputSpecificFilesDetail2();

    }

    //判断指定路径和文件是否存在，不存在就创建
    public static void testJavaIOFileCreate() throws IOException {
        File file = new File("/Users/lishilei/IdeaProjects/javasestudy/out/test1109/text11091.txt");
        //判断目录是否存在，不存在就创建
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        //判断文件是否存在，不存在就创建
        if (!file.exists()) {
            file.createNewFile();
        }

    }

    //删除指定的目录和文件，值得注意的是，如果只是删除指定的目录，目录中还有其他文件或者目录的话，是没办法删除成功的。
    public static void testJavaIOFileDelete() {
        File file = new File("/Users/lishilei/IdeaProjects/javasestudy/out/test1109/text11091.txt");
        file.delete();
        File parentfile = file.getParentFile();
        parentfile.delete();
        System.out.println("删除成功！");
    }

    //当有多个层级的目录不存在时
    public static void testJavaIOFileMulDir() throws IOException {
        File file = new File("/Users/lishilei/IdeaProjects/javasestudy/out/test1109/test1109/text11091.txt");
        //创建多个层级目录
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    //输出指定目录下的所有文件
    public static void testJavaIOFileOutputAllFile() {
        File file = new File("/Users/lishilei/IdeaProjects/javasestudy/out/");
        String[] list = file.list();
        for (String string : list) {
            System.out.println(string);
        }
    }


    //输出指定目录下的所有文件的细信息，包含名字和路径
    public static void testJavaIOFileOutputAllFilesDetail() {
        File file = new File("/Users/lishilei/IdeaProjects/javasestudy/out/");
        File[] list = file.listFiles();
        for (File f : list) {
            System.out.println(f.getName() + "----" + f.getAbsolutePath() + "---------" + f.getTotalSpace());
        }
    }

    //输出指定目录下的所有文件信息（这里输出的只是在当前目录，不会输出子目录下的），要求值包含后缀名为.txt的文件，这个有多个方法，先说第一个，使用String类里面的endsWith（）方法
    public static void testJavaIOFileOutputSpecificFilesDetail1() {
        File file = new File("/Users/lishilei/IdeaProjects/javasestudy/out/test1109/");
        String[] list = file.list();
        for (String s : list) {
            if (s.endsWith(".txt")) {
                System.out.println(s);
            }
        }
    }

    //使用API里面的过滤器，通过匿名内部类来使用过滤器，匿名内部类请参
    public static void testJavaIOFileOutputSpecificFilesDetail2(){
        File file = new File("/Users/lishilei/IdeaProjects/javasestudy/out/test1109/");
        String[] list = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                // TODO Auto-generated method stub
                if(name.endsWith(".txt")){
                    System.out.println("FileDir ------>" + dir);
                    return true;
                }
                return false;
            }
        });
        for (String string : list) {
            System.out.println(string);
        }
    }





}
