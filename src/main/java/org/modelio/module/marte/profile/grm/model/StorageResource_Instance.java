package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ceb9bd77-f113-4151-a8cd-8cff0191474b")
public class StorageResource_Instance extends Resource_Instance {
    @objid ("c9b8d760-91cb-4511-97f3-365f1f4faf0d")
    public StorageResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("StorageResource_Instance"));
    }

    @objid ("be639b8c-e589-4b5b-bf37-99f8602720ad")
    public StorageResource_Instance(final Instance element) {
        super(element);
    }

    @objid ("1d503526-f623-4778-9dca-b7852f209add")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_INSTANCE_STORAGERESOURCE_INSTANCE_ELEMENTSIZE, this.element);
    }

    @objid ("b1d74f59-0570-4b59-98a4-8946df035d0b")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_INSTANCE_STORAGERESOURCE_INSTANCE_ELEMENTSIZE, value);
    }

}
