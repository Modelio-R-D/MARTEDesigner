package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDrive_Node extends HwMemory_Node {
    public HwDrive_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDRIVE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWDRIVE_CLASSIFIER));
    }

    public HwDrive_Node(Node element) {
        super(element);
    }

    public String getsectorSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, this.element);
    }

    public void setsectorSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, value);
    }

}
