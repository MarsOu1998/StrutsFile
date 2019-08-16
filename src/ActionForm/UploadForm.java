package ActionForm;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class UploadForm extends ActionForm {
    private FormFile myFile;

    public FormFile getMyFile() {
        return myFile;
    }

    public void setMyFile(FormFile myFile) {
        this.myFile = myFile;
    }
}
