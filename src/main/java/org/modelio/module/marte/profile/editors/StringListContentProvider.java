package org.modelio.module.marte.profile.editors;

import java.util.List;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class StringListContentProvider implements IStructuredContentProvider {
    @SuppressWarnings("unchecked")
    @Override
    public Object[] getElements(Object inputElement) {
        List<StringAdapter> elements = (List<StringAdapter>)inputElement;
        StringAdapter[] elementsArray = elements.toArray(new StringAdapter[elements.size()]);
        return elementsArray;
    }

    @Override
    public void dispose() {
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

}
