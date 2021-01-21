package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b703021f-2a82-4481-9e4e-92568400d9d4")
public class StorageResource_Node extends Resource_Node {
    @objid ("a4c9c961-db62-4e6a-b5b4-837595c85bab")
    public StorageResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.STORAGERESOURCE_CLASSIFIER));
    }

    @objid ("3ba38c22-70ba-40d0-a1f4-7c2260e40572")
    public StorageResource_Node(final Node element) {
        super(element);
    }

    @objid ("664e3963-6ed2-494e-b786-478fcaba342f")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_CLASSIFIER_STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE, this.element);
    }

    @objid ("ad97fc63-5fc8-4649-a2c0-9ac07237aae1")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_CLASSIFIER_STORAGERESOURCE_CLASSIFIER_ELEMENTSIZE, value);
    }

}
