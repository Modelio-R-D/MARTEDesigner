package org.modelio.module.marte.profile.editors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

@objid ("e852248f-bd80-47f6-b4ff-87162323fa95")
public class StringListContentProvider implements IStructuredContentProvider {
    @objid ("508bb464-cc55-4153-986a-45cf27496926")
    @SuppressWarnings("unchecked")
    @Override
    public Object[] getElements(Object inputElement) {
        List<StringAdapter> elements = (List<StringAdapter>)inputElement;
        StringAdapter[] elementsArray = elements.toArray(new StringAdapter[elements.size()]);
        return elementsArray;
    }

    @objid ("48c1521d-a14a-488f-90ff-4f59d78a0031")
    @Override
    public void dispose() {
    }

    @objid ("ffdc8986-db31-4446-8573-e7d1ec0530e9")
    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

}
