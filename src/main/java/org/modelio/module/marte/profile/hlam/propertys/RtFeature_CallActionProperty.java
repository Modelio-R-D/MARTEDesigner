package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("22e4e799-2285-4eea-b280-9cce58990b68")
public class RtFeature_CallActionProperty implements IPropertyContent {
    @objid ("789b8b1e-009e-418f-80e0-bd27d3afa754")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("2d97932c-dc8b-4af6-8e0c-cc25d520293b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerNoteTypes.RTFEATURE_CALLACTION_RTFEATURE_CALLACTION_SPECIFICATION),
                ModelUtils.getNotesNames(elt, MARTEDesignerNoteTypes.RTFEATURE_CALLACTION_RTFEATURE_CALLACTION_SPECIFICATION));
    }

}
