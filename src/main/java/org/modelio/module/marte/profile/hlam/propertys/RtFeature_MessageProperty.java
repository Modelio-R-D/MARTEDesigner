package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e8ca6b5e-e7f4-4757-b3a6-a7d8f0b55595")
public class RtFeature_MessageProperty implements IPropertyContent {
    @objid ("8a059b76-7b5f-49dc-8352-7117257f5d04")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("45582439-4bb1-48db-9967-c225935a3a16")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerNoteTypes.RTFEATURE_MESSAGE_RTFEATURE_MESSAGE_SPECIFICATION),
                ModelUtils.getNotesNames(elt, MARTEDesignerNoteTypes.RTFEATURE_MESSAGE_RTFEATURE_MESSAGE_SPECIFICATION));
    }

}
