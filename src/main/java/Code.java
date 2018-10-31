import cn.org.rapid_framework.generator.GeneratorFacade;

public class Code {

    public static void main(String[] args) throws Exception{
        String myTemplates = ClassLoader.getSystemResource("myTemplates").toString();
        System.out.println(myTemplates);
        GeneratorFacade g=new GeneratorFacade();
        g.getGenerator().addTemplateRootDir(myTemplates);
        //删除生成器的输出目录//
//        g.deleteOutRootDir();
//        g.deleteByAllTable();
        g.generateByTable("t_user");



    }
}
