package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c14340df-1ca6-4493-b387-cac9f68c23a4")
public class RtFeature_SendSignalActionProperty implements IPropertyContent {
    @objid ("7da5a18c-4724-4517-9bf4-d8e90dd3f2eb")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("14c60cfa-aa18-4702-8910-620b2c50328b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerNoteTypes.RTFEATURE_SENDSIGNALACTION_RTFEATURE_SENDSIGNALACTION_SPECIFICATION),
                ModelUtils.getNotesNames(elt, MARTEDesignerNoteTypes.RTFEATURE_SENDSIGNALACTION_RTFEATURE_SENDSIGNALACTION_SPECIFICATION));
    }

}
