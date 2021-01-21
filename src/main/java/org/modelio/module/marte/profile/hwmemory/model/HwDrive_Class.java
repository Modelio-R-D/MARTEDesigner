package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b9a72d7d-b4c0-4769-ae89-9203e087ea52")
public class HwDrive_Class extends HwMemory_Class {
    @objid ("3237f578-bf38-430a-a9d3-6b058fbab193")
    public HwDrive_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDRIVE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWDRIVE_CLASSIFIER));
    }

    @objid ("a99b84aa-deee-4453-895c-0ceb2c36a6a0")
    public HwDrive_Class(Class element) {
        super(element);
    }

    @objid ("ea4f32dd-d58e-4e53-9bd2-47f97ddeef0a")
    public String getsectorSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, this.element);
    }

    @objid ("dfb42c7f-f832-4435-8734-3936711cf661")
    public void setsectorSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDRIVE_CLASSIFIER_HWDRIVE_CLASSIFIER_SECTORSIZE, value);
    }

}
