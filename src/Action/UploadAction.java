package Action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ActionForm.UploadForm;
import org.apache.struts.upload.FormFile;

import java.io.*;

public class UploadAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        UploadForm uploadForm=(UploadForm)form;
        FormFile myfile=uploadForm.getMyFile();



        String type=myfile.getContentType();
        String name=myfile.getFileName();
        int size=myfile.getFileSize();
        System.out.println(type);
        System.out.println(name);
        System.out.println(size);


        FileOutputStream fos=null;
        try{
            ServletContext application=this.getServlet().getServletContext();
            String realPath=application.getRealPath("/自定义路径/");



            byte [] data=myfile.getFileData();
            fos=new FileOutputStream(realPath+"/"+name);
            fos.write(data);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                fos.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

//        InputStream is=myfile.getInputStream();
//        BufferedReader br=new BufferedReader(new InputStreamReader(is));is



        return new ActionForward("/upload.jsp");
    }
}
