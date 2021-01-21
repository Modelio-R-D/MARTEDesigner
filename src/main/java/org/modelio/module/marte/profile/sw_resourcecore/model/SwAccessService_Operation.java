package org.modelio.module.marte.profile.sw_resourcecore.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.GrService_Operation;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a48481e6-f3f0-4651-8510-d017e5fb64ab")
public class SwAccessService_Operation extends GrService_Operation {
    @objid ("3f6fb662-73ab-4966-89da-0077ea810779")
    public SwAccessService_Operation() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWACCESSSERVICE_OPERATION);
                this.element.setName(MARTEResourceManager.getName("SwAccessService_Operation"));
    }

    @objid ("78ee93b6-45d1-4e42-bfed-abd104e0962d")
    public SwAccessService_Operation(Operation element) {
        super(element);
    }

    @objid ("e4ddf5c3-a7e0-44ef-b64d-06926d5c55ed")
    public boolean isisModifier() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ISMODIFIER, this.element);
    }

    @objid ("dc438db6-5d0d-45de-a9df-6c78c793526d")
    public void isisModifier(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ISMODIFIER,value);
    }

    @objid ("200f70d9-b05f-4e4f-82b0-ec090794efcf")
    public String getaccessedElement() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT, this.element);
    }

    @objid ("8b45d32e-9406-44ee-afd4-1ed1ac923792")
    public void setaccessedElement(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT, value);
    }

}
