package dziuba.roma.actions;

import dziuba.roma.controllers.JournalistController;
import dziuba.roma.model.Journalist;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;
import org.jahia.tools.files.FileUpload;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author Roma Dziuba
 */
public class myForm extends org.jahia.bin.Action {

    @Override
    public ActionResult doExecute(HttpServletRequest httpServletRequest, RenderContext renderContext, Resource resource, JCRSessionWrapper jcrSessionWrapper, Map<String,
            List<String>> map, URLResolver urlResolver) throws Exception {
        final FileUpload fu = (FileUpload) httpServletRequest.getAttribute(FileUpload.FILEUPLOAD_ATTRIBUTE);
        DiskFileItem inputFile = fu.getFileItems().get("image");
        String img = new String(inputFile.get());
        Journalist j = new Journalist();
        j.setName(map.get("name").get(0));
        j.setSurname(map.get("surname").get(0));
        j.setBday(map.get("bday").get(0));
        j.setWorkplace(map.get("workPlace").get(0));
        j.setImage(img);
        JournalistController.addToList(j);
        JSONObject jsonObject = new JSONObject(j);
        return new ActionResult(HttpServletResponse.SC_OK, map.get("redirect").get(0), jsonObject);
    }
}
