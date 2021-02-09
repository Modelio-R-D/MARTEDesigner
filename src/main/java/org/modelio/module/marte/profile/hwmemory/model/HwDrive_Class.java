package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDrive_Class extends HwMemory_Class {
    public HwDrive_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDRIVE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWDRIVE_CLASSIFIER));
    }

    public HwDrive_Class(Class element) {
        super(element);
    }

    public String getsectorSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, this.element);
    }

    public void setsectorSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, value);
    }

}
