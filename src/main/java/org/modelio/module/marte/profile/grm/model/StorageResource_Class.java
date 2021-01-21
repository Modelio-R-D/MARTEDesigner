package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("04fa24e3-1fd6-43ea-ad04-d5c96bfe1564")
public class StorageResource_Class extends Resource_Class {
    @objid ("16e16af8-c269-4f8b-a8cb-b8e01d328685")
    public StorageResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.STORAGERESOURCE_CLASSIFIER));
    }

    @objid ("bb6def01-9691-4ee6-b52f-f6aee0591842")
    public StorageResource_Class(final Class element) {
        super(element);
    }

    @objid ("851ee122-fbaa-45ac-b255-6bc7179dff13")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_CLASSIFIER_STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE, this.element);
    }

    @objid ("fd87458b-10c6-44c3-9328-cc842b16e2b2")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_CLASSIFIER_STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE, value);
    }

}
