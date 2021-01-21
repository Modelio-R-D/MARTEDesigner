package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("acccee19-0745-415d-93e8-f5b9d7c6f753")
public class RtFeature_OpaqueActionProperty implements IPropertyContent {
    @objid ("16af44c3-636e-4960-a46c-23d02157015c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("78a0c4b5-5203-4bfa-a727-d20719dc689c")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerNoteTypes.RTFEATURE_OPAQUEACTION_RTFEATURE_OPAQUEACTION_SPECIFICATION),
                ModelUtils.getNotesNames(elt, MARTEDesignerNoteTypes.RTFEATURE_OPAQUEACTION_RTFEATURE_OPAQUEACTION_SPECIFICATION));
    }

}
